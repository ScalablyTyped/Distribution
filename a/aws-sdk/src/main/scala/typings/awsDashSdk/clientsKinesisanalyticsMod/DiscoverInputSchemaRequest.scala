package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverInputSchemaRequest extends js.Object {
  /**
    * The InputProcessingConfiguration to use to preprocess the records before discovering the schema of the records.
    */
  var InputProcessingConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.InputProcessingConfiguration] = js.native
  /**
    * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source discovery purposes.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.InputStartingPositionConfiguration] = js.native
  /**
    * Amazon Resource Name (ARN) of the streaming source.
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.ResourceARN] = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.RoleARN] = js.native
  /**
    * Specify this parameter to discover a schema from data in an Amazon S3 object.
    */
  var S3Configuration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.S3Configuration] = js.native
}

object DiscoverInputSchemaRequest {
  @scala.inline
  def apply(
    InputProcessingConfiguration: InputProcessingConfiguration = null,
    InputStartingPositionConfiguration: InputStartingPositionConfiguration = null,
    ResourceARN: ResourceARN = null,
    RoleARN: RoleARN = null,
    S3Configuration: S3Configuration = null
  ): DiscoverInputSchemaRequest = {
    val __obj = js.Dynamic.literal()
    if (InputProcessingConfiguration != null) __obj.updateDynamic("InputProcessingConfiguration")(InputProcessingConfiguration.asInstanceOf[js.Any])
    if (InputStartingPositionConfiguration != null) __obj.updateDynamic("InputStartingPositionConfiguration")(InputStartingPositionConfiguration.asInstanceOf[js.Any])
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (S3Configuration != null) __obj.updateDynamic("S3Configuration")(S3Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverInputSchemaRequest]
  }
}

