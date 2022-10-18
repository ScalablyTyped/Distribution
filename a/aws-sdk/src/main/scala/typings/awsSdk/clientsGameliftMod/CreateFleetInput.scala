package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetInput extends StObject {
  
  /**
    * The unique identifier for a custom game server build to be deployed on fleet instances. You can use either the build ID or ARN. The build must be uploaded to GameLift and in READY status. This fleet property cannot be changed later.
    */
  var BuildId: js.UndefOr[BuildIdOrArn] = js.undefined
  
  /**
    * Prompts GameLift to generate a TLS/SSL certificate for the fleet. TLS certificates are used for encrypting traffic between game clients and the game servers that are running on GameLift. By default, the CertificateConfiguration is set to DISABLED. This property cannot be changed after the fleet is created.  Note: This feature requires the Amazon Web Services Certificate Manager (ACM) service, which is not available in all Amazon Web Services regions. When working in a region that does not support this feature, a fleet creation request with certificate generation fails with a 4xx error.
    */
  var CertificateConfiguration: js.UndefOr[typings.awsSdk.clientsGameliftMod.CertificateConfiguration] = js.undefined
  
  /**
    * A human-readable description of the fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * The allowed IP address ranges and port settings that allow inbound traffic to access game sessions on this fleet. If the fleet is hosting a custom game build, this property must be set before players can connect to game sessions. For Realtime Servers fleets, GameLift automatically sets TCP and UDP ranges. 
    */
  var EC2InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined
  
  /**
    * The GameLift-supported Amazon EC2 instance type to use for all fleet instances. Instance type determines the computing resources that will be used to host your game servers, including CPU, memory, storage, and networking capacity. See Amazon Elastic Compute Cloud Instance Types for detailed descriptions of Amazon EC2 instance types.
    */
  var EC2InstanceType: typings.awsSdk.clientsGameliftMod.EC2InstanceType
  
  /**
    * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to ON_DEMAND. Learn more about when to use  On-Demand versus Spot Instances. This property cannot be changed after the fleet is created.
    */
  var FleetType: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetType] = js.undefined
  
  /**
    * A unique identifier for an IAM role that manages access to your Amazon Web Services services. With an instance role ARN set, any application that runs on an instance in this fleet can assume the role, including install scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN by using the IAM dashboard in the Amazon Web Services Management Console. Learn more about using on-box credentials for your game servers at  Access external resources from a game server. This property cannot be changed after the fleet is created.
    */
  var InstanceRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A set of remote locations to deploy additional instances to and manage as part of the fleet. This parameter can only be used when creating fleets in Amazon Web Services Regions that support multiple locations. You can add any GameLift-supported Amazon Web Services Region as a remote location, in the form of an Amazon Web Services Region code such as us-west-2. To create a fleet with instances in the home Region only, omit this parameter. 
    */
  var Locations: js.UndefOr[LocationConfigurationList] = js.undefined
  
  /**
    *  This parameter is no longer used. To specify where GameLift should store log files once a server process shuts down, use the GameLift server API ProcessReady() and specify one or more directory paths in logParameters. See more information in the Server API Reference. 
    */
  var LogPaths: js.UndefOr[StringList] = js.undefined
  
  /**
    * The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used to aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new name to create a new metric group. A fleet can be included in only one metric group at a time. 
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.undefined
  
  /**
    * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: NonZeroAndMaxString
  
  /**
    * The status of termination protection for active game sessions on the fleet. By default, this property is set to NoProtection. You can also set game session protection for an individual game session by calling UpdateGameSession.    NoProtection - Game sessions can be terminated during active gameplay as a result of a scale-down event.     FullProtection - Game sessions in ACTIVE status cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
  
  /**
    * Used when peering your GameLift fleet with a VPC, the unique identifier for the Amazon Web Services account that owns the VPC. You can find your account ID in the Amazon Web Services Management Console under account settings. 
    */
  var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A unique identifier for a VPC with resources to be accessed by your GameLift fleet. The VPC must be in the same Region as your fleet. To look up a VPC ID, use the VPC Dashboard in the Amazon Web Services Management Console. Learn more about VPC peering in VPC Peering with GameLift Fleets. 
    */
  var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A policy that limits the number of game sessions that an individual player can create on instances in this fleet within a specified span of time.
    */
  var ResourceCreationLimitPolicy: js.UndefOr[typings.awsSdk.clientsGameliftMod.ResourceCreationLimitPolicy] = js.undefined
  
  /**
    * Instructions for how to launch and maintain server processes on instances in the fleet. The runtime configuration defines one or more server process configurations, each identifying a build executable or Realtime script file and the number of processes of that type to run concurrently.   The RuntimeConfiguration parameter is required unless the fleet is being configured using the older parameters ServerLaunchPath and ServerLaunchParameters, which are still supported for backward compatibility. 
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.clientsGameliftMod.RuntimeConfiguration] = js.undefined
  
  /**
    * The unique identifier for a Realtime configuration script to be deployed on fleet instances. You can use either the script ID or ARN. Scripts must be uploaded to GameLift prior to creating the fleet. This fleet property cannot be changed later.
    */
  var ScriptId: js.UndefOr[ScriptIdOrArn] = js.undefined
  
  /**
    *  This parameter is no longer used. Specify server launch parameters using the RuntimeConfiguration parameter. Requests that use this parameter instead continue to be valid.
    */
  var ServerLaunchParameters: js.UndefOr[LaunchParametersStringModel] = js.undefined
  
  /**
    *  This parameter is no longer used. Specify a server launch path using the RuntimeConfiguration parameter. Requests that use this parameter instead continue to be valid.
    */
  var ServerLaunchPath: js.UndefOr[LaunchPathStringModel] = js.undefined
  
  /**
    * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost allocation. For more information, see  Tagging Amazon Web Services Resources in the Amazon Web Services General Reference. Once the fleet is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the Amazon Web Services General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFleetInput {
  
  inline def apply(EC2InstanceType: EC2InstanceType, Name: NonZeroAndMaxString): CreateFleetInput = {
    val __obj = js.Dynamic.literal(EC2InstanceType = EC2InstanceType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetInput]
  }
  
  extension [Self <: CreateFleetInput](x: Self) {
    
    inline def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "BuildId", js.undefined)
    
    inline def setCertificateConfiguration(value: CertificateConfiguration): Self = StObject.set(x, "CertificateConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCertificateConfigurationUndefined: Self = StObject.set(x, "CertificateConfiguration", js.undefined)
    
    inline def setDescription(value: NonZeroAndMaxString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEC2InboundPermissions(value: IpPermissionsList): Self = StObject.set(x, "EC2InboundPermissions", value.asInstanceOf[js.Any])
    
    inline def setEC2InboundPermissionsUndefined: Self = StObject.set(x, "EC2InboundPermissions", js.undefined)
    
    inline def setEC2InboundPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "EC2InboundPermissions", js.Array(value*))
    
    inline def setEC2InstanceType(value: EC2InstanceType): Self = StObject.set(x, "EC2InstanceType", value.asInstanceOf[js.Any])
    
    inline def setFleetType(value: FleetType): Self = StObject.set(x, "FleetType", value.asInstanceOf[js.Any])
    
    inline def setFleetTypeUndefined: Self = StObject.set(x, "FleetType", js.undefined)
    
    inline def setInstanceRoleArn(value: NonEmptyString): Self = StObject.set(x, "InstanceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceRoleArnUndefined: Self = StObject.set(x, "InstanceRoleArn", js.undefined)
    
    inline def setLocations(value: LocationConfigurationList): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "Locations", js.undefined)
    
    inline def setLocationsVarargs(value: LocationConfiguration*): Self = StObject.set(x, "Locations", js.Array(value*))
    
    inline def setLogPaths(value: StringList): Self = StObject.set(x, "LogPaths", value.asInstanceOf[js.Any])
    
    inline def setLogPathsUndefined: Self = StObject.set(x, "LogPaths", js.undefined)
    
    inline def setLogPathsVarargs(value: NonZeroAndMaxString*): Self = StObject.set(x, "LogPaths", js.Array(value*))
    
    inline def setMetricGroups(value: MetricGroupList): Self = StObject.set(x, "MetricGroups", value.asInstanceOf[js.Any])
    
    inline def setMetricGroupsUndefined: Self = StObject.set(x, "MetricGroups", js.undefined)
    
    inline def setMetricGroupsVarargs(value: MetricGroup*): Self = StObject.set(x, "MetricGroups", js.Array(value*))
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNewGameSessionProtectionPolicy(value: ProtectionPolicy): Self = StObject.set(x, "NewGameSessionProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setNewGameSessionProtectionPolicyUndefined: Self = StObject.set(x, "NewGameSessionProtectionPolicy", js.undefined)
    
    inline def setPeerVpcAwsAccountId(value: NonZeroAndMaxString): Self = StObject.set(x, "PeerVpcAwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setPeerVpcAwsAccountIdUndefined: Self = StObject.set(x, "PeerVpcAwsAccountId", js.undefined)
    
    inline def setPeerVpcId(value: NonZeroAndMaxString): Self = StObject.set(x, "PeerVpcId", value.asInstanceOf[js.Any])
    
    inline def setPeerVpcIdUndefined: Self = StObject.set(x, "PeerVpcId", js.undefined)
    
    inline def setResourceCreationLimitPolicy(value: ResourceCreationLimitPolicy): Self = StObject.set(x, "ResourceCreationLimitPolicy", value.asInstanceOf[js.Any])
    
    inline def setResourceCreationLimitPolicyUndefined: Self = StObject.set(x, "ResourceCreationLimitPolicy", js.undefined)
    
    inline def setRuntimeConfiguration(value: RuntimeConfiguration): Self = StObject.set(x, "RuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigurationUndefined: Self = StObject.set(x, "RuntimeConfiguration", js.undefined)
    
    inline def setScriptId(value: ScriptIdOrArn): Self = StObject.set(x, "ScriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "ScriptId", js.undefined)
    
    inline def setServerLaunchParameters(value: LaunchParametersStringModel): Self = StObject.set(x, "ServerLaunchParameters", value.asInstanceOf[js.Any])
    
    inline def setServerLaunchParametersUndefined: Self = StObject.set(x, "ServerLaunchParameters", js.undefined)
    
    inline def setServerLaunchPath(value: LaunchPathStringModel): Self = StObject.set(x, "ServerLaunchPath", value.asInstanceOf[js.Any])
    
    inline def setServerLaunchPathUndefined: Self = StObject.set(x, "ServerLaunchPath", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
