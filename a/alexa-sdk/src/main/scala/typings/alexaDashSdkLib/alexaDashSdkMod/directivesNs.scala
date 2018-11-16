package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-sdk", "directives")
@js.native
object directivesNs extends js.Object {
  @js.native
  class VoicePlayerSpeakDirective protected () extends js.Object {
    /**
             * Creates an instance of VoicePlayerSpeakDirective.
             * @param requestId - requestId from which the call is originated from
             * @param speechContent - Contents of the speech directive either in plain text or SSML.
             */
    def this(requestId: java.lang.String, speechContent: java.lang.String) = this()
    var directive: alexaDashSdkLib.Anon_Speech = js.native
    var header: alexaDashSdkLib.Anon_RequestId = js.native
  }
  
}

