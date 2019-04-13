package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDestinationInput extends js.Object {
  /**
    * Obtain this value from the VersionId result of DeliveryStreamDescription. This value is required, and helps the service perform conditional operations. For example, if there is an interleaving update and this value is null, then the update destination fails. After the update is successful, the VersionId value is updated. The service then performs a merge of the old configuration with the new configuration.
    */
  var CurrentDeliveryStreamVersionId: DeliveryStreamVersionId
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: awsDashSdkLib.clientsFirehoseMod.DeliveryStreamName
  /**
    * The ID of the destination.
    */
  var DestinationId: awsDashSdkLib.clientsFirehoseMod.DestinationId
  /**
    * Describes an update for a destination in Amazon ES.
    */
  var ElasticsearchDestinationUpdate: js.UndefOr[ElasticsearchDestinationUpdate] = js.undefined
  /**
    * Describes an update for a destination in Amazon S3.
    */
  var ExtendedS3DestinationUpdate: js.UndefOr[ExtendedS3DestinationUpdate] = js.undefined
  /**
    * Describes an update for a destination in Amazon Redshift.
    */
  var RedshiftDestinationUpdate: js.UndefOr[RedshiftDestinationUpdate] = js.undefined
  /**
    * [Deprecated] Describes an update for a destination in Amazon S3.
    */
  var S3DestinationUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined
  /**
    * Describes an update for a destination in Splunk.
    */
  var SplunkDestinationUpdate: js.UndefOr[SplunkDestinationUpdate] = js.undefined
}

object UpdateDestinationInput {
  @scala.inline
  def apply(
    CurrentDeliveryStreamVersionId: DeliveryStreamVersionId,
    DeliveryStreamName: DeliveryStreamName,
    DestinationId: DestinationId,
    ElasticsearchDestinationUpdate: ElasticsearchDestinationUpdate = null,
    ExtendedS3DestinationUpdate: ExtendedS3DestinationUpdate = null,
    RedshiftDestinationUpdate: RedshiftDestinationUpdate = null,
    S3DestinationUpdate: S3DestinationUpdate = null,
    SplunkDestinationUpdate: SplunkDestinationUpdate = null
  ): UpdateDestinationInput = {
    val __obj = js.Dynamic.literal(CurrentDeliveryStreamVersionId = CurrentDeliveryStreamVersionId, DeliveryStreamName = DeliveryStreamName, DestinationId = DestinationId)
    if (ElasticsearchDestinationUpdate != null) __obj.updateDynamic("ElasticsearchDestinationUpdate")(ElasticsearchDestinationUpdate)
    if (ExtendedS3DestinationUpdate != null) __obj.updateDynamic("ExtendedS3DestinationUpdate")(ExtendedS3DestinationUpdate)
    if (RedshiftDestinationUpdate != null) __obj.updateDynamic("RedshiftDestinationUpdate")(RedshiftDestinationUpdate)
    if (S3DestinationUpdate != null) __obj.updateDynamic("S3DestinationUpdate")(S3DestinationUpdate)
    if (SplunkDestinationUpdate != null) __obj.updateDynamic("SplunkDestinationUpdate")(SplunkDestinationUpdate)
    __obj.asInstanceOf[UpdateDestinationInput]
  }
}

