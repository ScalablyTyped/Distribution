package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateVpcCidrBlockRequest extends StObject {
  
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: VpcCidrAssociationId
}
object DisassociateVpcCidrBlockRequest {
  
  inline def apply(AssociationId: VpcCidrAssociationId): DisassociateVpcCidrBlockRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVpcCidrBlockRequest]
  }
  
  extension [Self <: DisassociateVpcCidrBlockRequest](x: Self) {
    
    inline def setAssociationId(value: VpcCidrAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
  }
}
