package typings.apolloProtobufjs.mod.common

import typings.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Timestamp message. */
trait ITimestamp extends js.Object {
  var nanos: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double | Long] = js.undefined
}

object ITimestamp {
  @scala.inline
  def apply(nanos: Int | Double = null, seconds: Double | Long = null): ITimestamp = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimestamp]
  }
}

