package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicy extends StObject {
  
  /**
    * Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var lastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The details of the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * The name of the resource policy.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
}
object ResourcePolicy {
  
  inline def apply(): ResourcePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicy]
  }
  
  extension [Self <: ResourcePolicy](x: Self) {
    
    inline def setLastUpdatedTime(value: Timestamp): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
