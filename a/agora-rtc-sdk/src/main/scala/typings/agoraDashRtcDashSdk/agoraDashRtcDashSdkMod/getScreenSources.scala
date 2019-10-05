package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agora-rtc-sdk", "getScreenSources")
@js.native
object getScreenSources extends js.Object {
  /**
    * Gets the Sources for Screen-sharing
    *
    * To share the screen on Electron, call this method to get the screen sources. See [Share the Screen](../../screensharing_web?platform=Web#electron) for details.
    *
    * If this method succeeds, the SDK returns a list of screen sources in an array of {@link DesktopCapturerSource} objects.
    * @example **Sample Code**
    * ```javascript
    * AgoraRTC.getScreenSources(function(err, sources) {
    *   console.log(sources)
    * }
    * ```
    */
  def apply(callback: js.Function1[/* sources */ js.Array[DesktopCapturerSource], Unit]): Unit = js.native
}

