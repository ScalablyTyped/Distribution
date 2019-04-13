package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevEndpoint extends js.Object {
  /**
    * A map of arguments used to configure the DevEndpoint. Note that currently, we only support "--enable-glue-datacatalog": "" as a valid argument.
    */
  var Arguments: js.UndefOr[MapValue] = js.undefined
  /**
    * The AWS availability zone where this DevEndpoint is located.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.undefined
  /**
    * The point in time at which this DevEndpoint was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined
  /**
    * The name of the DevEndpoint.
    */
  var EndpointName: js.UndefOr[GenericString] = js.undefined
  /**
    * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint. Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
  /**
    * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma. Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not yet supported.
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
  /**
    * The reason for a current failure in this DevEndpoint.
    */
  var FailureReason: js.UndefOr[GenericString] = js.undefined
  /**
    * The point in time at which this DevEndpoint was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[TimestampValue] = js.undefined
  /**
    * The status of the last update.
    */
  var LastUpdateStatus: js.UndefOr[GenericString] = js.undefined
  /**
    * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined
  /**
    * A private IP address to access the DevEndpoint within a VPC, if the DevEndpoint is created within one. The PrivateAddress field is present only when you create the DevEndpoint within your virtual private cloud (VPC).
    */
  var PrivateAddress: js.UndefOr[GenericString] = js.undefined
  /**
    * The public IP address used by this DevEndpoint. The PublicAddress field is present only when you create a non-VPC (virtual private cloud) DevEndpoint.
    */
  var PublicAddress: js.UndefOr[GenericString] = js.undefined
  /**
    * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward compatibility, as the recommended attribute to use is public keys.
    */
  var PublicKey: js.UndefOr[GenericString] = js.undefined
  /**
    * A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is preferred over a single public key because the public keys allow you to have a different private key per client.  If you previously created an endpoint with a public key, you must remove that key to be able to set a list of public keys: call the UpdateDevEndpoint API with the public key content in the deletePublicKeys attribute, and the list of new keys in the addPublicKeys attribute. 
    */
  var PublicKeys: js.UndefOr[PublicKeysList] = js.undefined
  /**
    * The AWS ARN of the IAM role used in this DevEndpoint.
    */
  var RoleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
  /**
    * A list of security group identifiers used in this DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  /**
    * The current status of this DevEndpoint.
    */
  var Status: js.UndefOr[GenericString] = js.undefined
  /**
    * The subnet ID for this DevEndpoint.
    */
  var SubnetId: js.UndefOr[GenericString] = js.undefined
  /**
    * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
    */
  var VpcId: js.UndefOr[GenericString] = js.undefined
  /**
    * The YARN endpoint address used by this DevEndpoint.
    */
  var YarnEndpointAddress: js.UndefOr[GenericString] = js.undefined
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
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
    LastModifiedTimestamp: TimestampValue = null,
    LastUpdateStatus: GenericString = null,
    NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined,
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
    YarnEndpointAddress: GenericString = null,
    ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
  ): DevEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Arguments != null) __obj.updateDynamic("Arguments")(Arguments)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (EndpointName != null) __obj.updateDynamic("EndpointName")(EndpointName)
    if (ExtraJarsS3Path != null) __obj.updateDynamic("ExtraJarsS3Path")(ExtraJarsS3Path)
    if (ExtraPythonLibsS3Path != null) __obj.updateDynamic("ExtraPythonLibsS3Path")(ExtraPythonLibsS3Path)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (LastModifiedTimestamp != null) __obj.updateDynamic("LastModifiedTimestamp")(LastModifiedTimestamp)
    if (LastUpdateStatus != null) __obj.updateDynamic("LastUpdateStatus")(LastUpdateStatus)
    if (!js.isUndefined(NumberOfNodes)) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes)
    if (PrivateAddress != null) __obj.updateDynamic("PrivateAddress")(PrivateAddress)
    if (PublicAddress != null) __obj.updateDynamic("PublicAddress")(PublicAddress)
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey)
    if (PublicKeys != null) __obj.updateDynamic("PublicKeys")(PublicKeys)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    if (YarnEndpointAddress != null) __obj.updateDynamic("YarnEndpointAddress")(YarnEndpointAddress)
    if (!js.isUndefined(ZeppelinRemoteSparkInterpreterPort)) __obj.updateDynamic("ZeppelinRemoteSparkInterpreterPort")(ZeppelinRemoteSparkInterpreterPort)
    __obj.asInstanceOf[DevEndpoint]
  }
}

