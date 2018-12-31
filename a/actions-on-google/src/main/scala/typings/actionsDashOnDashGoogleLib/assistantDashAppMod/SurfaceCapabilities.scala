package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SurfaceCapabilities extends js.Object

@JSImport("actions-on-google/assistant-app", "SurfaceCapabilities")
@js.native
object SurfaceCapabilities extends js.Object {
  /**
    * The ability to output audio.
    */
  @js.native
  sealed trait AUDIO_OUTPUT
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SurfaceCapabilities
  
  /**
    * The ability to output a MediaResponse
    */
  @js.native
  sealed trait MEDIA_RESPONSE_AUDIO
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SurfaceCapabilities
  
  /**
    * The ability to output on a screen
    */
  @js.native
  sealed trait SCREEN_OUTPUT
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SurfaceCapabilities
  
  /**
    * The ability to open a web URL
    */
  @js.native
  sealed trait WEB_BROWSER
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SurfaceCapabilities
  
  val AUDIO_OUTPUT: AUDIO_OUTPUT with java.lang.String = js.native
  val MEDIA_RESPONSE_AUDIO: MEDIA_RESPONSE_AUDIO with java.lang.String = js.native
  val SCREEN_OUTPUT: SCREEN_OUTPUT with java.lang.String = js.native
  val WEB_BROWSER: WEB_BROWSER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    actionsDashOnDashGoogleLib.assistantDashAppMod.SurfaceCapabilities with java.lang.String
  ] = js.native
}

