package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsAkamaiSettings extends js.Object {
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.native
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.native
  /**
    * Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable this feature.
    */
  var HttpTransferMode: js.UndefOr[HlsAkamaiHttpTransferMode] = js.native
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state.
    */
  var NumRetries: js.UndefOr[__integerMin0] = js.native
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[__integerMin0Max15] = js.native
  /**
    * Salt for authenticated Akamai.
    */
  var Salt: js.UndefOr[__string] = js.native
  /**
    * Token parameter for authenticated akamai. If not specified, _gda_ is used.
    */
  var Token: js.UndefOr[__string] = js.native
}

object HlsAkamaiSettings {
  @scala.inline
  def apply(
    ConnectionRetryInterval: Int | Double = null,
    FilecacheDuration: Int | Double = null,
    HttpTransferMode: HlsAkamaiHttpTransferMode = null,
    NumRetries: Int | Double = null,
    RestartDelay: Int | Double = null,
    Salt: __string = null,
    Token: __string = null
  ): HlsAkamaiSettings = {
    val __obj = js.Dynamic.literal()
    if (ConnectionRetryInterval != null) __obj.updateDynamic("ConnectionRetryInterval")(ConnectionRetryInterval.asInstanceOf[js.Any])
    if (FilecacheDuration != null) __obj.updateDynamic("FilecacheDuration")(FilecacheDuration.asInstanceOf[js.Any])
    if (HttpTransferMode != null) __obj.updateDynamic("HttpTransferMode")(HttpTransferMode.asInstanceOf[js.Any])
    if (NumRetries != null) __obj.updateDynamic("NumRetries")(NumRetries.asInstanceOf[js.Any])
    if (RestartDelay != null) __obj.updateDynamic("RestartDelay")(RestartDelay.asInstanceOf[js.Any])
    if (Salt != null) __obj.updateDynamic("Salt")(Salt.asInstanceOf[js.Any])
    if (Token != null) __obj.updateDynamic("Token")(Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsAkamaiSettings]
  }
}

