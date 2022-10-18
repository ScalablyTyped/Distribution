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
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIamInstanceProfileAssociationsResult {
  
  inline def apply(): DescribeIamInstanceProfileAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIamInstanceProfileAssociationsResult]
  }
  
  extension [Self <: DescribeIamInstanceProfileAssociationsResult](x: Self) {
    
    inline def setIamInstanceProfileAssociations(value: IamInstanceProfileAssociationSet): Self = StObject.set(x, "IamInstanceProfileAssociations", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileAssociationsUndefined: Self = StObject.set(x, "IamInstanceProfileAssociations", js.undefined)
    
    inline def setIamInstanceProfileAssociationsVarargs(value: IamInstanceProfileAssociation*): Self = StObject.set(x, "IamInstanceProfileAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
