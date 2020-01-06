package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timezone extends js.Object {
  /**
    * The name of the time zone.
    */
  var TimezoneName: js.UndefOr[String] = js.native
}

object Timezone {
  @scala.inline
  def apply(TimezoneName: String = null): Timezone = {
    val __obj = js.Dynamic.literal()
    if (TimezoneName != null) __obj.updateDynamic("TimezoneName")(TimezoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timezone]
  }
}

