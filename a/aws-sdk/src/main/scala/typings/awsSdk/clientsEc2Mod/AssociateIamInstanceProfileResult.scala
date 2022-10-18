package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateIamInstanceProfileResult extends StObject {
  
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typings.awsSdk.clientsEc2Mod.IamInstanceProfileAssociation] = js.undefined
}
object AssociateIamInstanceProfileResult {
  
  inline def apply(): AssociateIamInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateIamInstanceProfileResult]
  }
  
  extension [Self <: AssociateIamInstanceProfileResult](x: Self) {
    
    inline def setIamInstanceProfileAssociation(value: IamInstanceProfileAssociation): Self = StObject.set(x, "IamInstanceProfileAssociation", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileAssociationUndefined: Self = StObject.set(x, "IamInstanceProfileAssociation", js.undefined)
  }
}
