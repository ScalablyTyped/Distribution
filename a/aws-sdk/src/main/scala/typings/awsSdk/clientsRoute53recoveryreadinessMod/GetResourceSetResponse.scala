package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceSetResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the resource set.
    */
  var ResourceSetArn: js.UndefOr[stringMax256] = js.undefined
  
  /**
    * The name of the resource set.
    */
  var ResourceSetName: js.UndefOr[stringMax64PatternAAZAZ09Z] = js.undefined
  
  /**
    * The resource type of the resources in the resource set. Enter one of the following values for resource type: AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup, AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume, AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck, AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
    */
  var ResourceSetType: js.UndefOr[stringPatternAWSAZaZ09AZaZ09] = js.undefined
  
  /**
    * A list of resource objects.
    */
  var Resources: js.UndefOr[listOfResource] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.Tags] = js.undefined
}
object GetResourceSetResponse {
  
  inline def apply(): GetResourceSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceSetResponse]
  }
  
  extension [Self <: GetResourceSetResponse](x: Self) {
    
    inline def setResourceSetArn(value: stringMax256): Self = StObject.set(x, "ResourceSetArn", value.asInstanceOf[js.Any])
    
    inline def setResourceSetArnUndefined: Self = StObject.set(x, "ResourceSetArn", js.undefined)
    
    inline def setResourceSetName(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "ResourceSetName", value.asInstanceOf[js.Any])
    
    inline def setResourceSetNameUndefined: Self = StObject.set(x, "ResourceSetName", js.undefined)
    
    inline def setResourceSetType(value: stringPatternAWSAZaZ09AZaZ09): Self = StObject.set(x, "ResourceSetType", value.asInstanceOf[js.Any])
    
    inline def setResourceSetTypeUndefined: Self = StObject.set(x, "ResourceSetType", js.undefined)
    
    inline def setResources(value: listOfResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
