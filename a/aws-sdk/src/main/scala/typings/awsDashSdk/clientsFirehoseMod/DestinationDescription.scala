package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationDescription extends js.Object {
  /**
    * The ID of the destination.
    */
  var DestinationId: typings.awsDashSdk.clientsFirehoseMod.DestinationId
  /**
    * The destination in Amazon ES.
    */
  var ElasticsearchDestinationDescription: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ElasticsearchDestinationDescription] = js.undefined
  /**
    * The destination in Amazon S3.
    */
  var ExtendedS3DestinationDescription: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ExtendedS3DestinationDescription] = js.undefined
  /**
    * The destination in Amazon Redshift.
    */
  var RedshiftDestinationDescription: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.RedshiftDestinationDescription] = js.undefined
  /**
    * [Deprecated] The destination in Amazon S3.
    */
  var S3DestinationDescription: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.S3DestinationDescription] = js.undefined
  /**
    * The destination in Splunk.
    */
  var SplunkDestinationDescription: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.SplunkDestinationDescription] = js.undefined
}

object DestinationDescription {
  @scala.inline
  def apply(
    DestinationId: DestinationId,
    ElasticsearchDestinationDescription: ElasticsearchDestinationDescription = null,
    ExtendedS3DestinationDescription: ExtendedS3DestinationDescription = null,
    RedshiftDestinationDescription: RedshiftDestinationDescription = null,
    S3DestinationDescription: S3DestinationDescription = null,
    SplunkDestinationDescription: SplunkDestinationDescription = null
  ): DestinationDescription = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId)
    if (ElasticsearchDestinationDescription != null) __obj.updateDynamic("ElasticsearchDestinationDescription")(ElasticsearchDestinationDescription)
    if (ExtendedS3DestinationDescription != null) __obj.updateDynamic("ExtendedS3DestinationDescription")(ExtendedS3DestinationDescription)
    if (RedshiftDestinationDescription != null) __obj.updateDynamic("RedshiftDestinationDescription")(RedshiftDestinationDescription)
    if (S3DestinationDescription != null) __obj.updateDynamic("S3DestinationDescription")(S3DestinationDescription)
    if (SplunkDestinationDescription != null) __obj.updateDynamic("SplunkDestinationDescription")(SplunkDestinationDescription)
    __obj.asInstanceOf[DestinationDescription]
  }
}

