package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIamInstanceProfileAssociationsResult extends StObject {
  
  /**
    * Information about the IAM instance profile associations.
    */
  var IamInstanceProfileAssociations: js.UndefOr[IamInstanceProfileAssociationSet] = js.undefined
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIamInstanceProfileAssociationsResult {
  
  inline def apply(): DescribeIamInstanceProfileAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIamInstanceProfileAssociationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIamInstanceProfileAssociationsResult] (val x: Self) extends AnyVal {
    
    inline def setIamInstanceProfileAssociations(value: IamInstanceProfileAssociationSet): Self = StObject.set(x, "IamInstanceProfileAssociations", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileAssociationsUndefined: Self = StObject.set(x, "IamInstanceProfileAssociations", js.undefined)
    
    inline def setIamInstanceProfileAssociationsVarargs(value: IamInstanceProfileAssociation*): Self = StObject.set(x, "IamInstanceProfileAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
