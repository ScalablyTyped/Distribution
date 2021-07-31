package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typings.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typings.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object media {
  
  /** a {@link com.sun.star.media.XPlayer} factory. This helps creating new players. */
  type Manager = XManager
  
  /** This interface provides an easy access to a stream images using their position in the time. */
  trait XFrameGrabber extends StObject {
    
    /**
      * returns the image of the underlying stream at a given position
      * @param fMediaTime the time in seconds of the image to get. This time has to be a positive value inferior to the stream duration.
      */
    def grabFrame(fMediaTime: Double): XGraphic
  }
  object XFrameGrabber {
    
    @scala.inline
    def apply(grabFrame: Double => XGraphic): XFrameGrabber = {
      val __obj = js.Dynamic.literal(grabFrame = js.Any.fromFunction1(grabFrame))
      __obj.asInstanceOf[XFrameGrabber]
    }
    
    @scala.inline
    implicit class XFrameGrabberMutableBuilder[Self <: XFrameGrabber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrabFrame(value: Double => XGraphic): Self = StObject.set(x, "grabFrame", js.Any.fromFunction1(value))
    }
  }
  
  /** the {@link com.sun.star.media.XPlayer} factory interface */
  trait XManager extends StObject {
    
    /**
      * creates a new media player
      * @param aURL the URL of the media to play
      */
    def createPlayer(aURL: String): XPlayer
  }
  object XManager {
    
    @scala.inline
    def apply(createPlayer: String => XPlayer): XManager = {
      val __obj = js.Dynamic.literal(createPlayer = js.Any.fromFunction1(createPlayer))
      __obj.asInstanceOf[XManager]
    }
    
    @scala.inline
    implicit class XManagerMutableBuilder[Self <: XManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatePlayer(value: String => XPlayer): Self = StObject.set(x, "createPlayer", js.Any.fromFunction1(value))
    }
  }
  
  /** is the multimedia stream handling interface. This allows to perform every basic operation on videos and sounds. */
  trait XPlayer extends StObject {
    
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
    def createPlayerWindow(aArguments: SeqEquiv[js.Any]): XPlayerWindow
    
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
      createPlayerWindow: SeqEquiv[js.Any] => XPlayerWindow,
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
    
    @scala.inline
    implicit class XPlayerMutableBuilder[Self <: XPlayer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateFrameGrabber(value: () => XFrameGrabber): Self = StObject.set(x, "createFrameGrabber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreatePlayerWindow(value: SeqEquiv[js.Any] => XPlayerWindow): Self = StObject.set(x, "createPlayerWindow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMediaTime(value: () => Double): Self = StObject.set(x, "getMediaTime", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreferredPlayerWindowSize(value: () => Size): Self = StObject.set(x, "getPreferredPlayerWindowSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVolumeDB(value: () => Double): Self = StObject.set(x, "getVolumeDB", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMute(value: () => Boolean): Self = StObject.set(x, "isMute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPlaybackLoop(value: () => Boolean): Self = StObject.set(x, "isPlaybackLoop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPlaying(value: () => Boolean): Self = StObject.set(x, "isPlaying", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMediaTime(value: Double): Self = StObject.set(x, "MediaTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredPlayerWindowSize(value: Size): Self = StObject.set(x, "PreferredPlayerWindowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetMediaTime(value: Double => Unit): Self = StObject.set(x, "setMediaTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMute(value: Boolean => Unit): Self = StObject.set(x, "setMute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPlaybackLoop(value: Boolean => Unit): Self = StObject.set(x, "setPlaybackLoop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVolumeDB(value: Double => Unit): Self = StObject.set(x, "setVolumeDB", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVolumeDB(value: Double): Self = StObject.set(x, "VolumeDB", value.asInstanceOf[js.Any])
    }
  }
  
  /** interacts with the media player window */
  trait XPlayerWindow
    extends StObject
       with XWindow {
    
    /** gets the current media ratio. */
    var ZoomLevel: typings.activexLibreoffice.com_.sun.star.media.ZoomLevel
    
    /** gets the current media ratio. */
    def getZoomLevel(): ZoomLevel
    
    /**
      * changes the pointer for the player window.
      * @param SystemPointerType a {@link com.sun.star.awt.SystemPointer}
      */
    def setPointerType(SystemPointerType: Double): Unit
    
    /** changes the zoom of the media played by the window. */
    def setZoomLevel(ZoomLevel: ZoomLevel): Boolean
    
    /** redraws the player window */
    def update(): Unit
  }
  object XPlayerWindow {
    
    @scala.inline
    def apply(
      PosSize: Rectangle,
      ZoomLevel: ZoomLevel,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addFocusListener: XFocusListener => Unit,
      addKeyListener: XKeyListener => Unit,
      addMouseListener: XMouseListener => Unit,
      addMouseMotionListener: XMouseMotionListener => Unit,
      addPaintListener: XPaintListener => Unit,
      addWindowListener: XWindowListener => Unit,
      dispose: () => Unit,
      getPosSize: () => Rectangle,
      getZoomLevel: () => ZoomLevel,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removeFocusListener: XFocusListener => Unit,
      removeKeyListener: XKeyListener => Unit,
      removeMouseListener: XMouseListener => Unit,
      removeMouseMotionListener: XMouseMotionListener => Unit,
      removePaintListener: XPaintListener => Unit,
      removeWindowListener: XWindowListener => Unit,
      setEnable: Boolean => Unit,
      setFocus: () => Unit,
      setPointerType: Double => Unit,
      setPosSize: (Double, Double, Double, Double, Double) => Unit,
      setVisible: Boolean => Unit,
      setZoomLevel: ZoomLevel => Boolean,
      update: () => Unit
    ): XPlayerWindow = {
      val __obj = js.Dynamic.literal(PosSize = PosSize.asInstanceOf[js.Any], ZoomLevel = ZoomLevel.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), dispose = js.Any.fromFunction0(dispose), getPosSize = js.Any.fromFunction0(getPosSize), getZoomLevel = js.Any.fromFunction0(getZoomLevel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setPointerType = js.Any.fromFunction1(setPointerType), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoomLevel = js.Any.fromFunction1(setZoomLevel), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[XPlayerWindow]
    }
    
    @scala.inline
    implicit class XPlayerWindowMutableBuilder[Self <: XPlayerWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetZoomLevel(value: () => ZoomLevel): Self = StObject.set(x, "getZoomLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetPointerType(value: Double => Unit): Self = StObject.set(x, "setPointerType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetZoomLevel(value: ZoomLevel => Boolean): Self = StObject.set(x, "setZoomLevel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoomLevel(value: ZoomLevel): Self = StObject.set(x, "ZoomLevel", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
  */
  trait ZoomLevel extends StObject
  object ZoomLevel {
    
    /** specifies that the video should be zoomed to window size */
    @scala.inline
    def FIT_TO_WINDOW: `2` = 2.asInstanceOf[`2`]
    
    /** specifies that the video should be zoomed to window size with using a fixed aspect ratio */
    @scala.inline
    def FIT_TO_WINDOW_FIXED_ASPECT: `3` = 3.asInstanceOf[`3`]
    
    /** specifies that the video should be displayed in fullscreen mode, if available */
    @scala.inline
    def FULLSCREEN: `4` = 4.asInstanceOf[`4`]
    
    /** specifies that the video window itself is not available at all, e.g. in cases of pure audio playback */
    @scala.inline
    def NOT_AVAILABLE: `0` = 0.asInstanceOf[`0`]
    
    /** specifies that the video should be displayed with its original size */
    @scala.inline
    def ORIGINAL: `1` = 1.asInstanceOf[`1`]
    
    /** specifies that the video should be zoomed to a factor of 1:2 */
    @scala.inline
    def ZOOM_1_TO_2: `6` = 6.asInstanceOf[`6`]
    
    /** specifies that the video should be zoomed to a factor of 1:4 */
    @scala.inline
    def ZOOM_1_TO_4: `5` = 5.asInstanceOf[`5`]
    
    /** specifies that the video should be zoomed to a factor of 2:1 */
    @scala.inline
    def ZOOM_2_TO_1: `7` = 7.asInstanceOf[`7`]
    
    /** specifies that the video should be zoomed to a factor of 4:1 */
    @scala.inline
    def ZOOM_4_TO_1: `8` = 8.asInstanceOf[`8`]
  }
}
