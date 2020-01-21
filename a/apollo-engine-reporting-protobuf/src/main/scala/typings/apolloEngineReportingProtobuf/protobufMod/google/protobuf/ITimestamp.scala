package typings.apolloEngineReportingProtobuf.protobufMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Timestamp. */
trait ITimestamp extends js.Object {
  /** Timestamp nanos */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  /** Timestamp seconds */
  var seconds: js.UndefOr[Double | Null] = js.undefined
}

object ITimestamp {
  @scala.inline
  def apply(nanos: Int | Double = null, seconds: Int | Double = null): ITimestamp = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimestamp]
  }
}

