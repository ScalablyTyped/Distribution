package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPermissionRequest extends StObject {
  
  /**
    * The action that the principal can use on the function. For example, lambda:InvokeFunction or lambda:GetFunction.
    */
  var Action: typings.awsSdk.clientsLambdaMod.Action
  
  /**
    * For Alexa Smart Home functions, a token that must be supplied by the invoker.
    */
  var EventSourceToken: js.UndefOr[typings.awsSdk.clientsLambdaMod.EventSourceToken] = js.undefined
  
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.clientsLambdaMod.FunctionName
  
  /**
    * The type of authentication that your function URL uses. Set to AWS_IAM if you want to restrict access to authenticated IAM users only. Set to NONE if you want to bypass IAM authentication to create a public endpoint. For more information, see  Security and auth model for Lambda function URLs.
    */
  var FunctionUrlAuthType: js.UndefOr[typings.awsSdk.clientsLambdaMod.FunctionUrlAuthType] = js.undefined
  
  /**
    * The Amazon Web Services service or account that invokes the function. If you specify a service, use SourceArn or SourceAccount to limit who can invoke the function through that service.
    */
  var Principal: typings.awsSdk.clientsLambdaMod.Principal
  
  /**
    * The identifier for your organization in Organizations. Use this to grant permissions to all the Amazon Web Services accounts under this organization.
    */
  var PrincipalOrgID: js.UndefOr[typings.awsSdk.clientsLambdaMod.PrincipalOrgID] = js.undefined
  
  /**
    * Specify a version or alias to add permissions to a published version of the function.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.clientsLambdaMod.Qualifier] = js.undefined
  
  /**
    * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * For Amazon S3, the ID of the account that owns the resource. Use this together with SourceArn to ensure that the resource is owned by the specified account. It is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
    */
  var SourceAccount: js.UndefOr[SourceOwner] = js.undefined
  
  /**
    * For Amazon Web Services services, the ARN of the Amazon Web Services resource that invokes the function. For example, an Amazon S3 bucket or Amazon SNS topic. Note that Lambda configures the comparison using the StringLike operator.
    */
  var SourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A statement identifier that differentiates the statement from others in the same policy.
    */
  var StatementId: typings.awsSdk.clientsLambdaMod.StatementId
}
object AddPermissionRequest {
  
  inline def apply(Action: Action, FunctionName: FunctionName, Principal: Principal, StatementId: StatementId): AddPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionRequest]
  }
  
  extension [Self <: AddPermissionRequest](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setEventSourceToken(value: EventSourceToken): Self = StObject.set(x, "EventSourceToken", value.asInstanceOf[js.Any])
    
    inline def setEventSourceTokenUndefined: Self = StObject.set(x, "EventSourceToken", js.undefined)
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionUrlAuthType(value: FunctionUrlAuthType): Self = StObject.set(x, "FunctionUrlAuthType", value.asInstanceOf[js.Any])
    
    inline def setFunctionUrlAuthTypeUndefined: Self = StObject.set(x, "FunctionUrlAuthType", js.undefined)
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalOrgID(value: PrincipalOrgID): Self = StObject.set(x, "PrincipalOrgID", value.asInstanceOf[js.Any])
    
    inline def setPrincipalOrgIDUndefined: Self = StObject.set(x, "PrincipalOrgID", js.undefined)
    
    inline def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setSourceAccount(value: SourceOwner): Self = StObject.set(x, "SourceAccount", value.asInstanceOf[js.Any])
    
    inline def setSourceAccountUndefined: Self = StObject.set(x, "SourceAccount", js.undefined)
    
    inline def setSourceArn(value: Arn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setStatementId(value: StatementId): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
  }
}
