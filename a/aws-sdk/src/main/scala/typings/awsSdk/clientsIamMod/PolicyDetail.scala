package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDetail extends StObject {
  
  /**
    * The policy document.
    */
  var PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
}
object PolicyDetail {
  
  inline def apply(): PolicyDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyDetail] (val x: Self) extends AnyVal {
    
    inline def setPolicyDocument(value: policyDocumentType): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    inline def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
