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
  def refreshToken(): js.Promise[alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.TokenResponse] = js.native
  def requestMic(): js.Promise[_] = js.native
  def sendAudio(dataView: stdLib.DataView): js.Promise[alexaDashVoiceDashServiceLib.Anon_Xhr] = js.native
  def startRecording(): js.Promise[scala.Unit] = js.native
  def stopRecording(): js.Promise[js.UndefOr[stdLib.DataView]] = js.native
}

