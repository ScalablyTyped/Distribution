package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallToRemoteAccessSessionResult extends js.Object {
  /**
    * An app to upload or that has been uploaded.
    */
  var appUpload: js.UndefOr[Upload] = js.undefined
}

object InstallToRemoteAccessSessionResult {
  @scala.inline
  def apply(appUpload: Upload = null): InstallToRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    if (appUpload != null) __obj.updateDynamic("appUpload")(appUpload)
    __obj.asInstanceOf[InstallToRemoteAccessSessionResult]
  }
}

