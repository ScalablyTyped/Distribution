package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clip extends js.Object {
  /**
    * Settings that determine when a clip begins and how long it lasts.
    */
  var TimeSpan: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.TimeSpan] = js.undefined
}

object Clip {
  @scala.inline
  def apply(TimeSpan: TimeSpan = null): Clip = {
    val __obj = js.Dynamic.literal()
    if (TimeSpan != null) __obj.updateDynamic("TimeSpan")(TimeSpan)
    __obj.asInstanceOf[Clip]
  }
}

