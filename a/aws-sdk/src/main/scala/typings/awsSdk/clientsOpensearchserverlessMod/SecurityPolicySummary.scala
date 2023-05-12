package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPolicySummary extends StObject {
  
  /**
    * The date the policy was created.
    */
  var createdDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The description of the security policy.
    */
  var description: js.UndefOr[PolicyDescription] = js.undefined
  
  /**
    * The timestamp of when the policy was last modified.
    */
  var lastModifiedDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the policy.
    */
  var name: js.UndefOr[PolicyName] = js.undefined
  
  /**
    * The version of the policy.
    */
  var policyVersion: js.UndefOr[PolicyVersion] = js.undefined
  
  /**
    * The type of security policy.
    */
  var `type`: js.UndefOr[SecurityPolicyType] = js.undefined
}
object SecurityPolicySummary {
  
  inline def apply(): SecurityPolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityPolicySummary] (val x: Self) extends AnyVal {
    
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
    
    inline def setType(value: SecurityPolicyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
