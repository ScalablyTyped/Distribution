package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDevEndpointRequest extends js.Object {
  /**
    * A map of arguments used to configure the DevEndpoint.
    */
  var Arguments: js.UndefOr[MapValue] = js.native
  /**
    * The name to be assigned to the new DevEndpoint.
    */
  var EndpointName: GenericString = js.native
  /**
    * The path to one or more Java .jar files in an S3 bucket that should be loaded in your DevEndpoint.
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma.  You can only use pure Python libraries with a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not yet supported. 
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for running your ETL scripts on development endpoints.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Development endpoints that are created without specifying a Glue version default to Glue 0.9. You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.native
  /**
    * The number of workers of a defined workerType that are allocated to the development endpoint. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward compatibility because the recommended attribute to use is public keys.
    */
  var PublicKey: js.UndefOr[GenericString] = js.native
  /**
    * A list of public keys to be used by the development endpoints for authentication. The use of this attribute is preferred over a single public key because the public keys allow you to have a different private key per client.  If you previously created an endpoint with a public key, you must remove that key to be able to set a list of public keys. Call the UpdateDevEndpoint API with the public key content in the deletePublicKeys attribute, and the list of new keys in the addPublicKeys attribute. 
    */
  var PublicKeys: js.UndefOr[PublicKeysList] = js.native
  /**
    * The IAM role for the DevEndpoint.
    */
  var RoleArn: typings.awsDashSdk.clientsGlueMod.RoleArn = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * Security group IDs for the security groups to be used by the new DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * The subnet ID for the new DevEndpoint to use.
    */
  var SubnetId: js.UndefOr[GenericString] = js.native
  /**
    * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
  /**
    * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.2X worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   Known issue: when a development endpoint is created with the G.2X WorkerType configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB disk. 
    */
  var WorkerType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.WorkerType] = js.native
}

object CreateDevEndpointRequest {
  @scala.inline
  def apply(
    EndpointName: GenericString,
    RoleArn: RoleArn,
    Arguments: MapValue = null,
    ExtraJarsS3Path: GenericString = null,
    ExtraPythonLibsS3Path: GenericString = null,
    GlueVersion: GlueVersionString = null,
    NumberOfNodes: Int | Double = null,
    NumberOfWorkers: Int | Double = null,
    PublicKey: GenericString = null,
    PublicKeys: PublicKeysList = null,
    SecurityConfiguration: NameString = null,
    SecurityGroupIds: StringList = null,
    SubnetId: GenericString = null,
    Tags: TagsMap = null,
    WorkerType: WorkerType = null
  ): CreateDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (Arguments != null) __obj.updateDynamic("Arguments")(Arguments.asInstanceOf[js.Any])
    if (ExtraJarsS3Path != null) __obj.updateDynamic("ExtraJarsS3Path")(ExtraJarsS3Path.asInstanceOf[js.Any])
    if (ExtraPythonLibsS3Path != null) __obj.updateDynamic("ExtraPythonLibsS3Path")(ExtraPythonLibsS3Path.asInstanceOf[js.Any])
    if (GlueVersion != null) __obj.updateDynamic("GlueVersion")(GlueVersion.asInstanceOf[js.Any])
    if (NumberOfNodes != null) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes.asInstanceOf[js.Any])
    if (NumberOfWorkers != null) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    if (PublicKeys != null) __obj.updateDynamic("PublicKeys")(PublicKeys.asInstanceOf[js.Any])
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDevEndpointRequest]
  }
}

