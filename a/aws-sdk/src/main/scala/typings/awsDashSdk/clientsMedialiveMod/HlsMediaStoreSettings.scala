package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsMediaStoreSettings extends js.Object {
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined
  /**
    * When set to temporal, output files are stored in non-persistent memory for faster reading and writing.
    */
  var MediaStoreStorageClass: js.UndefOr[HlsMediaStoreStorageClass] = js.undefined
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state.
    */
  var NumRetries: js.UndefOr[__integerMin0] = js.undefined
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
}

object HlsMediaStoreSettings {
  @scala.inline
  def apply(
    ConnectionRetryInterval: Int | Double = null,
    FilecacheDuration: Int | Double = null,
    MediaStoreStorageClass: HlsMediaStoreStorageClass = null,
    NumRetries: Int | Double = null,
    RestartDelay: Int | Double = null
  ): HlsMediaStoreSettings = {
    val __obj = js.Dynamic.literal()
    if (ConnectionRetryInterval != null) __obj.updateDynamic("ConnectionRetryInterval")(ConnectionRetryInterval.asInstanceOf[js.Any])
    if (FilecacheDuration != null) __obj.updateDynamic("FilecacheDuration")(FilecacheDuration.asInstanceOf[js.Any])
    if (MediaStoreStorageClass != null) __obj.updateDynamic("MediaStoreStorageClass")(MediaStoreStorageClass.asInstanceOf[js.Any])
    if (NumRetries != null) __obj.updateDynamic("NumRetries")(NumRetries.asInstanceOf[js.Any])
    if (RestartDelay != null) __obj.updateDynamic("RestartDelay")(RestartDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsMediaStoreSettings]
  }
}

