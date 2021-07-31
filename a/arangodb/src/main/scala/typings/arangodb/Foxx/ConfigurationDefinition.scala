package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationDefinition extends StObject {
  
  var default: js.UndefOr[js.Any] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var required: Boolean
  
  var `type`: js.UndefOr[ConfigurationType] = js.undefined
}
object ConfigurationDefinition {
  
  @scala.inline
  def apply(required: Boolean): ConfigurationDefinition = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationDefinition]
  }
  
  @scala.inline
  implicit class ConfigurationDefinitionMutableBuilder[Self <: ConfigurationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ConfigurationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
