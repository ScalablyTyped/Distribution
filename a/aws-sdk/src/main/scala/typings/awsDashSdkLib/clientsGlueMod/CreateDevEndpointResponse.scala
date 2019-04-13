package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDevEndpointResponse extends js.Object {
  /**
    * The map of arguments used to configure this DevEndpoint.
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
    * The name assigned to the new DevEndpoint.
    */
  var EndpointName: js.UndefOr[GenericString] = js.undefined
  /**
    * Path to one or more Java Jars in an S3 bucket that will be loaded in your DevEndpoint.
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
  /**
    * Path(s) to one or more Python libraries in an S3 bucket that will be loaded in your DevEndpoint.
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
  /**
    * The reason for a current failure in this DevEndpoint.
    */
  var FailureReason: js.UndefOr[GenericString] = js.undefined
  /**
    * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined
  /**
    * The AWS ARN of the role assigned to the new DevEndpoint.
    */
  var RoleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The name of the SecurityConfiguration structure being used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
  /**
    * The security groups assigned to the new DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  /**
    * The current status of the new DevEndpoint.
    */
  var Status: js.UndefOr[GenericString] = js.undefined
  /**
    * The subnet ID assigned to the new DevEndpoint.
    */
  var SubnetId: js.UndefOr[GenericString] = js.undefined
  /**
    * The ID of the VPC used by this DevEndpoint.
    */
  var VpcId: js.UndefOr[GenericString] = js.undefined
  /**
    * The address of the YARN endpoint used by this DevEndpoint.
    */
  var YarnEndpointAddress: js.UndefOr[GenericString] = js.undefined
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
}

object CreateDevEndpointResponse {
  @scala.inline
  def apply(
    Arguments: MapValue = null,
    AvailabilityZone: GenericString = null,
    CreatedTimestamp: TimestampValue = null,
    EndpointName: GenericString = null,
    ExtraJarsS3Path: GenericString = null,
    ExtraPythonLibsS3Path: GenericString = null,
    FailureReason: GenericString = null,
    NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined,
    RoleArn: RoleArn = null,
    SecurityConfiguration: NameString = null,
    SecurityGroupIds: StringList = null,
    Status: GenericString = null,
    SubnetId: GenericString = null,
    VpcId: GenericString = null,
    YarnEndpointAddress: GenericString = null,
    ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
  ): CreateDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Arguments != null) __obj.updateDynamic("Arguments")(Arguments)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (EndpointName != null) __obj.updateDynamic("EndpointName")(EndpointName)
    if (ExtraJarsS3Path != null) __obj.updateDynamic("ExtraJarsS3Path")(ExtraJarsS3Path)
    if (ExtraPythonLibsS3Path != null) __obj.updateDynamic("ExtraPythonLibsS3Path")(ExtraPythonLibsS3Path)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (!js.isUndefined(NumberOfNodes)) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    if (YarnEndpointAddress != null) __obj.updateDynamic("YarnEndpointAddress")(YarnEndpointAddress)
    if (!js.isUndefined(ZeppelinRemoteSparkInterpreterPort)) __obj.updateDynamic("ZeppelinRemoteSparkInterpreterPort")(ZeppelinRemoteSparkInterpreterPort)
    __obj.asInstanceOf[CreateDevEndpointResponse]
  }
}

