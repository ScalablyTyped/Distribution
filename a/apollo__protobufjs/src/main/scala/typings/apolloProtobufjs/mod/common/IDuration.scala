package typings.apolloProtobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Duration message. */
trait IDuration extends js.Object {
  var nanos: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double | typings.long.mod.^ ] = js.undefined
}

object IDuration {
  @scala.inline
  def apply(nanos: Int | Double = null, seconds: Double | typings.long.mod.^  = null): IDuration = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDuration]
  }
}

