package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.BindingPropertyName
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyName
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.InputOrOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputMapping
  extends StObject
     with InputOrOutput {
  
  var required: Boolean
}
object InputMapping {
  
  inline def apply(bindingPropertyName: BindingPropertyName, classPropertyName: ClassPropertyName, required: Boolean): InputMapping = {
    val __obj = js.Dynamic.literal(bindingPropertyName = bindingPropertyName.asInstanceOf[js.Any], classPropertyName = classPropertyName.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputMapping] (val x: Self) extends AnyVal {
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
