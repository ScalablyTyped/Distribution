package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecateSystemTemplateRequest extends StObject {
  
  /**
    * The ID of the system to delete. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn
}
object DeprecateSystemTemplateRequest {
  
  inline def apply(id: Urn): DeprecateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateSystemTemplateRequest]
  }
  
  extension [Self <: DeprecateSystemTemplateRequest](x: Self) {
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
