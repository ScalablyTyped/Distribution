package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointResponse extends StObject {
  
  /**
    * Information about the deleted endpoint, including its current status (DELETING or DELETE_FAILED).
    */
  var VpcEndpointSummary: typings.awsSdk.clientsEsMod.VpcEndpointSummary
}
object DeleteVpcEndpointResponse {
  
  inline def apply(VpcEndpointSummary: VpcEndpointSummary): DeleteVpcEndpointResponse = {
    val __obj = js.Dynamic.literal(VpcEndpointSummary = VpcEndpointSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVpcEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setVpcEndpointSummary(value: VpcEndpointSummary): Self = StObject.set(x, "VpcEndpointSummary", value.asInstanceOf[js.Any])
  }
}
