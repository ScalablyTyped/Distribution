package typings.actionsDashOnDashGoogle.assistantDashAppMod

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
  sealed trait AUDIO_OUTPUT extends SurfaceCapabilities
  
  /**
    * The ability to output a MediaResponse
    */
  @js.native
  sealed trait MEDIA_RESPONSE_AUDIO extends SurfaceCapabilities
  
  /**
    * The ability to output on a screen
    */
  @js.native
  sealed trait SCREEN_OUTPUT extends SurfaceCapabilities
  
  /**
    * The ability to open a web URL
    */
  @js.native
  sealed trait WEB_BROWSER extends SurfaceCapabilities
  
  /* 0 */ val AUDIO_OUTPUT: typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities.AUDIO_OUTPUT with Double = js.native
  /* 2 */ val MEDIA_RESPONSE_AUDIO: typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities.MEDIA_RESPONSE_AUDIO with Double = js.native
  /* 1 */ val SCREEN_OUTPUT: typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities.SCREEN_OUTPUT with Double = js.native
  /* 3 */ val WEB_BROWSER: typings.actionsDashOnDashGoogle.assistantDashAppMod.SurfaceCapabilities.WEB_BROWSER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SurfaceCapabilities with Double] = js.native
}

