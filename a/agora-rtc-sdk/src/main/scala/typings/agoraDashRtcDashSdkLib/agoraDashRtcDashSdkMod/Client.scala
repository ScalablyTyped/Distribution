package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  def disableDualStream(onSuccess: js.Function0[scala.Unit], onFailure: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def enableDualStream(onSuccess: js.Function0[scala.Unit], onFailure: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def init(
    appId: java.lang.String,
    onSuccess: js.Function0[scala.Unit],
    onFailure: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def join(
    tokenOrKey: java.lang.String,
    channel: java.lang.String,
    uid: scala.Double,
    onSuccess: js.Function1[/* uid */ scala.Double, scala.Unit],
    onFailure: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def leave(onSuccess: js.Function0[scala.Unit], onFailure: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(eventName: ClientEvent, callback: js.Function1[/* evt */ js.Any, scala.Unit]): scala.Unit = js.native
  def publish(stream: Stream, onFailure: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def renewChannelKey(
    key: java.lang.String,
    onSuccess: js.Function0[scala.Unit],
    onFailure: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("setEncryptionMode")
  def `setEncryptionMode_aes-128-ecb`(encryptionMode: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.`aes-128-ecb`): scala.Unit = js.native
  @JSName("setEncryptionMode")
  def `setEncryptionMode_aes-128-xts`(encryptionMode: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.`aes-128-xts`): scala.Unit = js.native
  @JSName("setEncryptionMode")
  def `setEncryptionMode_aes-256-xts`(encryptionMode: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.`aes-256-xts`): scala.Unit = js.native
  def setEncryptionSecret(password: java.lang.String): scala.Unit = js.native
  def setLowStreamParameter(param: agoraDashRtcDashSdkLib.Anon_Birate): scala.Unit = js.native
  def setProxyServer(): scala.Unit = js.native
  def setProxyServer(proxyServer: java.lang.String): scala.Unit = js.native
  def setRemoteVideoStreamType(stream: Stream, streamType: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`0`): scala.Unit = js.native
  def setRemoteVideoStreamType(stream: Stream, streamType: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`1`): scala.Unit = js.native
  def setTurnServer(): scala.Unit = js.native
  def setTurnServer(turnServer: agoraDashRtcDashSdkLib.Anon_Forceturn): scala.Unit = js.native
  def subscribe(stream: Stream, onFailure: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def unpublish(stream: Stream, onFailure: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def unsubscribe(stream: Stream, onFailure: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

