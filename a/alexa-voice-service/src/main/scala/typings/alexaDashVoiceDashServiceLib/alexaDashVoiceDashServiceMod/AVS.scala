package typings
package alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AVS extends js.Object {
  var player: alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.Player = js.native
  def on(eventType: alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes): scala.Unit = js.native
  def on(
    eventType: alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def refreshToken(): stdLib.Promise[alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.TokenResponse] = js.native
  def requestMic(): stdLib.Promise[_] = js.native
  def sendAudio(dataView: stdLib.DataView): stdLib.Promise[alexaDashVoiceDashServiceLib.Anon_Xhr] = js.native
  def startRecording(): stdLib.Promise[scala.Unit] = js.native
  def stopRecording(): stdLib.Promise[js.UndefOr[stdLib.DataView]] = js.native
}

