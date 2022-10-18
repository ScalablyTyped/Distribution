package typings.antdMobile

import typings.antdMobile.esComponentsRadioRadioMod.RadioValue
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsRadioGroupMod {
  
  @JSImport("antd-mobile/es/components/radio/group", "Group")
  @js.native
  val Group: FC[RadioGroupProps] = js.native
  
  trait RadioGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultValue: js.UndefOr[RadioValue | Null] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* val */ RadioValue, Unit]] = js.undefined
    
    var value: js.UndefOr[RadioValue | Null] = js.undefined
  }
  object RadioGroupProps {
    
    inline def apply(): RadioGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupProps]
    }
    
    extension [Self <: RadioGroupProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultValue(value: RadioValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* val */ RadioValue => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
