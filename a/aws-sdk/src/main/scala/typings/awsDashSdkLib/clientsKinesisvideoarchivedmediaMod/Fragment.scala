package typings
package awsDashSdkLib.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fragment extends js.Object {
  /**
    * The playback duration or other time value associated with the fragment.
    */
  var FragmentLengthInMilliseconds: js.UndefOr[Long] = js.undefined
  /**
    * The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
    */
  var FragmentNumber: js.UndefOr[String] = js.undefined
  /**
    * The total fragment size, including information about the fragment and contained media data.
    */
  var FragmentSizeInBytes: js.UndefOr[Long] = js.undefined
  /**
    * The timestamp from the producer corresponding to the fragment.
    */
  var ProducerTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The timestamp from the AWS server corresponding to the fragment.
    */
  var ServerTimestamp: js.UndefOr[Timestamp] = js.undefined
}

object Fragment {
  @scala.inline
  def apply(
    FragmentLengthInMilliseconds: js.UndefOr[Long] = js.undefined,
    FragmentNumber: String = null,
    FragmentSizeInBytes: js.UndefOr[Long] = js.undefined,
    ProducerTimestamp: Timestamp = null,
    ServerTimestamp: Timestamp = null
  ): Fragment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FragmentLengthInMilliseconds)) __obj.updateDynamic("FragmentLengthInMilliseconds")(FragmentLengthInMilliseconds)
    if (FragmentNumber != null) __obj.updateDynamic("FragmentNumber")(FragmentNumber)
    if (!js.isUndefined(FragmentSizeInBytes)) __obj.updateDynamic("FragmentSizeInBytes")(FragmentSizeInBytes)
    if (ProducerTimestamp != null) __obj.updateDynamic("ProducerTimestamp")(ProducerTimestamp)
    if (ServerTimestamp != null) __obj.updateDynamic("ServerTimestamp")(ServerTimestamp)
    __obj.asInstanceOf[Fragment]
  }
}

