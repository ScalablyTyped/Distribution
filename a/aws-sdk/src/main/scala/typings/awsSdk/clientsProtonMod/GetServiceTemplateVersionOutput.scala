package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceTemplateVersionOutput extends StObject {
  
  /**
    * The detailed data of the requested service template version.
    */
  var serviceTemplateVersion: ServiceTemplateVersion
}
object GetServiceTemplateVersionOutput {
  
  inline def apply(serviceTemplateVersion: ServiceTemplateVersion): GetServiceTemplateVersionOutput = {
    val __obj = js.Dynamic.literal(serviceTemplateVersion = serviceTemplateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceTemplateVersionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceTemplateVersionOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceTemplateVersion(value: ServiceTemplateVersion): Self = StObject.set(x, "serviceTemplateVersion", value.asInstanceOf[js.Any])
  }
}
