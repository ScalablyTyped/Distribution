package typings.alexaDashSdk.alexaDashSdkMod

import typings.alexaDashSdk.Anon_RequestId
import typings.alexaDashSdk.Anon_Speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-sdk", "directives")
@js.native
object directives extends js.Object {
  @js.native
  class VoicePlayerSpeakDirective protected () extends js.Object {
    /**
      * Creates an instance of VoicePlayerSpeakDirective.
      * @param requestId - requestId from which the call is originated from
      * @param speechContent - Contents of the speech directive either in plain text or SSML.
      */
    def this(requestId: String, speechContent: String) = this()
    var directive: Anon_Speech = js.native
    var header: Anon_RequestId = js.native
  }
  
}

