package typings.activexLibreoffice.com_.sun.star.media

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.awt.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the multimedia stream handling interface. This allows to perform every basic operation on videos and sounds. */
trait XPlayer extends js.Object {
  /**
    * gets the stream length
    * @returns the stream length in second
    */
  val Duration: Double
  /**
    * gets the current position of the cursor in the stream
    * @returns the cursor position in seconds
    */
  var MediaTime: Double
  /**
    * gets the preferred window size
    * @returns the {@link com.sun.star.awt.Size}
    */
  val PreferredPlayerWindowSize: Size
  /**
    * gets the current audio volume in decibel
    * @returns the volume in decibel
    */
  var VolumeDB: Double
  /** gets a frame grabber for this stream. */
  def createFrameGrabber(): XFrameGrabber
  /**
    * gets a new player window for this stream control
    * @param aArguments arguments passed to the window during its creation.
    */
  def createPlayerWindow(aArguments: SeqEquiv[_]): XPlayerWindow
  /**
    * gets the stream length
    * @returns the stream length in second
    */
  def getDuration(): Double
  /**
    * gets the current position of the cursor in the stream
    * @returns the cursor position in seconds
    */
  def getMediaTime(): Double
  /**
    * gets the preferred window size
    * @returns the {@link com.sun.star.awt.Size}
    */
  def getPreferredPlayerWindowSize(): Size
  /**
    * gets the current audio volume in decibel
    * @returns the volume in decibel
    */
  def getVolumeDB(): Double
  /**
    * gets whether the volume is temporarily down to `0` or not.
    * @returns `TRUE` if the volume is temporarily set to `0` , `FALSE` otherwise.
    */
  def isMute(): Boolean
  /**
    * indicates whether the stream reading will restart after the end of the stream.
    * @returns `TRUE` if the stream will loop, `FALSE` otherwise.
    */
  def isPlaybackLoop(): Boolean
  /**
    * indicates whether the stream is played or not.
    * @returns `TRUE` if the stream is played, `FALSE` otherwise
    */
  def isPlaying(): Boolean
  /**
    * sets the new cursor position in the media stream. After using this method the stream is stopped.
    * @param fTime the new position to set in seconds
    */
  def setMediaTime(fTime: Double): Unit
  /**
    * sets the volume to `0` or to its previous value.
    * @param bSet sets the volume to `0` if `TRUE` , and switch to the previous non-null value if `FALSE`
    */
  def setMute(bSet: Boolean): Unit
  /**
    * sets whether the stream reading should restart at the stream start after the end of the stream.
    * @param bSet loops if set to `TRUE` , otherwise stops at the end of the stream.
    */
  def setPlaybackLoop(bSet: Boolean): Unit
  /**
    * sets the audio volume in decibel.
    * @param nDB the new volume in Decibel
    */
  def setVolumeDB(nDB: Double): Unit
  /** starts reading the stream from the current position. */
  def start(): Unit
  /** stops reading the stream and leave the cursor at its current position. */
  def stop(): Unit
}

object XPlayer {
  @scala.inline
  def apply(
    Duration: Double,
    MediaTime: Double,
    PreferredPlayerWindowSize: Size,
    VolumeDB: Double,
    createFrameGrabber: () => XFrameGrabber,
    createPlayerWindow: SeqEquiv[_] => XPlayerWindow,
    getDuration: () => Double,
    getMediaTime: () => Double,
    getPreferredPlayerWindowSize: () => Size,
    getVolumeDB: () => Double,
    isMute: () => Boolean,
    isPlaybackLoop: () => Boolean,
    isPlaying: () => Boolean,
    setMediaTime: Double => Unit,
    setMute: Boolean => Unit,
    setPlaybackLoop: Boolean => Unit,
    setVolumeDB: Double => Unit,
    start: () => Unit,
    stop: () => Unit
  ): XPlayer = {
    val __obj = js.Dynamic.literal(Duration = Duration.asInstanceOf[js.Any], MediaTime = MediaTime.asInstanceOf[js.Any], PreferredPlayerWindowSize = PreferredPlayerWindowSize.asInstanceOf[js.Any], VolumeDB = VolumeDB.asInstanceOf[js.Any], createFrameGrabber = js.Any.fromFunction0(createFrameGrabber), createPlayerWindow = js.Any.fromFunction1(createPlayerWindow), getDuration = js.Any.fromFunction0(getDuration), getMediaTime = js.Any.fromFunction0(getMediaTime), getPreferredPlayerWindowSize = js.Any.fromFunction0(getPreferredPlayerWindowSize), getVolumeDB = js.Any.fromFunction0(getVolumeDB), isMute = js.Any.fromFunction0(isMute), isPlaybackLoop = js.Any.fromFunction0(isPlaybackLoop), isPlaying = js.Any.fromFunction0(isPlaying), setMediaTime = js.Any.fromFunction1(setMediaTime), setMute = js.Any.fromFunction1(setMute), setPlaybackLoop = js.Any.fromFunction1(setPlaybackLoop), setVolumeDB = js.Any.fromFunction1(setVolumeDB), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[XPlayer]
  }
}

