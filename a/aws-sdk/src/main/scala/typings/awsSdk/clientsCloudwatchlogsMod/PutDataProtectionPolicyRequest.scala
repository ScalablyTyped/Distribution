package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDataProtectionPolicyRequest extends StObject {
  
  /**
    * Specify either the log group name or log group ARN.
    */
  var logGroupIdentifier: LogGroupIdentifier
  
  /**
    * Specify the data protection policy, in JSON. This policy must include two JSON blocks:   The first block must include both a DataIdentifer array and an Operation property with an Audit action. The DataIdentifer array lists the types of sensitive data that you want to mask. For more information about the available options, see Types of data that you can mask. The Operation property with an Audit action is required to find the sensitive data terms. This Audit action must contain a FindingsDestination object. You can optionally use that FindingsDestination object to list one or more destinations to send audit findings to. If you specify destinations such as log groups, Kinesis Data Firehose streams, and S3 buckets, they must already exist.   The second block must include both a DataIdentifer array and an Operation property with an Deidentify action. The DataIdentifer array must exactly match the DataIdentifer array in the first block of the policy. The Operation property with the Deidentify action is what actually masks the data, and it must contain the  "MaskConfig": {} object. The  "MaskConfig": {} object must be empty.   For an example data protection policy, see the Examples section on this page.  The contents of two DataIdentifer arrays must match exactly. 
    */
  var policyDocument: DataProtectionPolicyDocument
}
object PutDataProtectionPolicyRequest {
  
  inline def apply(logGroupIdentifier: LogGroupIdentifier, policyDocument: DataProtectionPolicyDocument): PutDataProtectionPolicyRequest = {
    val __obj = js.Dynamic.literal(logGroupIdentifier = logGroupIdentifier.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataProtectionPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutDataProtectionPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setLogGroupIdentifier(value: LogGroupIdentifier): Self = StObject.set(x, "logGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocument(value: DataProtectionPolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
  }
}
