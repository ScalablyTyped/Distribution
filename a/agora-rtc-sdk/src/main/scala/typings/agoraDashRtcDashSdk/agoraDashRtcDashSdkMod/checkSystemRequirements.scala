package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agora-rtc-sdk", "checkSystemRequirements")
@js.native
object checkSystemRequirements extends js.Object {
  /**
    * Checks the Web Browser Compatibility
    *
    * This method checks the compatibility between the Web SDK and the current web browser.
    *
    * Use this method before calling {@link createClient} to check the compatibility between the system and the web browser.
    *
    * **Note:**
    *
    * Agora has yet to conduct comprehensive tests on Chromium kernel browsers, such as QQ and 360.
    * Agora will gradually achieve compatibility on most mainstream browsers in subsequent versions of the Web SDK.
    * @returns - true: The Web SDK is compatible with the current web browser.
    * - false: The Web SDK is not compatible with the current web browser.
    */
  def apply(): Boolean = js.native
}

