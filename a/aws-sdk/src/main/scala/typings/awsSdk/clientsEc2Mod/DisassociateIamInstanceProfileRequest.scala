package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateIamInstanceProfileRequest extends StObject {
  
  /**
    * The ID of the IAM instance profile association.
    */
  var AssociationId: IamInstanceProfileAssociationId
}
object DisassociateIamInstanceProfileRequest {
  
  inline def apply(AssociationId: IamInstanceProfileAssociationId): DisassociateIamInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateIamInstanceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateIamInstanceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociationId(value: IamInstanceProfileAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
  }
}
