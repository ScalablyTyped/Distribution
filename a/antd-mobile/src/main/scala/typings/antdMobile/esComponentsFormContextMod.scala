package typings.antdMobile

import typings.antdMobile.anon.Metadestroybooleanundefin
import typings.antdMobile.antdMobileStrings.`text-optional`
import typings.antdMobile.antdMobileStrings.`text-required`
import typings.antdMobile.antdMobileStrings.asterisk
import typings.antdMobile.antdMobileStrings.none
import typings.antdMobile.esComponentsFormMod.FormLayout
import typings.rcFieldForm.esInterfaceMod.InternalNamePath
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsFormContextMod {
  
  @JSImport("antd-mobile/es/components/form/context", "FormContext")
  @js.native
  val FormContext: Context[FormContextType] = js.native
  
  @JSImport("antd-mobile/es/components/form/context", "NoStyleItemContext")
  @js.native
  val NoStyleItemContext: Context[OnSubMetaChange | Null] = js.native
  
  @JSImport("antd-mobile/es/components/form/context", "defaultFormContext")
  @js.native
  val defaultFormContext: FormContextType = js.native
  
  trait FormContextType extends StObject {
    
    var disabled: Boolean
    
    var hasFeedback: Boolean
    
    var layout: FormLayout
    
    var name: js.UndefOr[String] = js.undefined
    
    var requiredMarkStyle: asterisk | `text-required` | `text-optional` | none
  }
  object FormContextType {
    
    inline def apply(
      disabled: Boolean,
      hasFeedback: Boolean,
      layout: FormLayout,
      requiredMarkStyle: asterisk | `text-required` | `text-optional` | none
    ): FormContextType = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hasFeedback = hasFeedback.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], requiredMarkStyle = requiredMarkStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormContextType]
    }
    
    extension [Self <: FormContextType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: FormLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequiredMarkStyle(value: asterisk | `text-required` | `text-optional` | none): Self = StObject.set(x, "requiredMarkStyle", value.asInstanceOf[js.Any])
    }
  }
  
  type OnSubMetaChange = js.Function2[/* meta */ Metadestroybooleanundefin, /* namePath */ InternalNamePath, Unit]
}
