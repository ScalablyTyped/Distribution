package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListPolicyAttachmentsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * A list of ObjectIdentifiers to which the policy is attached.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
}
object BatchListPolicyAttachmentsResponse {
  
  inline def apply(): BatchListPolicyAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListPolicyAttachmentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchListPolicyAttachmentsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectIdentifiers(value: ObjectIdentifierList): Self = StObject.set(x, "ObjectIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifiersUndefined: Self = StObject.set(x, "ObjectIdentifiers", js.undefined)
    
    inline def setObjectIdentifiersVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "ObjectIdentifiers", js.Array(value*))
  }
}
