package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timezone extends js.Object {
  /**
    * The name of the time zone.
    */
  var TimezoneName: js.UndefOr[String] = js.undefined
}

object Timezone {
  @scala.inline
  def apply(TimezoneName: String = null): Timezone = {
    val __obj = js.Dynamic.literal()
    if (TimezoneName != null) __obj.updateDynamic("TimezoneName")(TimezoneName)
    __obj.asInstanceOf[Timezone]
  }
}

