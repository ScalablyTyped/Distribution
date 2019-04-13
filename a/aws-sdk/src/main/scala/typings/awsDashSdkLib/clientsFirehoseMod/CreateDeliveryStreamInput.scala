package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream. This name must be unique per AWS account in the same AWS Region. If the delivery streams are in different accounts or different Regions, you can have multiple delivery streams with the same name.
    */
  var DeliveryStreamName: awsDashSdkLib.clientsFirehoseMod.DeliveryStreamName
  /**
    * The delivery stream type. This parameter can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
    */
  var DeliveryStreamType: js.UndefOr[DeliveryStreamType] = js.undefined
  /**
    * The destination in Amazon ES. You can specify only one destination.
    */
  var ElasticsearchDestinationConfiguration: js.UndefOr[ElasticsearchDestinationConfiguration] = js.undefined
  /**
    * The destination in Amazon S3. You can specify only one destination.
    */
  var ExtendedS3DestinationConfiguration: js.UndefOr[ExtendedS3DestinationConfiguration] = js.undefined
  /**
    * When a Kinesis data stream is used as the source for the delivery stream, a KinesisStreamSourceConfiguration containing the Kinesis data stream Amazon Resource Name (ARN) and the role ARN for the source stream.
    */
  var KinesisStreamSourceConfiguration: js.UndefOr[KinesisStreamSourceConfiguration] = js.undefined
  /**
    * The destination in Amazon Redshift. You can specify only one destination.
    */
  var RedshiftDestinationConfiguration: js.UndefOr[RedshiftDestinationConfiguration] = js.undefined
  /**
    * [Deprecated] The destination in Amazon S3. You can specify only one destination.
    */
  var S3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
  /**
    * The destination in Splunk. You can specify only one destination.
    */
  var SplunkDestinationConfiguration: js.UndefOr[SplunkDestinationConfiguration] = js.undefined
  /**
    * A set of tags to assign to the delivery stream. A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata. For example, you can add friendly names and descriptions or other types of information that can help you distinguish the delivery stream. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. You can specify up to 50 tags when creating a delivery stream.
    */
  var Tags: js.UndefOr[TagDeliveryStreamInputTagList] = js.undefined
}

object CreateDeliveryStreamInput {
  @scala.inline
  def apply(
    DeliveryStreamName: DeliveryStreamName,
    DeliveryStreamType: DeliveryStreamType = null,
    ElasticsearchDestinationConfiguration: ElasticsearchDestinationConfiguration = null,
    ExtendedS3DestinationConfiguration: ExtendedS3DestinationConfiguration = null,
    KinesisStreamSourceConfiguration: KinesisStreamSourceConfiguration = null,
    RedshiftDestinationConfiguration: RedshiftDestinationConfiguration = null,
    S3DestinationConfiguration: S3DestinationConfiguration = null,
    SplunkDestinationConfiguration: SplunkDestinationConfiguration = null,
    Tags: TagDeliveryStreamInputTagList = null
  ): CreateDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName)
    if (DeliveryStreamType != null) __obj.updateDynamic("DeliveryStreamType")(DeliveryStreamType.asInstanceOf[js.Any])
    if (ElasticsearchDestinationConfiguration != null) __obj.updateDynamic("ElasticsearchDestinationConfiguration")(ElasticsearchDestinationConfiguration)
    if (ExtendedS3DestinationConfiguration != null) __obj.updateDynamic("ExtendedS3DestinationConfiguration")(ExtendedS3DestinationConfiguration)
    if (KinesisStreamSourceConfiguration != null) __obj.updateDynamic("KinesisStreamSourceConfiguration")(KinesisStreamSourceConfiguration)
    if (RedshiftDestinationConfiguration != null) __obj.updateDynamic("RedshiftDestinationConfiguration")(RedshiftDestinationConfiguration)
    if (S3DestinationConfiguration != null) __obj.updateDynamic("S3DestinationConfiguration")(S3DestinationConfiguration)
    if (SplunkDestinationConfiguration != null) __obj.updateDynamic("SplunkDestinationConfiguration")(SplunkDestinationConfiguration)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateDeliveryStreamInput]
  }
}

