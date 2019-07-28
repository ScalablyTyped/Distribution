package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverInputSchemaRequest extends js.Object {
  /**
    * The InputProcessingConfiguration to use to preprocess the records before discovering the schema of the records.
    */
  var InputProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputProcessingConfiguration] = js.undefined
  /**
    * The point at which you want Kinesis Data Analytics to start reading records from the specified streaming source discovery purposes.
    */
  var InputStartingPositionConfiguration: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputStartingPositionConfiguration
  ] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the streaming source.
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ResourceARN] = js.undefined
  /**
    * Specify this parameter to discover a schema from data in an Amazon S3 object.
    */
  var S3Configuration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.S3Configuration] = js.undefined
  /**
    * The ARN of the role that is used to access the streaming source.
    */
  var ServiceExecutionRole: RoleARN
}

object DiscoverInputSchemaRequest {
  @scala.inline
  def apply(
    ServiceExecutionRole: RoleARN,
    InputProcessingConfiguration: InputProcessingConfiguration = null,
    InputStartingPositionConfiguration: InputStartingPositionConfiguration = null,
    ResourceARN: ResourceARN = null,
    S3Configuration: S3Configuration = null
  ): DiscoverInputSchemaRequest = {
    val __obj = js.Dynamic.literal(ServiceExecutionRole = ServiceExecutionRole)
    if (InputProcessingConfiguration != null) __obj.updateDynamic("InputProcessingConfiguration")(InputProcessingConfiguration)
    if (InputStartingPositionConfiguration != null) __obj.updateDynamic("InputStartingPositionConfiguration")(InputStartingPositionConfiguration)
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (S3Configuration != null) __obj.updateDynamic("S3Configuration")(S3Configuration)
    __obj.asInstanceOf[DiscoverInputSchemaRequest]
  }
}

