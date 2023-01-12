package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceTemplateOutput extends StObject {
  
  /**
    * The detailed data of the service template being deleted.
    */
  var serviceTemplate: js.UndefOr[ServiceTemplate] = js.undefined
}
object DeleteServiceTemplateOutput {
  
  inline def apply(): DeleteServiceTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteServiceTemplateOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceTemplateOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceTemplate(value: ServiceTemplate): Self = StObject.set(x, "serviceTemplate", value.asInstanceOf[js.Any])
    
    inline def setServiceTemplateUndefined: Self = StObject.set(x, "serviceTemplate", js.undefined)
  }
}
