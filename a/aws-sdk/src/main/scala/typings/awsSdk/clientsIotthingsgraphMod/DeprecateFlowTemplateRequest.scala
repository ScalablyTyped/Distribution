package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecateFlowTemplateRequest extends StObject {
  
  /**
    * The ID of the workflow to be deleted. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn
}
object DeprecateFlowTemplateRequest {
  
  inline def apply(id: Urn): DeprecateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateFlowTemplateRequest]
  }
  
  extension [Self <: DeprecateFlowTemplateRequest](x: Self) {
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
