package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceIamInstanceProfileAssociationRequest extends StObject {
  
  /**
    * The ID of the existing IAM instance profile association.
    */
  var AssociationId: IamInstanceProfileAssociationId
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: IamInstanceProfileSpecification
}
object ReplaceIamInstanceProfileAssociationRequest {
  
  inline def apply(
    AssociationId: IamInstanceProfileAssociationId,
    IamInstanceProfile: IamInstanceProfileSpecification
  ): ReplaceIamInstanceProfileAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], IamInstanceProfile = IamInstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceIamInstanceProfileAssociationRequest]
  }
  
  extension [Self <: ReplaceIamInstanceProfileAssociationRequest](x: Self) {
    
    inline def setAssociationId(value: IamInstanceProfileAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfile(value: IamInstanceProfileSpecification): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
  }
}
