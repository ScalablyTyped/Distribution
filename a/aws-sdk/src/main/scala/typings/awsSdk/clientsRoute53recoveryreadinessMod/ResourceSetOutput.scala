package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSetOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the resource set.
    */
  var ResourceSetArn: stringMax256
  
  /**
    * The name of the resource set.
    */
  var ResourceSetName: stringMax64PatternAAZAZ09Z
  
  /**
    * The resource type of the resources in the resource set. Enter one of the following values for resource type: AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup, AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume, AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck, AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
    */
  var ResourceSetType: stringPatternAWSAZaZ09AZaZ09
  
  /**
    * A list of resource objects.
    */
  var Resources: listOfResource
  
  var Tags: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.Tags] = js.undefined
}
object ResourceSetOutput {
  
  inline def apply(
    ResourceSetArn: stringMax256,
    ResourceSetName: stringMax64PatternAAZAZ09Z,
    ResourceSetType: stringPatternAWSAZaZ09AZaZ09,
    Resources: listOfResource
  ): ResourceSetOutput = {
    val __obj = js.Dynamic.literal(ResourceSetArn = ResourceSetArn.asInstanceOf[js.Any], ResourceSetName = ResourceSetName.asInstanceOf[js.Any], ResourceSetType = ResourceSetType.asInstanceOf[js.Any], Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSetOutput]
  }
  
  extension [Self <: ResourceSetOutput](x: Self) {
    
    inline def setResourceSetArn(value: stringMax256): Self = StObject.set(x, "ResourceSetArn", value.asInstanceOf[js.Any])
    
    inline def setResourceSetName(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "ResourceSetName", value.asInstanceOf[js.Any])
    
    inline def setResourceSetType(value: stringPatternAWSAZaZ09AZaZ09): Self = StObject.set(x, "ResourceSetType", value.asInstanceOf[js.Any])
    
    inline def setResources(value: listOfResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
