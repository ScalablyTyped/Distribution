package typings.applestAtem.mod

import typings.applestAtem.anon.FnCall
import typings.applestAtem.applestAtemStrings.connect
import typings.applestAtem.applestAtemStrings.disconnect
import typings.applestAtem.applestAtemStrings.ping
import typings.applestAtem.applestAtemStrings.stateChanged
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ATEM extends StObject {
  
  /** fades in the DSK */
  def autoDownstreamKey(dskNum: Double): Unit = js.native
  
  /** equivilant of pressing AUTO on the mixer */
  def autoTransition(): Unit = js.native
  def autoTransition(me: MixEffect): Unit = js.native
  
  def changeAudioChannelGain(channel: AudioChannelNumber, gain: Double): Unit = js.native
  
  def changeAudioChannelState(channel: AudioChannelNumber, status: Boolean): Unit = js.native
  
  //
  // audio
  //
  def changeAudioMasterGain(gain: Double): Unit = js.native
  
  /** Changes the input channel that routes to the specified aux bus */
  def changeAuxInput(aux: Double, input: VisionChannelNumber): Unit = js.native
  
  //
  // DSK
  //
  /** equivilant of pressing ON AIR on the mixer (for that DSK) */
  def changeDownstreamKeyOn(dskNum: Double, onAir: Boolean): Unit = js.native
  
  /** equivilant of pressing TIE on the mixer */
  def changeDownstreamKeyTie(dskNum: Double, tie: Boolean): Unit = js.native
  
  /** Route the specified input channel to the preview bus for that Mix Effect */
  def changePreviewInput(channel: VisionChannelNumber): Unit = js.native
  def changePreviewInput(channel: VisionChannelNumber, me: MixEffect): Unit = js.native
  
  //
  // switching
  //
  /** Route the specified input channel to the program bus for that Mix Effect (the LIVE output) */
  def changeProgramInput(channel: VisionChannelNumber): Unit = js.native
  def changeProgramInput(channel: VisionChannelNumber, me: MixEffect): Unit = js.native
  
  //
  // transitions
  //
  /** equivilant to moving the T-bar on the mixer */
  def changeTransitionPosition(position: Double): Unit = js.native
  def changeTransitionPosition(position: Double, me: MixEffect): Unit = js.native
  
  /** equivilant of pressing PREV TRNS on the mixer */
  def changeTransitionPreview(): Unit = js.native
  def changeTransitionPreview(me: MixEffect): Unit = js.native
  
  def changeTransitionType(`type`: TransitionStyle): Unit = js.native
  def changeTransitionType(`type`: TransitionStyle, me: MixEffect): Unit = js.native
  
  /** if true: the next transition will fade the BKGD */
  def changeUpstreamKeyNextBackground(nextTransFadesBkgd: Boolean): Unit = js.native
  def changeUpstreamKeyNextBackground(nextTransFadesBkgd: Boolean, me: MixEffect): Unit = js.native
  
  /** if true: the next transition will fade this USK */
  def changeUpstreamKeyNextState(uskNum: Double, nextTransFadesUSK: Boolean): Unit = js.native
  def changeUpstreamKeyNextState(uskNum: Double, nextTransFadesUSK: Boolean, me: MixEffect): Unit = js.native
  
  //
  // USK
  //
  /** equivilant of pressing ON AIR on the mixer (for that USK) */
  def changeUpstreamKeyState(uskNum: Double, onAir: Boolean): Unit = js.native
  def changeUpstreamKeyState(uskNum: Double, onAir: Boolean, me: MixEffect): Unit = js.native
  
  /**
    * @param address - the IP address or hostname
    * @param port - optional: the port, if a custom one is used. Defaults to 9910
    * @param localPort - optional: a custom local port
    */
  def connect(address: String): Unit = js.native
  def connect(address: String, port: Double): Unit = js.native
  def connect(address: String, port: Double, localPort: Double): Unit = js.native
  def connect(address: String, port: Unit, localPort: Double): Unit = js.native
  
  var connectionState: ConnectionState = js.native
  
  /** equivilant of pressing CUT on the mixer */
  def cutTransition(): Unit = js.native
  def cutTransition(me: MixEffect): Unit = js.native
  
  def deleteMacro(macroId: Double): Unit = js.native
  
  var event: EventEmitter = js.native
  
  /** equivilant of pressing FTB on the mixer */
  def fadeToBlack(): Unit = js.native
  def fadeToBlack(me: MixEffect): Unit = js.native
  
  /** @deprecated use `ATEM.FileUploader` */
  def fileSendNotice(id: js.Tuple2[Any, Any], bankIndex: Double, frameIndex: Double, size: Double): Unit = js.native
  def fileSendNotice(id: js.Tuple2[Any, Any], bankIndex: Double, frameIndex: Double, size: Double, mode: Double): Unit = js.native
  
  var localPackedId: Double = js.native
  
  //
  // Media Player
  //
  def lockMediaPool(bankIndex: Double, frameIndex: Double): Unit = js.native
  
  //
  // event listeners
  //
  @JSName("on")
  def on_connect(event: connect, callback: js.Function1[/* error */ Null, Unit]): Unit = js.native
  //
  // event listeners
  //
  @JSName("on")
  def on_disconnect(event: disconnect, callback: js.Function2[/* error */ Null, /* state */ Null, Unit]): Unit = js.native
  //
  // event listeners
  //
  @JSName("on")
  def on_ping(event: ping, callback: js.Function0[Unit]): Unit = js.native
  //
  // event listeners
  //
  @JSName("on")
  def on_stateChanged(
    event: stateChanged,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* state */ js.UndefOr[State], Unit]
  ): Unit = js.native
  
  @JSName("once")
  var once_Original: FnCall = js.native
  @JSName("once")
  def once_connect(event: connect, callback: js.Function1[/* error */ Null, Unit]): Unit = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, callback: js.Function2[/* error */ Null, /* state */ Null, Unit]): Unit = js.native
  @JSName("once")
  def once_ping(event: ping, callback: js.Function0[Unit]): Unit = js.native
  @JSName("once")
  def once_stateChanged(
    event: stateChanged,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* state */ js.UndefOr[State], Unit]
  ): Unit = js.native
  
  var remotePacketId: js.Array[Double] = js.native
  
  def runMacro(macroId: Double): Unit = js.native
  
  def sendAudioLevelNumber(): Unit = js.native
  def sendAudioLevelNumber(enable: Boolean): Unit = js.native
  
  /** @deprecated use `ATEM.FileUploader` */
  def sendFileData(id: js.Tuple2[Any, Any], buffer: Buffer): Unit = js.native
  
  /** @deprecated use `ATEM.FileUploader` */
  def sendFileDescription(id: js.Tuple2[Any, Any], name: String, hash: Buffer): Unit = js.native
  
  var sessionId: js.Array[Double] = js.native
  
  //
  // macros
  //
  def startRecordMacro(macroId: Double): Unit = js.native
  def startRecordMacro(macroId: Double, name: String): Unit = js.native
  def startRecordMacro(macroId: Double, name: String, description: String): Unit = js.native
  def startRecordMacro(macroId: Double, name: Unit, description: String): Unit = js.native
  
  /** the current state of the vision mixer */
  var state: State = js.native
  
  def stopRecordMacro(): Unit = js.native
  
  def unlockMediaPool(bankIndex: Double): Unit = js.native
}
