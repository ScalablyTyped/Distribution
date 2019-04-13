package typings
package alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AVS extends js.Object {
  var player: Player = js.native
  def on(eventType: EventTypes): scala.Unit = js.native
  def on(eventType: EventTypes, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def refreshToken(): js.Promise[TokenResponse] = js.native
  def requestMic(): js.Promise[_] = js.native
  def sendAudio(dataView: stdLib.DataView): js.Promise[alexaDashVoiceDashServiceLib.Anon_Response] = js.native
  def startRecording(): js.Promise[scala.Unit] = js.native
  def stopRecording(): js.Promise[js.UndefOr[stdLib.DataView]] = js.native
}

