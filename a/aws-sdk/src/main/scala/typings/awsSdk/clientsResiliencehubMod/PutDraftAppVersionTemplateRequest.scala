package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDraftAppVersionTemplateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * A JSON string that provides information about your application structure. To learn more about the appTemplateBody template, see the sample template provided in the Examples section. The appTemplateBody JSON string has the following structure:     resources   The list of logical resources that must be included in the Resilience Hub application. Type: Array  Don't add the resources that you want to exclude.  Each resources array item includes the following fields:     logicalResourceId   The logical identifier of the resource. Type: Object Each logicalResourceId object includes the following fields:    identifier  The identifier of the resource. Type: String    logicalStackName  The name of the CloudFormation stack this resource belongs to. Type: String    resourceGroupName  The name of the resource group this resource belongs to. Type: String    terraformSourceName  The name of the Terraform S3 state file this resource belongs to. Type: String    eksSourceName  The name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.  This parameter accepts values in "eks-cluster/namespace" format.  Type: String       type   The type of resource. Type: string     name   The name of the resource. Type: String    additionalInfo  Additional configuration parameters for an Resilience Hub application. If you want to implement additionalInfo through the Resilience Hub console rather than using an API call, see Configure the application configuration parameters.  Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one associated account. Key: "failover-regions"  Value: "[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"         appComponents   The list of Application Components that this resource belongs to. If an Application Component is not part of the Resilience Hub application, it will be added. Type: Array Each appComponents array item includes the following fields:    name  The name of the Application Component. Type: String    type  The type of Application Component. For more information about the types of Application Component, see Grouping resources in an AppComponent. Type: String    resourceNames  The list of included resources that are assigned to the Application Component. Type: Array of strings    additionalInfo  Additional configuration parameters for an Resilience Hub application. If you want to implement additionalInfo through the Resilience Hub console rather than using an API call, see Configure the application configuration parameters.  Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one associated account. Key: "failover-regions"  Value: "[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"         excludedResources   The list of logical resource identifiers to be excluded from the application. Type: Array  Don't add the resources that you want to include.  Each excludedResources array item includes the following fields:     logicalResourceIds   The logical identifier of the resource. Type: Object  You can configure only one of the following fields:    logicalStackName     resourceGroupName     terraformSourceName     eksSourceName     Each logicalResourceIds object includes the following fields:    identifier  The identifier of the resource. Type: String    logicalStackName  The name of the CloudFormation stack this resource belongs to. Type: String    resourceGroupName  The name of the resource group this resource belongs to. Type: String    terraformSourceName  The name of the Terraform S3 state file this resource belongs to. Type: String    eksSourceName  The name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.  This parameter accepts values in "eks-cluster/namespace" format.  Type: String         version   The Resilience Hub application version.    additionalInfo  Additional configuration parameters for an Resilience Hub application. If you want to implement additionalInfo through the Resilience Hub console rather than using an API call, see Configure the application configuration parameters.  Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one associated account. Key: "failover-regions"  Value: "[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"    
    */
  var appTemplateBody: AppTemplateBody
}
object PutDraftAppVersionTemplateRequest {
  
  inline def apply(appArn: Arn, appTemplateBody: AppTemplateBody): PutDraftAppVersionTemplateRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appTemplateBody = appTemplateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDraftAppVersionTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutDraftAppVersionTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppTemplateBody(value: AppTemplateBody): Self = StObject.set(x, "appTemplateBody", value.asInstanceOf[js.Any])
  }
}
