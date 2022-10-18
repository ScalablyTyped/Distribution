package typings.antdMobile

import typings.antdMobile.esComponentsCheckboxCheckboxMod.CheckboxValue
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCheckboxGroupMod {
  
  @JSImport("antd-mobile/es/components/checkbox/group", "Group")
  @js.native
  val Group: FC[CheckboxGroupProps] = js.native
  
  trait CheckboxGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultValue: js.UndefOr[js.Array[CheckboxValue]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* val */ js.Array[CheckboxValue], Unit]] = js.undefined
    
    var value: js.UndefOr[js.Array[CheckboxValue]] = js.undefined
  }
  object CheckboxGroupProps {
    
    inline def apply(): CheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxGroupProps]
    }
    
    extension [Self <: CheckboxGroupProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultValue(value: js.Array[CheckboxValue]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: CheckboxValue*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* val */ js.Array[CheckboxValue] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: js.Array[CheckboxValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: CheckboxValue*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
