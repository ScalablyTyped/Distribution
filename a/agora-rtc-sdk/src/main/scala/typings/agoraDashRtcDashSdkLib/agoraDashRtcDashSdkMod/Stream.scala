package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  def close(): scala.Unit = js.native
  def disableAudio(): scala.Unit = js.native
  def disableVideo(): scala.Unit = js.native
  def enableAudio(): scala.Unit = js.native
  def enableVideo(): scala.Unit = js.native
  def getAttributes(): js.Any = js.native
  def getAudioLevel(): scala.Double = js.native
  def getId(): scala.Double = js.native
  def getStats(callback: js.Function1[/* stats */ LocalStreamStats | RemoteStreamStats, scala.Unit]): scala.Unit = js.native
  def hasAudio(): scala.Boolean = js.native
  def hasVideo(): scala.Boolean = js.native
  def init(onSuccess: js.Function0[scala.Unit], onFailure: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def play(HTMLElementID: java.lang.String): scala.Unit = js.native
  def setVideoProfile(profile: FirefoxVideoProfile | SafariVideoProfile | ScreenSharingProfile | VideoProfile): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

