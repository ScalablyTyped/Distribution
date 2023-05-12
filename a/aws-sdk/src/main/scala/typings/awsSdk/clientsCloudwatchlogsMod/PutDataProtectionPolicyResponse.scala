package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDataProtectionPolicyResponse extends StObject {
  
  /**
    * The date and time that this policy was most recently updated.
    */
  var lastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The log group name or ARN that you specified in your request.
    */
  var logGroupIdentifier: js.UndefOr[LogGroupIdentifier] = js.undefined
  
  /**
    * The data protection policy used for this log group.
    */
  var policyDocument: js.UndefOr[DataProtectionPolicyDocument] = js.undefined
}
object PutDataProtectionPolicyResponse {
  
  inline def apply(): PutDataProtectionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDataProtectionPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutDataProtectionPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setLastUpdatedTime(value: Timestamp): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setLogGroupIdentifier(value: LogGroupIdentifier): Self = StObject.set(x, "logGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLogGroupIdentifierUndefined: Self = StObject.set(x, "logGroupIdentifier", js.undefined)
    
    inline def setPolicyDocument(value: DataProtectionPolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
  }
}
