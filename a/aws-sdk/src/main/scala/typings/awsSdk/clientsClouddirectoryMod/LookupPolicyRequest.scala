package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: Arn
  
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Reference that identifies the object whose policies will be looked up.
    */
  var ObjectReference: typings.awsSdk.clientsClouddirectoryMod.ObjectReference
}
object LookupPolicyRequest {
  
  inline def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): LookupPolicyRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupPolicyRequest]
  }
  
  extension [Self <: LookupPolicyRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
