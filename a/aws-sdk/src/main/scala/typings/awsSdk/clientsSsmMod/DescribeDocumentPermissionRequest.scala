package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentPermissionRequest extends StObject {
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[DocumentPermissionMaxResults] = js.undefined
  
  /**
    * The name of the document for which you are the owner.
    */
  var Name: DocumentName
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * The permission type for the document. The permission type can be Share.
    */
  var PermissionType: DocumentPermissionType
}
object DescribeDocumentPermissionRequest {
  
  inline def apply(Name: DocumentName, PermissionType: DocumentPermissionType): DescribeDocumentPermissionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionType = PermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentPermissionRequest]
  }
  
  extension [Self <: DescribeDocumentPermissionRequest](x: Self) {
    
    inline def setMaxResults(value: DocumentPermissionMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPermissionType(value: DocumentPermissionType): Self = StObject.set(x, "PermissionType", value.asInstanceOf[js.Any])
  }
}
