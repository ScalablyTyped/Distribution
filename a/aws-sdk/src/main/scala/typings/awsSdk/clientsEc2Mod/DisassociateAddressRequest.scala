package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateAddressRequest extends StObject {
  
  /**
    * [EC2-VPC] The association ID. Required for EC2-VPC.
    */
  var AssociationId: js.UndefOr[ElasticIpAssociationId] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}
object DisassociateAddressRequest {
  
  inline def apply(): DisassociateAddressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociationId(value: ElasticIpAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
