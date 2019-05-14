package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NfsMountOptions extends js.Object {
  /**
    * The specific NFS version that you want DataSync to use to mount your NFS share. If you don't specify a version, DataSync defaults to AUTOMATIC. That is, DataSync automatically selects a version based on negotiation with the NFS server.
    */
  var Version: js.UndefOr[NfsVersion] = js.undefined
}

object NfsMountOptions {
  @scala.inline
  def apply(Version: NfsVersion = null): NfsMountOptions = {
    val __obj = js.Dynamic.literal()
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfsMountOptions]
  }
}

