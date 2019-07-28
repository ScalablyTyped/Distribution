package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceDescription extends js.Object {
  /**
    * The KinesisStreamSourceDescription value for the source Kinesis data stream.
    */
  var KinesisStreamSourceDescription: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.KinesisStreamSourceDescription] = js.undefined
}

object SourceDescription {
  @scala.inline
  def apply(KinesisStreamSourceDescription: KinesisStreamSourceDescription = null): SourceDescription = {
    val __obj = js.Dynamic.literal()
    if (KinesisStreamSourceDescription != null) __obj.updateDynamic("KinesisStreamSourceDescription")(KinesisStreamSourceDescription)
    __obj.asInstanceOf[SourceDescription]
  }
}

