package typings.antdMobile

import typings.antdMobile.antdMobileStrings.checkbox
import typings.antdMobile.antdMobileStrings.radio
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCheckboxNativeInputMod {
  
  @JSImport("antd-mobile/es/components/checkbox/native-input", "NativeInput")
  @js.native
  val NativeInput: FC[Props] = js.native
  
  trait Props extends StObject {
    
    var checked: Boolean
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    def onChange(checked: Boolean): Unit
    
    var `type`: checkbox | radio
  }
  object Props {
    
    inline def apply(checked: Boolean, onChange: Boolean => Unit, `type`: checkbox | radio): Props = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnChange(value: Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setType(value: checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
