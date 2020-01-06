package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsWebdavSettings extends js.Object {
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.native
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.native
  /**
    * Specify whether or not to use chunked transfer encoding to WebDAV.
    */
  var HttpTransferMode: js.UndefOr[HlsWebdavHttpTransferMode] = js.native
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state.
    */
  var NumRetries: js.UndefOr[__integerMin0] = js.native
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[__integerMin0Max15] = js.native
}

object HlsWebdavSettings {
  @scala.inline
  def apply(
    ConnectionRetryInterval: Int | Double = null,
    FilecacheDuration: Int | Double = null,
    HttpTransferMode: HlsWebdavHttpTransferMode = null,
    NumRetries: Int | Double = null,
    RestartDelay: Int | Double = null
  ): HlsWebdavSettings = {
    val __obj = js.Dynamic.literal()
    if (ConnectionRetryInterval != null) __obj.updateDynamic("ConnectionRetryInterval")(ConnectionRetryInterval.asInstanceOf[js.Any])
    if (FilecacheDuration != null) __obj.updateDynamic("FilecacheDuration")(FilecacheDuration.asInstanceOf[js.Any])
    if (HttpTransferMode != null) __obj.updateDynamic("HttpTransferMode")(HttpTransferMode.asInstanceOf[js.Any])
    if (NumRetries != null) __obj.updateDynamic("NumRetries")(NumRetries.asInstanceOf[js.Any])
    if (RestartDelay != null) __obj.updateDynamic("RestartDelay")(RestartDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsWebdavSettings]
  }
}

