package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationSettings extends js.Object {
  /**
    * Settings associated with S3 destination
    */
  var S3Settings: js.UndefOr[S3DestinationSettings] = js.undefined
}

object DestinationSettings {
  @scala.inline
  def apply(S3Settings: S3DestinationSettings = null): DestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (S3Settings != null) __obj.updateDynamic("S3Settings")(S3Settings)
    __obj.asInstanceOf[DestinationSettings]
  }
}

