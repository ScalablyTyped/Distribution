package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceIamInstanceProfileAssociationResult extends StObject {
  
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typings.awsSdk.clientsEc2Mod.IamInstanceProfileAssociation] = js.undefined
}
object ReplaceIamInstanceProfileAssociationResult {
  
  inline def apply(): ReplaceIamInstanceProfileAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceIamInstanceProfileAssociationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceIamInstanceProfileAssociationResult] (val x: Self) extends AnyVal {
    
    inline def setIamInstanceProfileAssociation(value: IamInstanceProfileAssociation): Self = StObject.set(x, "IamInstanceProfileAssociation", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileAssociationUndefined: Self = StObject.set(x, "IamInstanceProfileAssociation", js.undefined)
  }
}
