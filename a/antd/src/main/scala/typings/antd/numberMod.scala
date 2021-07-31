package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.statisticUtilsMod.FormatConfig
import typings.antd.statisticUtilsMod.valueType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod extends Shortcut {
  
  @JSImport("antd/lib/statistic/Number", JSImport.Default)
  @js.native
  val default: FC[NumberProps] = js.native
  
  trait NumberProps
    extends StObject
       with FormatConfig {
    
    var value: valueType
  }
  object NumberProps {
    
    @scala.inline
    def apply(value: valueType): NumberProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberProps]
    }
    
    @scala.inline
    implicit class NumberPropsMutableBuilder[Self <: NumberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: valueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[NumberProps]
  
  /* This means you don't have to write `default`, but can instead just say `numberMod.foo` */
  override def _to: FC[NumberProps] = default
}
