package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateParameterConfiguration extends StObject {
  
  /**
    * The default value for the job template parameter.
    */
  var defaultValue: js.UndefOr[String1024] = js.undefined
  
  /**
    * The type of the job template parameter. Allowed values are: ‘STRING’, ‘NUMBER’.
    */
  var `type`: js.UndefOr[TemplateParameterDataType] = js.undefined
}
object TemplateParameterConfiguration {
  
  inline def apply(): TemplateParameterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateParameterConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateParameterConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: String1024): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setType(value: TemplateParameterDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
