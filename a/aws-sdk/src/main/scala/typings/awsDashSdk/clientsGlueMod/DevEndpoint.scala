package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevEndpoint extends js.Object {
  /**
    * A map of arguments used to configure the DevEndpoint. Valid arguments are:    "--enable-glue-datacatalog": ""     "GLUE_PYTHON_VERSION": "3"     "GLUE_PYTHON_VERSION": "2"    You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var Arguments: js.UndefOr[MapValue] = js.native
  /**
    * The AWS Availability Zone where this DevEndpoint is located.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.native
  /**
    * The point in time at which this DevEndpoint was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampValue] = js.native
  /**
    * The name of the DevEndpoint.
    */
  var EndpointName: js.UndefOr[GenericString] = js.native
  /**
    * The path to one or more Java .jar files in an S3 bucket that should be loaded in your DevEndpoint.  You can only use pure Java/Scala libraries with a DevEndpoint. 
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma.  You can only use pure Python libraries with a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not currently supported. 
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * The reason for a current failure in this DevEndpoint.
    */
  var FailureReason: js.UndefOr[GenericString] = js.native
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for running your ETL scripts on development endpoints.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Development endpoints that are created without specifying a Glue version default to Glue 0.9. You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The point in time at which this DevEndpoint was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[TimestampValue] = js.native
  /**
    * The status of the last update.
    */
  var LastUpdateStatus: js.UndefOr[GenericString] = js.native
  /**
    * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.native
  /**
    * The number of workers of a defined workerType that are allocated to the development endpoint. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * A private IP address to access the DevEndpoint within a VPC if the DevEndpoint is created within one. The PrivateAddress field is present only when you create the DevEndpoint within your VPC.
    */
  var PrivateAddress: js.UndefOr[GenericString] = js.native
  /**
    * The public IP address used by this DevEndpoint. The PublicAddress field is present only when you create a non-virtual private cloud (VPC) DevEndpoint.
    */
  var PublicAddress: js.UndefOr[GenericString] = js.native
  /**
    * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward compatibility because the recommended attribute to use is public keys.
    */
  var PublicKey: js.UndefOr[GenericString] = js.native
  /**
    * A list of public keys to be used by the DevEndpoints for authentication. Using this attribute is preferred over a single public key because the public keys allow you to have a different private key per client.  If you previously created an endpoint with a public key, you must remove that key to be able to set a list of public keys. Call the UpdateDevEndpoint API operation with the public key content in the deletePublicKeys attribute, and the list of new keys in the addPublicKeys attribute. 
    */
  var PublicKeys: js.UndefOr[PublicKeysList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used in this DevEndpoint.
    */
  var RoleArn: js.UndefOr[typings.awsDashSdk.clientsGlueMod.RoleArn] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * A list of security group identifiers used in this DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * The current status of this DevEndpoint.
    */
  var Status: js.UndefOr[GenericString] = js.native
  /**
    * The subnet ID for this DevEndpoint.
    */
  var SubnetId: js.UndefOr[GenericString] = js.native
  /**
    * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
    */
  var VpcId: js.UndefOr[GenericString] = js.native
  /**
    * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.2X worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   Known issue: when a development endpoint is created with the G.2X WorkerType configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB disk. 
    */
  var WorkerType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.WorkerType] = js.native
  /**
    * The YARN endpoint address used by this DevEndpoint.
    */
  var YarnEndpointAddress: js.UndefOr[GenericString] = js.native
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.native
}

object DevEndpoint {
  @scala.inline
  def apply(
    Arguments: MapValue = null,
    AvailabilityZone: GenericString = null,
    CreatedTimestamp: TimestampValue = null,
    EndpointName: GenericString = null,
    ExtraJarsS3Path: GenericString = null,
    ExtraPythonLibsS3Path: GenericString = null,
    FailureReason: GenericString = null,
    GlueVersion: GlueVersionString = null,
    LastModifiedTimestamp: TimestampValue = null,
    LastUpdateStatus: GenericString = null,
    NumberOfNodes: Int | Double = null,
    NumberOfWorkers: Int | Double = null,
    PrivateAddress: GenericString = null,
    PublicAddress: GenericString = null,
    PublicKey: GenericString = null,
    PublicKeys: PublicKeysList = null,
    RoleArn: RoleArn = null,
    SecurityConfiguration: NameString = null,
    SecurityGroupIds: StringList = null,
    Status: GenericString = null,
    SubnetId: GenericString = null,
    VpcId: GenericString = null,
    WorkerType: WorkerType = null,
    YarnEndpointAddress: GenericString = null,
    ZeppelinRemoteSparkInterpreterPort: Int | Double = null
  ): DevEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Arguments != null) __obj.updateDynamic("Arguments")(Arguments.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (EndpointName != null) __obj.updateDynamic("EndpointName")(EndpointName.asInstanceOf[js.Any])
    if (ExtraJarsS3Path != null) __obj.updateDynamic("ExtraJarsS3Path")(ExtraJarsS3Path.asInstanceOf[js.Any])
    if (ExtraPythonLibsS3Path != null) __obj.updateDynamic("ExtraPythonLibsS3Path")(ExtraPythonLibsS3Path.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (GlueVersion != null) __obj.updateDynamic("GlueVersion")(GlueVersion.asInstanceOf[js.Any])
    if (LastModifiedTimestamp != null) __obj.updateDynamic("LastModifiedTimestamp")(LastModifiedTimestamp.asInstanceOf[js.Any])
    if (LastUpdateStatus != null) __obj.updateDynamic("LastUpdateStatus")(LastUpdateStatus.asInstanceOf[js.Any])
    if (NumberOfNodes != null) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes.asInstanceOf[js.Any])
    if (NumberOfWorkers != null) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers.asInstanceOf[js.Any])
    if (PrivateAddress != null) __obj.updateDynamic("PrivateAddress")(PrivateAddress.asInstanceOf[js.Any])
    if (PublicAddress != null) __obj.updateDynamic("PublicAddress")(PublicAddress.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    if (PublicKeys != null) __obj.updateDynamic("PublicKeys")(PublicKeys.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    if (YarnEndpointAddress != null) __obj.updateDynamic("YarnEndpointAddress")(YarnEndpointAddress.asInstanceOf[js.Any])
    if (ZeppelinRemoteSparkInterpreterPort != null) __obj.updateDynamic("ZeppelinRemoteSparkInterpreterPort")(ZeppelinRemoteSparkInterpreterPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevEndpoint]
  }
}

