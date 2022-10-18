package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRateMod extends Shortcut {
  
  @JSImport("antd/lib/rate", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RateProps & RefAttributes[Any]] = js.native
  
  trait RateProps
    extends StObject
       with typings.rcRate.esRateMod.RateProps {
    
    var tooltips: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RateProps {
    
    inline def apply(): RateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateProps]
    }
    
    extension [Self <: RateProps](x: Self) {
      
      inline def setTooltips(value: js.Array[String]): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      inline def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      
      inline def setTooltipsVarargs(value: String*): Self = StObject.set(x, "tooltips", js.Array(value*))
    }
  }
  
  type _To = ForwardRefExoticComponent[RateProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libRateMod.foo` */
  override def _to: ForwardRefExoticComponent[RateProps & RefAttributes[Any]] = default
}
