package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * Provides information about a REST API in version 1 of Amazon API Gateway.
    */
  var AwsApiGatewayRestApi: js.UndefOr[AwsApiGatewayRestApiDetails] = js.undefined
  
  /**
    * Provides information about a version 1 Amazon API Gateway stage.
    */
  var AwsApiGatewayStage: js.UndefOr[AwsApiGatewayStageDetails] = js.undefined
  
  /**
    * Provides information about a version 2 API in Amazon API Gateway.
    */
  var AwsApiGatewayV2Api: js.UndefOr[AwsApiGatewayV2ApiDetails] = js.undefined
  
  /**
    * Provides information about a version 2 stage for Amazon API Gateway.
    */
  var AwsApiGatewayV2Stage: js.UndefOr[AwsApiGatewayV2StageDetails] = js.undefined
  
  /**
    * Details for an autoscaling group.
    */
  var AwsAutoScalingAutoScalingGroup: js.UndefOr[AwsAutoScalingAutoScalingGroupDetails] = js.undefined
  
  /**
    * Provides details about a launch configuration.
    */
  var AwsAutoScalingLaunchConfiguration: js.UndefOr[AwsAutoScalingLaunchConfigurationDetails] = js.undefined
  
  /**
    * Provides details about an Backup backup plan. 
    */
  var AwsBackupBackupPlan: js.UndefOr[AwsBackupBackupPlanDetails] = js.undefined
  
  /**
    * Provides details about an Backup backup vault. 
    */
  var AwsBackupBackupVault: js.UndefOr[AwsBackupBackupVaultDetails] = js.undefined
  
  /**
    * Provides details about an Backup backup, or recovery point. 
    */
  var AwsBackupRecoveryPoint: js.UndefOr[AwsBackupRecoveryPointDetails] = js.undefined
  
  /**
    * Provides details about an Certificate Manager certificate.
    */
  var AwsCertificateManagerCertificate: js.UndefOr[AwsCertificateManagerCertificateDetails] = js.undefined
  
  /**
    * Details about an CloudFormation stack. A stack is a collection of Amazon Web Services resources that you can manage as a single unit.
    */
  var AwsCloudFormationStack: js.UndefOr[AwsCloudFormationStackDetails] = js.undefined
  
  /**
    * Details about a CloudFront distribution.
    */
  var AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails] = js.undefined
  
  /**
    * Provides details about a CloudTrail trail.
    */
  var AwsCloudTrailTrail: js.UndefOr[AwsCloudTrailTrailDetails] = js.undefined
  
  /**
    * Details about an Amazon CloudWatch alarm. An alarm allows you to monitor and receive alerts about your Amazon Web Services resources and applications across multiple Regions.
    */
  var AwsCloudWatchAlarm: js.UndefOr[AwsCloudWatchAlarmDetails] = js.undefined
  
  /**
    * Details for an CodeBuild project.
    */
  var AwsCodeBuildProject: js.UndefOr[AwsCodeBuildProjectDetails] = js.undefined
  
  /**
    * Details about a DynamoDB table.
    */
  var AwsDynamoDbTable: js.UndefOr[AwsDynamoDbTableDetails] = js.undefined
  
  /**
    * Details about an Elastic IP address.
    */
  var AwsEc2Eip: js.UndefOr[AwsEc2EipDetails] = js.undefined
  
  /**
    * Details about an EC2 instance related to a finding.
    */
  var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined
  
  var AwsEc2LaunchTemplate: js.UndefOr[AwsEc2LaunchTemplateDetails] = js.undefined
  
  /**
    * Details about an EC2 network access control list (ACL).
    */
  var AwsEc2NetworkAcl: js.UndefOr[AwsEc2NetworkAclDetails] = js.undefined
  
  /**
    * Details for an EC2 network interface.
    */
  var AwsEc2NetworkInterface: js.UndefOr[AwsEc2NetworkInterfaceDetails] = js.undefined
  
  /**
    *  Provides details about a route table. A route table contains a set of rules, called routes, that determine where to direct network traffic from your subnet or gateway. 
    */
  var AwsEc2RouteTable: js.UndefOr[AwsEc2RouteTableDetails] = js.undefined
  
  /**
    * Details for an EC2 security group.
    */
  var AwsEc2SecurityGroup: js.UndefOr[AwsEc2SecurityGroupDetails] = js.undefined
  
  /**
    * Details about a subnet in Amazon EC2.
    */
  var AwsEc2Subnet: js.UndefOr[AwsEc2SubnetDetails] = js.undefined
  
  /**
    * Details about an Amazon EC2 transit gateway that interconnects your virtual private clouds (VPC) and on-premises networks.
    */
  var AwsEc2TransitGateway: js.UndefOr[AwsEc2TransitGatewayDetails] = js.undefined
  
  /**
    * Details for an Amazon EC2 volume.
    */
  var AwsEc2Volume: js.UndefOr[AwsEc2VolumeDetails] = js.undefined
  
  /**
    * Details for an Amazon EC2 VPC.
    */
  var AwsEc2Vpc: js.UndefOr[AwsEc2VpcDetails] = js.undefined
  
  /**
    * Details about the service configuration for a VPC endpoint service.
    */
  var AwsEc2VpcEndpointService: js.UndefOr[AwsEc2VpcEndpointServiceDetails] = js.undefined
  
  /**
    * Details about an Amazon EC2 VPC peering connection. A VPC peering connection is a networking connection between two VPCs that enables you to route traffic between them privately. 
    */
  var AwsEc2VpcPeeringConnection: js.UndefOr[AwsEc2VpcPeeringConnectionDetails] = js.undefined
  
  /**
    * Details about an Amazon EC2 VPN connection.
    */
  var AwsEc2VpnConnection: js.UndefOr[AwsEc2VpnConnectionDetails] = js.undefined
  
  /**
    * Information about an Amazon ECR image.
    */
  var AwsEcrContainerImage: js.UndefOr[AwsEcrContainerImageDetails] = js.undefined
  
  /**
    * Information about an Amazon Elastic Container Registry repository.
    */
  var AwsEcrRepository: js.UndefOr[AwsEcrRepositoryDetails] = js.undefined
  
  /**
    * Details about an Amazon ECS cluster.
    */
  var AwsEcsCluster: js.UndefOr[AwsEcsClusterDetails] = js.undefined
  
  /**
    * Provides information about a Docker container that's part of a task. 
    */
  var AwsEcsContainer: js.UndefOr[AwsEcsContainerDetails] = js.undefined
  
  /**
    * Details about a service within an ECS cluster.
    */
  var AwsEcsService: js.UndefOr[AwsEcsServiceDetails] = js.undefined
  
  /**
    * Details about a task in a cluster. 
    */
  var AwsEcsTask: js.UndefOr[AwsEcsTaskDetails] = js.undefined
  
  /**
    * Details about a task definition. A task definition describes the container and volume definitions of an Amazon Elastic Container Service task.
    */
  var AwsEcsTaskDefinition: js.UndefOr[AwsEcsTaskDefinitionDetails] = js.undefined
  
  /**
    * Details about an Amazon EFS access point. An access point is an application-specific view into an EFS file system that applies an operating system user and group, and a file system path, to any file system request made through the access point. 
    */
  var AwsEfsAccessPoint: js.UndefOr[AwsEfsAccessPointDetails] = js.undefined
  
  /**
    * Details about an Amazon EKS cluster.
    */
  var AwsEksCluster: js.UndefOr[AwsEksClusterDetails] = js.undefined
  
  /**
    * Details about an Elastic Beanstalk environment.
    */
  var AwsElasticBeanstalkEnvironment: js.UndefOr[AwsElasticBeanstalkEnvironmentDetails] = js.undefined
  
  /**
    * Details for an Elasticsearch domain.
    */
  var AwsElasticsearchDomain: js.UndefOr[AwsElasticsearchDomainDetails] = js.undefined
  
  /**
    * Contains details about a Classic Load Balancer.
    */
  var AwsElbLoadBalancer: js.UndefOr[AwsElbLoadBalancerDetails] = js.undefined
  
  /**
    * Details about a load balancer.
    */
  var AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails] = js.undefined
  
  /**
    * Details about an IAM access key related to a finding.
    */
  var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.undefined
  
  /**
    * Contains details about an IAM group.
    */
  var AwsIamGroup: js.UndefOr[AwsIamGroupDetails] = js.undefined
  
  /**
    * Details about an IAM permissions policy.
    */
  var AwsIamPolicy: js.UndefOr[AwsIamPolicyDetails] = js.undefined
  
  /**
    * Details about an IAM role.
    */
  var AwsIamRole: js.UndefOr[AwsIamRoleDetails] = js.undefined
  
  /**
    * Details about an IAM user.
    */
  var AwsIamUser: js.UndefOr[AwsIamUserDetails] = js.undefined
  
  /**
    * Details about an Amazon Kinesis data stream.
    */
  var AwsKinesisStream: js.UndefOr[AwsKinesisStreamDetails] = js.undefined
  
  /**
    * Details about an KMS key.
    */
  var AwsKmsKey: js.UndefOr[AwsKmsKeyDetails] = js.undefined
  
  /**
    * Details about a Lambda function.
    */
  var AwsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails] = js.undefined
  
  /**
    * Details for a Lambda layer version.
    */
  var AwsLambdaLayerVersion: js.UndefOr[AwsLambdaLayerVersionDetails] = js.undefined
  
  /**
    * Details about an Network Firewall firewall.
    */
  var AwsNetworkFirewallFirewall: js.UndefOr[AwsNetworkFirewallFirewallDetails] = js.undefined
  
  /**
    * Details about an Network Firewall firewall policy.
    */
  var AwsNetworkFirewallFirewallPolicy: js.UndefOr[AwsNetworkFirewallFirewallPolicyDetails] = js.undefined
  
  /**
    * Details about an Network Firewall rule group.
    */
  var AwsNetworkFirewallRuleGroup: js.UndefOr[AwsNetworkFirewallRuleGroupDetails] = js.undefined
  
  /**
    * Details about an Amazon OpenSearch Service domain.
    */
  var AwsOpenSearchServiceDomain: js.UndefOr[AwsOpenSearchServiceDomainDetails] = js.undefined
  
  /**
    * Details about an Amazon RDS database cluster.
    */
  var AwsRdsDbCluster: js.UndefOr[AwsRdsDbClusterDetails] = js.undefined
  
  /**
    * Details about an Amazon RDS database cluster snapshot.
    */
  var AwsRdsDbClusterSnapshot: js.UndefOr[AwsRdsDbClusterSnapshotDetails] = js.undefined
  
  /**
    * Details about an Amazon RDS database instance.
    */
  var AwsRdsDbInstance: js.UndefOr[AwsRdsDbInstanceDetails] = js.undefined
  
  /**
    * Details about an Amazon RDS DB security group.
    */
  var AwsRdsDbSecurityGroup: js.UndefOr[AwsRdsDbSecurityGroupDetails] = js.undefined
  
  /**
    * Details about an Amazon RDS database snapshot.
    */
  var AwsRdsDbSnapshot: js.UndefOr[AwsRdsDbSnapshotDetails] = js.undefined
  
  /**
    * Details about an RDS event notification subscription.
    */
  var AwsRdsEventSubscription: js.UndefOr[AwsRdsEventSubscriptionDetails] = js.undefined
  
  /**
    * Contains details about an Amazon Redshift cluster.
    */
  var AwsRedshiftCluster: js.UndefOr[AwsRedshiftClusterDetails] = js.undefined
  
  /**
    * Details about the Amazon S3 Public Access Block configuration for an account.
    */
  var AwsS3AccountPublicAccessBlock: js.UndefOr[AwsS3AccountPublicAccessBlockDetails] = js.undefined
  
  /**
    * Details about an S3 bucket related to a finding.
    */
  var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.undefined
  
  /**
    * Details about an S3 object related to a finding.
    */
  var AwsS3Object: js.UndefOr[AwsS3ObjectDetails] = js.undefined
  
  var AwsSageMakerNotebookInstance: js.UndefOr[AwsSageMakerNotebookInstanceDetails] = js.undefined
  
  /**
    * Details about a Secrets Manager secret.
    */
  var AwsSecretsManagerSecret: js.UndefOr[AwsSecretsManagerSecretDetails] = js.undefined
  
  /**
    * Details about an SNS topic.
    */
  var AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails] = js.undefined
  
  /**
    * Details about an SQS queue.
    */
  var AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails] = js.undefined
  
  /**
    * Provides information about the state of a patch on an instance based on the patch baseline that was used to patch the instance.
    */
  var AwsSsmPatchCompliance: js.UndefOr[AwsSsmPatchComplianceDetails] = js.undefined
  
  /**
    * Details about a rate-based rule for global resources.
    */
  var AwsWafRateBasedRule: js.UndefOr[AwsWafRateBasedRuleDetails] = js.undefined
  
  /**
    * Details about a rate-based rule for Regional resources.
    */
  var AwsWafRegionalRateBasedRule: js.UndefOr[AwsWafRegionalRateBasedRuleDetails] = js.undefined
  
  /**
    * Details about an WAF rule for Regional resources. 
    */
  var AwsWafRegionalRule: js.UndefOr[AwsWafRegionalRuleDetails] = js.undefined
  
  /**
    * Details about an WAF rule group for Regional resources. 
    */
  var AwsWafRegionalRuleGroup: js.UndefOr[AwsWafRegionalRuleGroupDetails] = js.undefined
  
  /**
    * Details about an WAF web access control list (web ACL) for Regional resources. 
    */
  var AwsWafRegionalWebAcl: js.UndefOr[AwsWafRegionalWebAclDetails] = js.undefined
  
  /**
    * Details about an WAF rule for global resources. 
    */
  var AwsWafRule: js.UndefOr[AwsWafRuleDetails] = js.undefined
  
  /**
    * Details about an WAF rule group for global resources. 
    */
  var AwsWafRuleGroup: js.UndefOr[AwsWafRuleGroupDetails] = js.undefined
  
  /**
    * Details for an WAF web ACL.
    */
  var AwsWafWebAcl: js.UndefOr[AwsWafWebAclDetails] = js.undefined
  
  var AwsWafv2RuleGroup: js.UndefOr[AwsWafv2RuleGroupDetails] = js.undefined
  
  var AwsWafv2WebAcl: js.UndefOr[AwsWafv2WebAclDetails] = js.undefined
  
  /**
    * Information about the encryption configuration for X-Ray.
    */
  var AwsXrayEncryptionConfig: js.UndefOr[AwsXrayEncryptionConfigDetails] = js.undefined
  
  /**
    * Details about a container resource related to a finding.
    */
  var Container: js.UndefOr[ContainerDetails] = js.undefined
  
  /**
    * Details about a resource that are not available in a type-specific details object. Use the Other object in the following cases.   The type-specific object does not contain all of the fields that you want to populate. In this case, first use the type-specific object to populate those fields. Use the Other object to populate the fields that are missing from the type-specific object.   The resource type does not have a corresponding object. This includes resources for which the type is Other.   
    */
  var Other: js.UndefOr[FieldMap] = js.undefined
}
object ResourceDetails {
  
  inline def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    
    inline def setAwsApiGatewayRestApi(value: AwsApiGatewayRestApiDetails): Self = StObject.set(x, "AwsApiGatewayRestApi", value.asInstanceOf[js.Any])
    
    inline def setAwsApiGatewayRestApiUndefined: Self = StObject.set(x, "AwsApiGatewayRestApi", js.undefined)
    
    inline def setAwsApiGatewayStage(value: AwsApiGatewayStageDetails): Self = StObject.set(x, "AwsApiGatewayStage", value.asInstanceOf[js.Any])
    
    inline def setAwsApiGatewayStageUndefined: Self = StObject.set(x, "AwsApiGatewayStage", js.undefined)
    
    inline def setAwsApiGatewayV2Api(value: AwsApiGatewayV2ApiDetails): Self = StObject.set(x, "AwsApiGatewayV2Api", value.asInstanceOf[js.Any])
    
    inline def setAwsApiGatewayV2ApiUndefined: Self = StObject.set(x, "AwsApiGatewayV2Api", js.undefined)
    
    inline def setAwsApiGatewayV2Stage(value: AwsApiGatewayV2StageDetails): Self = StObject.set(x, "AwsApiGatewayV2Stage", value.asInstanceOf[js.Any])
    
    inline def setAwsApiGatewayV2StageUndefined: Self = StObject.set(x, "AwsApiGatewayV2Stage", js.undefined)
    
    inline def setAwsAutoScalingAutoScalingGroup(value: AwsAutoScalingAutoScalingGroupDetails): Self = StObject.set(x, "AwsAutoScalingAutoScalingGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsAutoScalingAutoScalingGroupUndefined: Self = StObject.set(x, "AwsAutoScalingAutoScalingGroup", js.undefined)
    
    inline def setAwsAutoScalingLaunchConfiguration(value: AwsAutoScalingLaunchConfigurationDetails): Self = StObject.set(x, "AwsAutoScalingLaunchConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAwsAutoScalingLaunchConfigurationUndefined: Self = StObject.set(x, "AwsAutoScalingLaunchConfiguration", js.undefined)
    
    inline def setAwsBackupBackupPlan(value: AwsBackupBackupPlanDetails): Self = StObject.set(x, "AwsBackupBackupPlan", value.asInstanceOf[js.Any])
    
    inline def setAwsBackupBackupPlanUndefined: Self = StObject.set(x, "AwsBackupBackupPlan", js.undefined)
    
    inline def setAwsBackupBackupVault(value: AwsBackupBackupVaultDetails): Self = StObject.set(x, "AwsBackupBackupVault", value.asInstanceOf[js.Any])
    
    inline def setAwsBackupBackupVaultUndefined: Self = StObject.set(x, "AwsBackupBackupVault", js.undefined)
    
    inline def setAwsBackupRecoveryPoint(value: AwsBackupRecoveryPointDetails): Self = StObject.set(x, "AwsBackupRecoveryPoint", value.asInstanceOf[js.Any])
    
    inline def setAwsBackupRecoveryPointUndefined: Self = StObject.set(x, "AwsBackupRecoveryPoint", js.undefined)
    
    inline def setAwsCertificateManagerCertificate(value: AwsCertificateManagerCertificateDetails): Self = StObject.set(x, "AwsCertificateManagerCertificate", value.asInstanceOf[js.Any])
    
    inline def setAwsCertificateManagerCertificateUndefined: Self = StObject.set(x, "AwsCertificateManagerCertificate", js.undefined)
    
    inline def setAwsCloudFormationStack(value: AwsCloudFormationStackDetails): Self = StObject.set(x, "AwsCloudFormationStack", value.asInstanceOf[js.Any])
    
    inline def setAwsCloudFormationStackUndefined: Self = StObject.set(x, "AwsCloudFormationStack", js.undefined)
    
    inline def setAwsCloudFrontDistribution(value: AwsCloudFrontDistributionDetails): Self = StObject.set(x, "AwsCloudFrontDistribution", value.asInstanceOf[js.Any])
    
    inline def setAwsCloudFrontDistributionUndefined: Self = StObject.set(x, "AwsCloudFrontDistribution", js.undefined)
    
    inline def setAwsCloudTrailTrail(value: AwsCloudTrailTrailDetails): Self = StObject.set(x, "AwsCloudTrailTrail", value.asInstanceOf[js.Any])
    
    inline def setAwsCloudTrailTrailUndefined: Self = StObject.set(x, "AwsCloudTrailTrail", js.undefined)
    
    inline def setAwsCloudWatchAlarm(value: AwsCloudWatchAlarmDetails): Self = StObject.set(x, "AwsCloudWatchAlarm", value.asInstanceOf[js.Any])
    
    inline def setAwsCloudWatchAlarmUndefined: Self = StObject.set(x, "AwsCloudWatchAlarm", js.undefined)
    
    inline def setAwsCodeBuildProject(value: AwsCodeBuildProjectDetails): Self = StObject.set(x, "AwsCodeBuildProject", value.asInstanceOf[js.Any])
    
    inline def setAwsCodeBuildProjectUndefined: Self = StObject.set(x, "AwsCodeBuildProject", js.undefined)
    
    inline def setAwsDynamoDbTable(value: AwsDynamoDbTableDetails): Self = StObject.set(x, "AwsDynamoDbTable", value.asInstanceOf[js.Any])
    
    inline def setAwsDynamoDbTableUndefined: Self = StObject.set(x, "AwsDynamoDbTable", js.undefined)
    
    inline def setAwsEc2Eip(value: AwsEc2EipDetails): Self = StObject.set(x, "AwsEc2Eip", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2EipUndefined: Self = StObject.set(x, "AwsEc2Eip", js.undefined)
    
    inline def setAwsEc2Instance(value: AwsEc2InstanceDetails): Self = StObject.set(x, "AwsEc2Instance", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2InstanceUndefined: Self = StObject.set(x, "AwsEc2Instance", js.undefined)
    
    inline def setAwsEc2LaunchTemplate(value: AwsEc2LaunchTemplateDetails): Self = StObject.set(x, "AwsEc2LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2LaunchTemplateUndefined: Self = StObject.set(x, "AwsEc2LaunchTemplate", js.undefined)
    
    inline def setAwsEc2NetworkAcl(value: AwsEc2NetworkAclDetails): Self = StObject.set(x, "AwsEc2NetworkAcl", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2NetworkAclUndefined: Self = StObject.set(x, "AwsEc2NetworkAcl", js.undefined)
    
    inline def setAwsEc2NetworkInterface(value: AwsEc2NetworkInterfaceDetails): Self = StObject.set(x, "AwsEc2NetworkInterface", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2NetworkInterfaceUndefined: Self = StObject.set(x, "AwsEc2NetworkInterface", js.undefined)
    
    inline def setAwsEc2RouteTable(value: AwsEc2RouteTableDetails): Self = StObject.set(x, "AwsEc2RouteTable", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2RouteTableUndefined: Self = StObject.set(x, "AwsEc2RouteTable", js.undefined)
    
    inline def setAwsEc2SecurityGroup(value: AwsEc2SecurityGroupDetails): Self = StObject.set(x, "AwsEc2SecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2SecurityGroupUndefined: Self = StObject.set(x, "AwsEc2SecurityGroup", js.undefined)
    
    inline def setAwsEc2Subnet(value: AwsEc2SubnetDetails): Self = StObject.set(x, "AwsEc2Subnet", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2SubnetUndefined: Self = StObject.set(x, "AwsEc2Subnet", js.undefined)
    
    inline def setAwsEc2TransitGateway(value: AwsEc2TransitGatewayDetails): Self = StObject.set(x, "AwsEc2TransitGateway", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2TransitGatewayUndefined: Self = StObject.set(x, "AwsEc2TransitGateway", js.undefined)
    
    inline def setAwsEc2Volume(value: AwsEc2VolumeDetails): Self = StObject.set(x, "AwsEc2Volume", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2VolumeUndefined: Self = StObject.set(x, "AwsEc2Volume", js.undefined)
    
    inline def setAwsEc2Vpc(value: AwsEc2VpcDetails): Self = StObject.set(x, "AwsEc2Vpc", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2VpcEndpointService(value: AwsEc2VpcEndpointServiceDetails): Self = StObject.set(x, "AwsEc2VpcEndpointService", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2VpcEndpointServiceUndefined: Self = StObject.set(x, "AwsEc2VpcEndpointService", js.undefined)
    
    inline def setAwsEc2VpcPeeringConnection(value: AwsEc2VpcPeeringConnectionDetails): Self = StObject.set(x, "AwsEc2VpcPeeringConnection", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2VpcPeeringConnectionUndefined: Self = StObject.set(x, "AwsEc2VpcPeeringConnection", js.undefined)
    
    inline def setAwsEc2VpcUndefined: Self = StObject.set(x, "AwsEc2Vpc", js.undefined)
    
    inline def setAwsEc2VpnConnection(value: AwsEc2VpnConnectionDetails): Self = StObject.set(x, "AwsEc2VpnConnection", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2VpnConnectionUndefined: Self = StObject.set(x, "AwsEc2VpnConnection", js.undefined)
    
    inline def setAwsEcrContainerImage(value: AwsEcrContainerImageDetails): Self = StObject.set(x, "AwsEcrContainerImage", value.asInstanceOf[js.Any])
    
    inline def setAwsEcrContainerImageUndefined: Self = StObject.set(x, "AwsEcrContainerImage", js.undefined)
    
    inline def setAwsEcrRepository(value: AwsEcrRepositoryDetails): Self = StObject.set(x, "AwsEcrRepository", value.asInstanceOf[js.Any])
    
    inline def setAwsEcrRepositoryUndefined: Self = StObject.set(x, "AwsEcrRepository", js.undefined)
    
    inline def setAwsEcsCluster(value: AwsEcsClusterDetails): Self = StObject.set(x, "AwsEcsCluster", value.asInstanceOf[js.Any])
    
    inline def setAwsEcsClusterUndefined: Self = StObject.set(x, "AwsEcsCluster", js.undefined)
    
    inline def setAwsEcsContainer(value: AwsEcsContainerDetails): Self = StObject.set(x, "AwsEcsContainer", value.asInstanceOf[js.Any])
    
    inline def setAwsEcsContainerUndefined: Self = StObject.set(x, "AwsEcsContainer", js.undefined)
    
    inline def setAwsEcsService(value: AwsEcsServiceDetails): Self = StObject.set(x, "AwsEcsService", value.asInstanceOf[js.Any])
    
    inline def setAwsEcsServiceUndefined: Self = StObject.set(x, "AwsEcsService", js.undefined)
    
    inline def setAwsEcsTask(value: AwsEcsTaskDetails): Self = StObject.set(x, "AwsEcsTask", value.asInstanceOf[js.Any])
    
    inline def setAwsEcsTaskDefinition(value: AwsEcsTaskDefinitionDetails): Self = StObject.set(x, "AwsEcsTaskDefinition", value.asInstanceOf[js.Any])
    
    inline def setAwsEcsTaskDefinitionUndefined: Self = StObject.set(x, "AwsEcsTaskDefinition", js.undefined)
    
    inline def setAwsEcsTaskUndefined: Self = StObject.set(x, "AwsEcsTask", js.undefined)
    
    inline def setAwsEfsAccessPoint(value: AwsEfsAccessPointDetails): Self = StObject.set(x, "AwsEfsAccessPoint", value.asInstanceOf[js.Any])
    
    inline def setAwsEfsAccessPointUndefined: Self = StObject.set(x, "AwsEfsAccessPoint", js.undefined)
    
    inline def setAwsEksCluster(value: AwsEksClusterDetails): Self = StObject.set(x, "AwsEksCluster", value.asInstanceOf[js.Any])
    
    inline def setAwsEksClusterUndefined: Self = StObject.set(x, "AwsEksCluster", js.undefined)
    
    inline def setAwsElasticBeanstalkEnvironment(value: AwsElasticBeanstalkEnvironmentDetails): Self = StObject.set(x, "AwsElasticBeanstalkEnvironment", value.asInstanceOf[js.Any])
    
    inline def setAwsElasticBeanstalkEnvironmentUndefined: Self = StObject.set(x, "AwsElasticBeanstalkEnvironment", js.undefined)
    
    inline def setAwsElasticsearchDomain(value: AwsElasticsearchDomainDetails): Self = StObject.set(x, "AwsElasticsearchDomain", value.asInstanceOf[js.Any])
    
    inline def setAwsElasticsearchDomainUndefined: Self = StObject.set(x, "AwsElasticsearchDomain", js.undefined)
    
    inline def setAwsElbLoadBalancer(value: AwsElbLoadBalancerDetails): Self = StObject.set(x, "AwsElbLoadBalancer", value.asInstanceOf[js.Any])
    
    inline def setAwsElbLoadBalancerUndefined: Self = StObject.set(x, "AwsElbLoadBalancer", js.undefined)
    
    inline def setAwsElbv2LoadBalancer(value: AwsElbv2LoadBalancerDetails): Self = StObject.set(x, "AwsElbv2LoadBalancer", value.asInstanceOf[js.Any])
    
    inline def setAwsElbv2LoadBalancerUndefined: Self = StObject.set(x, "AwsElbv2LoadBalancer", js.undefined)
    
    inline def setAwsIamAccessKey(value: AwsIamAccessKeyDetails): Self = StObject.set(x, "AwsIamAccessKey", value.asInstanceOf[js.Any])
    
    inline def setAwsIamAccessKeyUndefined: Self = StObject.set(x, "AwsIamAccessKey", js.undefined)
    
    inline def setAwsIamGroup(value: AwsIamGroupDetails): Self = StObject.set(x, "AwsIamGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsIamGroupUndefined: Self = StObject.set(x, "AwsIamGroup", js.undefined)
    
    inline def setAwsIamPolicy(value: AwsIamPolicyDetails): Self = StObject.set(x, "AwsIamPolicy", value.asInstanceOf[js.Any])
    
    inline def setAwsIamPolicyUndefined: Self = StObject.set(x, "AwsIamPolicy", js.undefined)
    
    inline def setAwsIamRole(value: AwsIamRoleDetails): Self = StObject.set(x, "AwsIamRole", value.asInstanceOf[js.Any])
    
    inline def setAwsIamRoleUndefined: Self = StObject.set(x, "AwsIamRole", js.undefined)
    
    inline def setAwsIamUser(value: AwsIamUserDetails): Self = StObject.set(x, "AwsIamUser", value.asInstanceOf[js.Any])
    
    inline def setAwsIamUserUndefined: Self = StObject.set(x, "AwsIamUser", js.undefined)
    
    inline def setAwsKinesisStream(value: AwsKinesisStreamDetails): Self = StObject.set(x, "AwsKinesisStream", value.asInstanceOf[js.Any])
    
    inline def setAwsKinesisStreamUndefined: Self = StObject.set(x, "AwsKinesisStream", js.undefined)
    
    inline def setAwsKmsKey(value: AwsKmsKeyDetails): Self = StObject.set(x, "AwsKmsKey", value.asInstanceOf[js.Any])
    
    inline def setAwsKmsKeyUndefined: Self = StObject.set(x, "AwsKmsKey", js.undefined)
    
    inline def setAwsLambdaFunction(value: AwsLambdaFunctionDetails): Self = StObject.set(x, "AwsLambdaFunction", value.asInstanceOf[js.Any])
    
    inline def setAwsLambdaFunctionUndefined: Self = StObject.set(x, "AwsLambdaFunction", js.undefined)
    
    inline def setAwsLambdaLayerVersion(value: AwsLambdaLayerVersionDetails): Self = StObject.set(x, "AwsLambdaLayerVersion", value.asInstanceOf[js.Any])
    
    inline def setAwsLambdaLayerVersionUndefined: Self = StObject.set(x, "AwsLambdaLayerVersion", js.undefined)
    
    inline def setAwsNetworkFirewallFirewall(value: AwsNetworkFirewallFirewallDetails): Self = StObject.set(x, "AwsNetworkFirewallFirewall", value.asInstanceOf[js.Any])
    
    inline def setAwsNetworkFirewallFirewallPolicy(value: AwsNetworkFirewallFirewallPolicyDetails): Self = StObject.set(x, "AwsNetworkFirewallFirewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setAwsNetworkFirewallFirewallPolicyUndefined: Self = StObject.set(x, "AwsNetworkFirewallFirewallPolicy", js.undefined)
    
    inline def setAwsNetworkFirewallFirewallUndefined: Self = StObject.set(x, "AwsNetworkFirewallFirewall", js.undefined)
    
    inline def setAwsNetworkFirewallRuleGroup(value: AwsNetworkFirewallRuleGroupDetails): Self = StObject.set(x, "AwsNetworkFirewallRuleGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsNetworkFirewallRuleGroupUndefined: Self = StObject.set(x, "AwsNetworkFirewallRuleGroup", js.undefined)
    
    inline def setAwsOpenSearchServiceDomain(value: AwsOpenSearchServiceDomainDetails): Self = StObject.set(x, "AwsOpenSearchServiceDomain", value.asInstanceOf[js.Any])
    
    inline def setAwsOpenSearchServiceDomainUndefined: Self = StObject.set(x, "AwsOpenSearchServiceDomain", js.undefined)
    
    inline def setAwsRdsDbCluster(value: AwsRdsDbClusterDetails): Self = StObject.set(x, "AwsRdsDbCluster", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsDbClusterSnapshot(value: AwsRdsDbClusterSnapshotDetails): Self = StObject.set(x, "AwsRdsDbClusterSnapshot", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsDbClusterSnapshotUndefined: Self = StObject.set(x, "AwsRdsDbClusterSnapshot", js.undefined)
    
    inline def setAwsRdsDbClusterUndefined: Self = StObject.set(x, "AwsRdsDbCluster", js.undefined)
    
    inline def setAwsRdsDbInstance(value: AwsRdsDbInstanceDetails): Self = StObject.set(x, "AwsRdsDbInstance", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsDbInstanceUndefined: Self = StObject.set(x, "AwsRdsDbInstance", js.undefined)
    
    inline def setAwsRdsDbSecurityGroup(value: AwsRdsDbSecurityGroupDetails): Self = StObject.set(x, "AwsRdsDbSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsDbSecurityGroupUndefined: Self = StObject.set(x, "AwsRdsDbSecurityGroup", js.undefined)
    
    inline def setAwsRdsDbSnapshot(value: AwsRdsDbSnapshotDetails): Self = StObject.set(x, "AwsRdsDbSnapshot", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsDbSnapshotUndefined: Self = StObject.set(x, "AwsRdsDbSnapshot", js.undefined)
    
    inline def setAwsRdsEventSubscription(value: AwsRdsEventSubscriptionDetails): Self = StObject.set(x, "AwsRdsEventSubscription", value.asInstanceOf[js.Any])
    
    inline def setAwsRdsEventSubscriptionUndefined: Self = StObject.set(x, "AwsRdsEventSubscription", js.undefined)
    
    inline def setAwsRedshiftCluster(value: AwsRedshiftClusterDetails): Self = StObject.set(x, "AwsRedshiftCluster", value.asInstanceOf[js.Any])
    
    inline def setAwsRedshiftClusterUndefined: Self = StObject.set(x, "AwsRedshiftCluster", js.undefined)
    
    inline def setAwsS3AccountPublicAccessBlock(value: AwsS3AccountPublicAccessBlockDetails): Self = StObject.set(x, "AwsS3AccountPublicAccessBlock", value.asInstanceOf[js.Any])
    
    inline def setAwsS3AccountPublicAccessBlockUndefined: Self = StObject.set(x, "AwsS3AccountPublicAccessBlock", js.undefined)
    
    inline def setAwsS3Bucket(value: AwsS3BucketDetails): Self = StObject.set(x, "AwsS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setAwsS3BucketUndefined: Self = StObject.set(x, "AwsS3Bucket", js.undefined)
    
    inline def setAwsS3Object(value: AwsS3ObjectDetails): Self = StObject.set(x, "AwsS3Object", value.asInstanceOf[js.Any])
    
    inline def setAwsS3ObjectUndefined: Self = StObject.set(x, "AwsS3Object", js.undefined)
    
    inline def setAwsSageMakerNotebookInstance(value: AwsSageMakerNotebookInstanceDetails): Self = StObject.set(x, "AwsSageMakerNotebookInstance", value.asInstanceOf[js.Any])
    
    inline def setAwsSageMakerNotebookInstanceUndefined: Self = StObject.set(x, "AwsSageMakerNotebookInstance", js.undefined)
    
    inline def setAwsSecretsManagerSecret(value: AwsSecretsManagerSecretDetails): Self = StObject.set(x, "AwsSecretsManagerSecret", value.asInstanceOf[js.Any])
    
    inline def setAwsSecretsManagerSecretUndefined: Self = StObject.set(x, "AwsSecretsManagerSecret", js.undefined)
    
    inline def setAwsSnsTopic(value: AwsSnsTopicDetails): Self = StObject.set(x, "AwsSnsTopic", value.asInstanceOf[js.Any])
    
    inline def setAwsSnsTopicUndefined: Self = StObject.set(x, "AwsSnsTopic", js.undefined)
    
    inline def setAwsSqsQueue(value: AwsSqsQueueDetails): Self = StObject.set(x, "AwsSqsQueue", value.asInstanceOf[js.Any])
    
    inline def setAwsSqsQueueUndefined: Self = StObject.set(x, "AwsSqsQueue", js.undefined)
    
    inline def setAwsSsmPatchCompliance(value: AwsSsmPatchComplianceDetails): Self = StObject.set(x, "AwsSsmPatchCompliance", value.asInstanceOf[js.Any])
    
    inline def setAwsSsmPatchComplianceUndefined: Self = StObject.set(x, "AwsSsmPatchCompliance", js.undefined)
    
    inline def setAwsWafRateBasedRule(value: AwsWafRateBasedRuleDetails): Self = StObject.set(x, "AwsWafRateBasedRule", value.asInstanceOf[js.Any])
    
    inline def setAwsWafRateBasedRuleUndefined: Self = StObject.set(x, "AwsWafRateBasedRule", js.undefined)
    
    inline def setAwsWafRegionalRateBasedRule(value: AwsWafRegionalRateBasedRuleDetails): Self = StObject.set(x, "AwsWafRegionalRateBasedRule", value.asInstanceOf[js.Any])
    
    inline def setAwsWafRegionalRateBasedRuleUndefined: Self = StObject.set(x, "AwsWafRegionalRateBasedRule", js.undefined)
    
    inline def setAwsWafRegionalRule(value: AwsWafRegionalRuleDetails): Self = StObject.set(x, "AwsWafRegionalRule", value.asInstanceOf[js.Any])
    
    inline def setAwsWafRegionalRuleGroup(value: AwsWafRegionalRuleGroupDetails): Self = StObject.set(x, "AwsWafRegionalRuleGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsWafRegionalRuleGroupUndefined: Self = StObject.set(x, "AwsWafRegionalRuleGroup", js.undefined)
    
    inline def setAwsWafRegionalRuleUndefined: Self = StObject.set(x, "AwsWafRegionalRule", js.undefined)
    
    inline def setAwsWafRegionalWebAcl(value: AwsWafRegionalWebAclDetails): Self = StObject.set(x, "AwsWafRegionalWebAcl", value.asInstanceOf[js.Any])
    
    inline def setAwsWafRegionalWebAclUndefined: Self = StObject.set(x, "AwsWafRegionalWebAcl", js.undefined)
    
    inline def setAwsWafRule(value: AwsWafRuleDetails): Self = StObject.set(x, "AwsWafRule", value.asInstanceOf[js.Any])
    
    inline def setAwsWafRuleGroup(value: AwsWafRuleGroupDetails): Self = StObject.set(x, "AwsWafRuleGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsWafRuleGroupUndefined: Self = StObject.set(x, "AwsWafRuleGroup", js.undefined)
    
    inline def setAwsWafRuleUndefined: Self = StObject.set(x, "AwsWafRule", js.undefined)
    
    inline def setAwsWafWebAcl(value: AwsWafWebAclDetails): Self = StObject.set(x, "AwsWafWebAcl", value.asInstanceOf[js.Any])
    
    inline def setAwsWafWebAclUndefined: Self = StObject.set(x, "AwsWafWebAcl", js.undefined)
    
    inline def setAwsWafv2RuleGroup(value: AwsWafv2RuleGroupDetails): Self = StObject.set(x, "AwsWafv2RuleGroup", value.asInstanceOf[js.Any])
    
    inline def setAwsWafv2RuleGroupUndefined: Self = StObject.set(x, "AwsWafv2RuleGroup", js.undefined)
    
    inline def setAwsWafv2WebAcl(value: AwsWafv2WebAclDetails): Self = StObject.set(x, "AwsWafv2WebAcl", value.asInstanceOf[js.Any])
    
    inline def setAwsWafv2WebAclUndefined: Self = StObject.set(x, "AwsWafv2WebAcl", js.undefined)
    
    inline def setAwsXrayEncryptionConfig(value: AwsXrayEncryptionConfigDetails): Self = StObject.set(x, "AwsXrayEncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setAwsXrayEncryptionConfigUndefined: Self = StObject.set(x, "AwsXrayEncryptionConfig", js.undefined)
    
    inline def setContainer(value: ContainerDetails): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    inline def setOther(value: FieldMap): Self = StObject.set(x, "Other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "Other", js.undefined)
  }
}
