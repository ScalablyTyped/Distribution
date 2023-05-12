package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPolicySummary extends StObject {
  
  /**
    * The Epoch time when the access policy was created.
    */
  var createdDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The description of the access policy.
    */
  var description: js.UndefOr[PolicyDescription] = js.undefined
  
  /**
    * The date and time when the collection was last modified.
    */
  var lastModifiedDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the access policy.
    */
  var name: js.UndefOr[PolicyName] = js.undefined
  
  /**
    * The version of the policy.
    */
  var policyVersion: js.UndefOr[PolicyVersion] = js.undefined
  
  /**
    * The type of access policy. Currently the only available type is data.
    */
  var `type`: js.UndefOr[AccessPolicyType] = js.undefined
}
object AccessPolicySummary {
  
  inline def apply(): AccessPolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPolicySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPolicySummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: Long): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: PolicyDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModifiedDate(value: Long): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setName(value: PolicyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicyVersion(value: PolicyVersion): Self = StObject.set(x, "policyVersion", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionUndefined: Self = StObject.set(x, "policyVersion", js.undefined)
    
    inline def setType(value: AccessPolicyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
