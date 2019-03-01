package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the multimedia stream handling interface. This allows to perform every basic operation on videos and sounds. */
trait XPlayer extends js.Object {
  /**
    * gets the stream length
    * @returns the stream length in second
    */
  val Duration: scala.Double
  /**
    * gets the current position of the cursor in the stream
    * @returns the cursor position in seconds
    */
  var MediaTime: scala.Double
  /**
    * gets the preferred window size
    * @returns the {@link com.sun.star.awt.Size}
    */
  val PreferredPlayerWindowSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * gets the current audio volume in decibel
    * @returns the volume in decibel
    */
  var VolumeDB: scala.Double
  /** gets a frame grabber for this stream. */
  def createFrameGrabber(): XFrameGrabber
  /**
    * gets a new player window for this stream control
    * @param aArguments arguments passed to the window during its creation.
    */
  def createPlayerWindow(aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): XPlayerWindow
  /**
    * gets the stream length
    * @returns the stream length in second
    */
  def getDuration(): scala.Double
  /**
    * gets the current position of the cursor in the stream
    * @returns the cursor position in seconds
    */
  def getMediaTime(): scala.Double
  /**
    * gets the preferred window size
    * @returns the {@link com.sun.star.awt.Size}
    */
  def getPreferredPlayerWindowSize(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * gets the current audio volume in decibel
    * @returns the volume in decibel
    */
  def getVolumeDB(): scala.Double
  /**
    * gets whether the volume is temporarily down to `0` or not.
    * @returns `TRUE` if the volume is temporarily set to `0` , `FALSE` otherwise.
    */
  def isMute(): scala.Boolean
  /**
    * indicates whether the stream reading will restart after the end of the stream.
    * @returns `TRUE` if the stream will loop, `FALSE` otherwise.
    */
  def isPlaybackLoop(): scala.Boolean
  /**
    * indicates whether the stream is played or not.
    * @returns `TRUE` if the stream is played, `FALSE` otherwise
    */
  def isPlaying(): scala.Boolean
  /**
    * sets the new cursor position in the media stream. After using this method the stream is stopped.
    * @param fTime the new position to set in seconds
    */
  def setMediaTime(fTime: scala.Double): scala.Unit
  /**
    * sets the volume to `0` or to its previous value.
    * @param bSet sets the volume to `0` if `TRUE` , and switch to the previous non-null value if `FALSE`
    */
  def setMute(bSet: scala.Boolean): scala.Unit
  /**
    * sets whether the stream reading should restart at the stream start after the end of the stream.
    * @param bSet loops if set to `TRUE` , otherwise stops at the end of the stream.
    */
  def setPlaybackLoop(bSet: scala.Boolean): scala.Unit
  /**
    * sets the audio volume in decibel.
    * @param nDB the new volume in Decibel
    */
  def setVolumeDB(nDB: scala.Double): scala.Unit
  /** starts reading the stream from the current position. */
  def start(): scala.Unit
  /** stops reading the stream and leave the cursor at its current position. */
  def stop(): scala.Unit
}

object XPlayer {
  @scala.inline
  def apply(
    Duration: scala.Double,
    MediaTime: scala.Double,
    PreferredPlayerWindowSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    VolumeDB: scala.Double,
    createFrameGrabber: js.Function0[XFrameGrabber],
    createPlayerWindow: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], XPlayerWindow],
    getDuration: js.Function0[scala.Double],
    getMediaTime: js.Function0[scala.Double],
    getPreferredPlayerWindowSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getVolumeDB: js.Function0[scala.Double],
    isMute: js.Function0[scala.Boolean],
    isPlaybackLoop: js.Function0[scala.Boolean],
    isPlaying: js.Function0[scala.Boolean],
    setMediaTime: js.Function1[scala.Double, scala.Unit],
    setMute: js.Function1[scala.Boolean, scala.Unit],
    setPlaybackLoop: js.Function1[scala.Boolean, scala.Unit],
    setVolumeDB: js.Function1[scala.Double, scala.Unit],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit]
  ): XPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Duration")(Duration)
    __obj.updateDynamic("MediaTime")(MediaTime)
    __obj.updateDynamic("PreferredPlayerWindowSize")(PreferredPlayerWindowSize)
    __obj.updateDynamic("VolumeDB")(VolumeDB)
    __obj.updateDynamic("createFrameGrabber")(createFrameGrabber)
    __obj.updateDynamic("createPlayerWindow")(createPlayerWindow)
    __obj.updateDynamic("getDuration")(getDuration)
    __obj.updateDynamic("getMediaTime")(getMediaTime)
    __obj.updateDynamic("getPreferredPlayerWindowSize")(getPreferredPlayerWindowSize)
    __obj.updateDynamic("getVolumeDB")(getVolumeDB)
    __obj.updateDynamic("isMute")(isMute)
    __obj.updateDynamic("isPlaybackLoop")(isPlaybackLoop)
    __obj.updateDynamic("isPlaying")(isPlaying)
    __obj.updateDynamic("setMediaTime")(setMediaTime)
    __obj.updateDynamic("setMute")(setMute)
    __obj.updateDynamic("setPlaybackLoop")(setPlaybackLoop)
    __obj.updateDynamic("setVolumeDB")(setVolumeDB)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[XPlayer]
  }
}

