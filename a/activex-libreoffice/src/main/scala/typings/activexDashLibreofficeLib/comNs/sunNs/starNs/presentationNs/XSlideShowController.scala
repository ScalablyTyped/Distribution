package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface to control a running slide show.
  * @see XPresentation2
  * @since OOo 3.0
  */
trait XSlideShowController extends js.Object {
  /** If this attribute is set to `TRUE` , the window of the slide show is always on top of all other windows. */
  var AlwaysOnTop: scala.Boolean
  /** returns slide that is currently displayed */
  val CurrentSlide: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
  /** returns the index of the current slide. */
  val CurrentSlideIndex: scala.Double
  /** If this attribute is `TRUE` , the mouse is visible during the slide show. */
  var MouseVisible: scala.Boolean
  /** the index for the slide that is displayed next. */
  val NextSlideIndex: scala.Double
  /** This attribute changes the color of the pen. */
  var PenColor: scala.Double
  /**
    * This attribute changes the width of the pen.
    * @since LibreOffice 4.2
    */
  var PenWidth: scala.Double
  /**
    * @returns the number of slides in this slide show.
    * @see getSlideByIndex
    */
  val SlideCount: scala.Double
  /**
    * returns the actual {@link XSlideShow} instance that runs the slide show. ;  Normally all navigation should be done using this controller and not the
    * {@link XSlideShow} itself.
    */
  val SlideShow: XSlideShow
  /**
    * If this is `TRUE` , a pen is shown during presentation.
    *
    * You can draw on the presentation with this pen.
    */
  var UsePen: scala.Boolean
  /**
    * activates the user interface of this slide show.
    * @see deactivate()
    * @see isActive()
    */
  def activate(): scala.Unit
  /** adds a listener that receives events while the slide show is running. */
  def addSlideShowListener(Listener: XSlideShowListener): scala.Unit
  /**
    * pauses the slide show and blanks the screen in the given color.
    *
    * Change attribute Pause to false to unpause the slide show.
    */
  def blankScreen(Color: scala.Double): scala.Unit
  /**
    * can be called to deactivate the user interface of this slide show.
    *
    * A deactivated
    * @see activate()
    * @see isActive()
    */
  def deactivate(): scala.Unit
  /** returns slide that is currently displayed */
  def getCurrentSlide(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
  /** returns the index of the current slide. */
  def getCurrentSlideIndex(): scala.Double
  /** the index for the slide that is displayed next. */
  def getNextSlideIndex(): scala.Double
  /**
    * gives access to the slides that will be shown in this slide show.
    *
    * Slides are returned in the order they will be displayed in the presentation which can be different than the orders of slides in the document. Not all
    * slides must be present and each slide can be used more than once.
    * @param Index specifies the position in the list of slides that are displayed in this slide show. The first index is 0.
    * @returns the slide at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    */
  def getSlideByIndex(Index: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
  /**
    * @returns the number of slides in this slide show.
    * @see getSlideByIndex
    */
  def getSlideCount(): scala.Double
  /**
    * returns the actual {@link XSlideShow} instance that runs the slide show. ;  Normally all navigation should be done using this controller and not the
    * {@link XSlideShow} itself.
    */
  def getSlideShow(): XSlideShow
  /** goto the given textual bookmark */
  def gotoBookmark(Bookmark: java.lang.String): scala.Unit
  /** goto and display first slide */
  def gotoFirstSlide(): scala.Unit
  /**
    * goto and display last slide.
    *
    * Remaining effects on the current slide will be skipped.
    */
  def gotoLastSlide(): scala.Unit
  /**
    * start next effects that wait on a generic trigger.
    *
    * If no generic triggers are waiting the next slide will be displayed.
    */
  def gotoNextEffect(): scala.Unit
  /**
    * goto and display next slide.
    *
    * Remaining effects on the current slide will be skipped.
    */
  def gotoNextSlide(): scala.Unit
  /**
    * undo the last effects that where triggered by a generic trigger.
    *
    * If there is no previous effect that can be undone then the previous slide will be displayed.
    */
  def gotoPreviousEffect(): scala.Unit
  /**
    * goto and display previous slide.
    *
    * Remaining effects on the current slide will be skipped.
    */
  def gotoPreviousSlide(): scala.Unit
  /**
    * jumps to the given slide.
    *
    * The slide can also be a slide that would normally not be shown during the current slide show.
    * @throws com::sun::star::lang::IllegalArgumentException if the given page is not a valid slide of the document for which this slide show is started. Also
    */
  def gotoSlide(Page: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage): scala.Unit
  /** jumps to the slide at the given index. */
  def gotoSlideIndex(Index: scala.Double): scala.Unit
  /**
    * determines if the slide show is active.
    * @returns `TRUE` for UI active slide show ; `FALSE` otherwise
    */
  def isActive(): scala.Boolean
  /** returns `TRUE` if the slide show was started to run endlessly. */
  def isEndless(): scala.Boolean
  /** Returns `TRUE` if the slide show was started in full-screen mode. */
  def isFullScreen(): scala.Boolean
  /**
    * returns `TRUE` if the slide show is currently paused.
    * @see pause()
    * @see resume()
    */
  def isPaused(): scala.Boolean
  /**
    * returns true if the slide show is still running. If this returns false, this component is already disposed. You can start a new slide show and get a
    * new instance of {@link XSlideShowController} from {@link XPresentation2}
    */
  def isRunning(): scala.Boolean
  /**
    * pauses the slide show. All effects are paused.
    *
    * The slide show continues on next user input or if {@link resume()} is called.
    */
  def pause(): scala.Unit
  /** removes a listener. */
  def removeSlideShowListener(Listener: XSlideShowListener): scala.Unit
  /** resumes a paused slide show. */
  def resume(): scala.Unit
  /** stop all currently played sounds */
  def stopSound(): scala.Unit
}

object XSlideShowController {
  @scala.inline
  def apply(
    AlwaysOnTop: scala.Boolean,
    CurrentSlide: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    CurrentSlideIndex: scala.Double,
    MouseVisible: scala.Boolean,
    NextSlideIndex: scala.Double,
    PenColor: scala.Double,
    PenWidth: scala.Double,
    SlideCount: scala.Double,
    SlideShow: XSlideShow,
    UsePen: scala.Boolean,
    activate: () => scala.Unit,
    addSlideShowListener: XSlideShowListener => scala.Unit,
    blankScreen: scala.Double => scala.Unit,
    deactivate: () => scala.Unit,
    getCurrentSlide: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    getCurrentSlideIndex: () => scala.Double,
    getNextSlideIndex: () => scala.Double,
    getSlideByIndex: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    getSlideCount: () => scala.Double,
    getSlideShow: () => XSlideShow,
    gotoBookmark: java.lang.String => scala.Unit,
    gotoFirstSlide: () => scala.Unit,
    gotoLastSlide: () => scala.Unit,
    gotoNextEffect: () => scala.Unit,
    gotoNextSlide: () => scala.Unit,
    gotoPreviousEffect: () => scala.Unit,
    gotoPreviousSlide: () => scala.Unit,
    gotoSlide: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage => scala.Unit,
    gotoSlideIndex: scala.Double => scala.Unit,
    isActive: () => scala.Boolean,
    isEndless: () => scala.Boolean,
    isFullScreen: () => scala.Boolean,
    isPaused: () => scala.Boolean,
    isRunning: () => scala.Boolean,
    pause: () => scala.Unit,
    removeSlideShowListener: XSlideShowListener => scala.Unit,
    resume: () => scala.Unit,
    stopSound: () => scala.Unit
  ): XSlideShowController = {
    val __obj = js.Dynamic.literal(AlwaysOnTop = AlwaysOnTop, CurrentSlide = CurrentSlide, CurrentSlideIndex = CurrentSlideIndex, MouseVisible = MouseVisible, NextSlideIndex = NextSlideIndex, PenColor = PenColor, PenWidth = PenWidth, SlideCount = SlideCount, SlideShow = SlideShow, UsePen = UsePen, activate = js.Any.fromFunction0(activate), addSlideShowListener = js.Any.fromFunction1(addSlideShowListener), blankScreen = js.Any.fromFunction1(blankScreen), deactivate = js.Any.fromFunction0(deactivate), getCurrentSlide = js.Any.fromFunction0(getCurrentSlide), getCurrentSlideIndex = js.Any.fromFunction0(getCurrentSlideIndex), getNextSlideIndex = js.Any.fromFunction0(getNextSlideIndex), getSlideByIndex = js.Any.fromFunction1(getSlideByIndex), getSlideCount = js.Any.fromFunction0(getSlideCount), getSlideShow = js.Any.fromFunction0(getSlideShow), gotoBookmark = js.Any.fromFunction1(gotoBookmark), gotoFirstSlide = js.Any.fromFunction0(gotoFirstSlide), gotoLastSlide = js.Any.fromFunction0(gotoLastSlide), gotoNextEffect = js.Any.fromFunction0(gotoNextEffect), gotoNextSlide = js.Any.fromFunction0(gotoNextSlide), gotoPreviousEffect = js.Any.fromFunction0(gotoPreviousEffect), gotoPreviousSlide = js.Any.fromFunction0(gotoPreviousSlide), gotoSlide = js.Any.fromFunction1(gotoSlide), gotoSlideIndex = js.Any.fromFunction1(gotoSlideIndex), isActive = js.Any.fromFunction0(isActive), isEndless = js.Any.fromFunction0(isEndless), isFullScreen = js.Any.fromFunction0(isFullScreen), isPaused = js.Any.fromFunction0(isPaused), isRunning = js.Any.fromFunction0(isRunning), pause = js.Any.fromFunction0(pause), removeSlideShowListener = js.Any.fromFunction1(removeSlideShowListener), resume = js.Any.fromFunction0(resume), stopSound = js.Any.fromFunction0(stopSound))
  
    __obj.asInstanceOf[XSlideShowController]
  }
}

