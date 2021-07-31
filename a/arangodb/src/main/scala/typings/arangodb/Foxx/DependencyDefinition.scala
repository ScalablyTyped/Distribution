package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyDefinition extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var multiple: Boolean
  
  var name: String
  
  var required: Boolean
  
  var version: String
}
object DependencyDefinition {
  
  @scala.inline
  def apply(multiple: Boolean, name: String, required: Boolean, version: String): DependencyDefinition = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyDefinition]
  }
  
  @scala.inline
  implicit class DependencyDefinitionMutableBuilder[Self <: DependencyDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
