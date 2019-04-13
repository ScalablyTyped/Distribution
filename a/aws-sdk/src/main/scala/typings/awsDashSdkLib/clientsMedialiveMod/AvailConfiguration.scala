package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailConfiguration extends js.Object {
  /**
    * Ad avail settings.
    */
  var AvailSettings: js.UndefOr[AvailSettings] = js.undefined
}

object AvailConfiguration {
  @scala.inline
  def apply(AvailSettings: AvailSettings = null): AvailConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AvailSettings != null) __obj.updateDynamic("AvailSettings")(AvailSettings)
    __obj.asInstanceOf[AvailConfiguration]
  }
}

