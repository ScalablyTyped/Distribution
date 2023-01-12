package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateSubnetCidrBlockRequest extends StObject {
  
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: SubnetCidrAssociationId
}
object DisassociateSubnetCidrBlockRequest {
  
  inline def apply(AssociationId: SubnetCidrAssociationId): DisassociateSubnetCidrBlockRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSubnetCidrBlockRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateSubnetCidrBlockRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociationId(value: SubnetCidrAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
  }
}
