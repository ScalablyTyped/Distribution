package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridRowContextMod extends Shortcut {
  
  @JSImport("antd/lib/grid/RowContext", JSImport.Default)
  @js.native
  val default: Context[RowContextState] = js.native
  
  trait RowContextState extends StObject {
    
    var gutter: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var supportFlexGap: js.UndefOr[Boolean] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object RowContextState {
    
    inline def apply(): RowContextState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowContextState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowContextState] (val x: Self) extends AnyVal {
      
      inline def setGutter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setSupportFlexGap(value: Boolean): Self = StObject.set(x, "supportFlexGap", value.asInstanceOf[js.Any])
      
      inline def setSupportFlexGapUndefined: Self = StObject.set(x, "supportFlexGap", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = Context[RowContextState]
  
  /* This means you don't have to write `default`, but can instead just say `libGridRowContextMod.foo` */
  override def _to: Context[RowContextState] = default
}
