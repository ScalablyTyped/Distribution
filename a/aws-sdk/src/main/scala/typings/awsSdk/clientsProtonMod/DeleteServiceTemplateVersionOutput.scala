package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceTemplateVersionOutput extends StObject {
  
  /**
    * The detailed data of the service template version being deleted.
    */
  var serviceTemplateVersion: js.UndefOr[ServiceTemplateVersion] = js.undefined
}
object DeleteServiceTemplateVersionOutput {
  
  inline def apply(): DeleteServiceTemplateVersionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteServiceTemplateVersionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceTemplateVersionOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceTemplateVersion(value: ServiceTemplateVersion): Self = StObject.set(x, "serviceTemplateVersion", value.asInstanceOf[js.Any])
    
    inline def setServiceTemplateVersionUndefined: Self = StObject.set(x, "serviceTemplateVersion", js.undefined)
  }
}
