package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationSettings extends js.Object {
  /**
    * Settings associated with S3 destination
    */
  var S3Settings: js.UndefOr[S3DestinationSettings] = js.native
}

object DestinationSettings {
  @scala.inline
  def apply(S3Settings: S3DestinationSettings = null): DestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (S3Settings != null) __obj.updateDynamic("S3Settings")(S3Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationSettings]
  }
}

