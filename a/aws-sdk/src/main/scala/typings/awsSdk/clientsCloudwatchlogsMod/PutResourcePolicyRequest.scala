package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * Details of the new policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. This parameter is required. The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to the specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log group or log stream. CloudWatch Logs also supports aws:SourceArn and aws:SourceAccount condition context keys. In the example resource policy, you would replace the value of SourceArn with the resource making the call from Route 53 to CloudWatch Logs and replace the value of SourceAccount with the Amazon Web Services account ID making that call.   { "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action": "logs:PutLogEvents", "Resource": "logArn", "Condition": { "ArnLike": { "aws:SourceArn": "myRoute53ResourceArn" }, "StringEquals": { "aws:SourceAccount": "myAwsAccountId" } } } ] } 
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * Name of the new policy. This parameter is required.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
}
object PutResourcePolicyRequest {
  
  inline def apply(): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  extension [Self <: PutResourcePolicyRequest](x: Self) {
    
    inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
