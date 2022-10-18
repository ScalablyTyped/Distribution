package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libStatisticUtilsMod.FormatConfig
import typings.antd.libStatisticUtilsMod.valueType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatisticNumberMod extends Shortcut {
  
  @JSImport("antd/lib/statistic/Number", JSImport.Default)
  @js.native
  val default: FC[NumberProps] = js.native
  
  trait NumberProps
    extends StObject
       with FormatConfig {
    
    var value: valueType
  }
  object NumberProps {
    
    inline def apply(value: valueType): NumberProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberProps]
    }
    
    extension [Self <: NumberProps](x: Self) {
      
      inline def setValue(value: valueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[NumberProps]
  
  /* This means you don't have to write `default`, but can instead just say `libStatisticNumberMod.foo` */
  override def _to: FC[NumberProps] = default
}
