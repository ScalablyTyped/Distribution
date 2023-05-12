package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var applicationArn: Arn
  
  /**
    * The identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The timestamp when this application was created.
    */
  var creationTime: js.Date
  
  /**
    * The version of the application that is deployed.
    */
  var deployedVersion: js.UndefOr[DeployedVersionSummary] = js.undefined
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The type of the target platform for the application.
    */
  var engineType: EngineType
  
  /**
    * The identifier of the runtime environment where you want to deploy the application.
    */
  var environmentId: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The identifier of a customer managed key.
    */
  var kmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when you last started the application. Null until the application runs for the first time.
    */
  var lastStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest version of the application.
    */
  var latestVersion: ApplicationVersionSummary
  
  /**
    * The Amazon Resource Name (ARN) for the network load balancer listener created in your Amazon Web Services account. Amazon Web Services Mainframe Modernization creates this listener for you the first time you deploy an application.
    */
  var listenerArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The port associated with the network load balancer listener created in your Amazon Web Services account.
    */
  var listenerPorts: js.UndefOr[PortList] = js.undefined
  
  /**
    * The public DNS name of the load balancer created in your Amazon Web Services account.
    */
  var loadBalancerDnsName: js.UndefOr[String100] = js.undefined
  
  /**
    * The list of log summaries. Each log summary includes the log type as well as the log group identifier. These are CloudWatch logs. Amazon Web Services Mainframe Modernization pushes the application log to CloudWatch under the customer's account.
    */
  var logGroups: js.UndefOr[LogGroupSummaries] = js.undefined
  
  /**
    * The unique identifier of the application.
    */
  var name: EntityName
  
  /**
    * The status of the application.
    */
  var status: ApplicationLifecycle
  
  /**
    * The reason for the reported status.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tags associated with the application.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Returns the Amazon Resource Names (ARNs) of the target groups that are attached to the network load balancer.
    */
  var targetGroupArns: js.UndefOr[ArnList] = js.undefined
}
object GetApplicationResponse {
  
  inline def apply(
    applicationArn: Arn,
    applicationId: Identifier,
    creationTime: js.Date,
    engineType: EngineType,
    latestVersion: ApplicationVersionSummary,
    name: EntityName,
    status: ApplicationLifecycle
  ): GetApplicationResponse = {
    val __obj = js.Dynamic.literal(applicationArn = applicationArn.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationArn(value: Arn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDeployedVersion(value: DeployedVersionSummary): Self = StObject.set(x, "deployedVersion", value.asInstanceOf[js.Any])
    
    inline def setDeployedVersionUndefined: Self = StObject.set(x, "deployedVersion", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setLastStartTime(value: js.Date): Self = StObject.set(x, "lastStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastStartTimeUndefined: Self = StObject.set(x, "lastStartTime", js.undefined)
    
    inline def setLatestVersion(value: ApplicationVersionSummary): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
    
    inline def setListenerArns(value: ArnList): Self = StObject.set(x, "listenerArns", value.asInstanceOf[js.Any])
    
    inline def setListenerArnsUndefined: Self = StObject.set(x, "listenerArns", js.undefined)
    
    inline def setListenerArnsVarargs(value: Arn*): Self = StObject.set(x, "listenerArns", js.Array(value*))
    
    inline def setListenerPorts(value: PortList): Self = StObject.set(x, "listenerPorts", value.asInstanceOf[js.Any])
    
    inline def setListenerPortsUndefined: Self = StObject.set(x, "listenerPorts", js.undefined)
    
    inline def setListenerPortsVarargs(value: Integer*): Self = StObject.set(x, "listenerPorts", js.Array(value*))
    
    inline def setLoadBalancerDnsName(value: String100): Self = StObject.set(x, "loadBalancerDnsName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerDnsNameUndefined: Self = StObject.set(x, "loadBalancerDnsName", js.undefined)
    
    inline def setLogGroups(value: LogGroupSummaries): Self = StObject.set(x, "logGroups", value.asInstanceOf[js.Any])
    
    inline def setLogGroupsUndefined: Self = StObject.set(x, "logGroups", js.undefined)
    
    inline def setLogGroupsVarargs(value: LogGroupSummary*): Self = StObject.set(x, "logGroups", js.Array(value*))
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ApplicationLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargetGroupArns(value: ArnList): Self = StObject.set(x, "targetGroupArns", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupArnsUndefined: Self = StObject.set(x, "targetGroupArns", js.undefined)
    
    inline def setTargetGroupArnsVarargs(value: Arn*): Self = StObject.set(x, "targetGroupArns", js.Array(value*))
  }
}
