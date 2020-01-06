package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationMediaMessage extends js.Object {
  /**
    * The list of InstallationMedia objects for the AWS account.
    */
  var InstallationMedia: js.UndefOr[InstallationMediaList] = js.native
  /**
    * An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}

object InstallationMediaMessage {
  @scala.inline
  def apply(InstallationMedia: InstallationMediaList = null, Marker: String = null): InstallationMediaMessage = {
    val __obj = js.Dynamic.literal()
    if (InstallationMedia != null) __obj.updateDynamic("InstallationMedia")(InstallationMedia.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationMediaMessage]
  }
}

