package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides recording functionality of dispatches
  *
  * With such recorder it will be possible to record requests of type {@link XDispatch} by using additional interface {@link XRecordableDispatch} . The
  * result of that will be a a script which can be used to start the dispatch at later time again. Such recorder objects are available on a {@link
  * XDispatchRecorderSupplier} which is provided by the {@link Frame} service.
  * @see Frame
  * @see XDispatchRecorderSupplier
  * @since OOo 1.1.2
  */
trait XDispatchRecorder extends XInterface {
  /**
    * returns the recorded source code
    *
    * This method must be used before {@link endRecording()} is called! Otherwise the macro will be released.
    * @returns the recorded data as a string which can be interpreted as a script
    */
  val RecordedMacro: String
  /**
    * stops the recording process
    *
    * Must be called in pairs with {@link XDispatchRecorder.startRecording()} .
    * @see getRecordedMacro()
    */
  def endRecording(): Unit
  /**
    * returns the recorded source code
    *
    * This method must be used before {@link endRecording()} is called! Otherwise the macro will be released.
    * @returns the recorded data as a string which can be interpreted as a script
    */
  def getRecordedMacro(): String
  /**
    * records a single dispatch call identified by its command URL
    * @param URL the full parsed command URL
    * @param Arguments optional arguments for the command URL ;  (see {@link com.sun.star.document.MediaDescriptor} for further information)
    */
  def recordDispatch(URL: URL, Arguments: SeqEquiv[PropertyValue]): Unit
  /**
    * records a single dispatch call identified by its command URL, but comments it out
    *
    * This way calls that failed on execution can be documented.
    * @param URL the full parsed command URL
    * @param Arguments optional arguments for the command URL ;  (see {@link com.sun.star.document.MediaDescriptor} for further information)
    */
  def recordDispatchAsComment(URL: URL, Arguments: SeqEquiv[PropertyValue]): Unit
  /**
    * initializes the recorder by passing the frame for which all macro statements shall be recorded
    * @param Frame it includes the document on which such requests shall be recorded
    */
  def startRecording(Frame: XFrame): Unit
}

object XDispatchRecorder {
  @scala.inline
  def apply(
    RecordedMacro: String,
    acquire: () => Unit,
    endRecording: () => Unit,
    getRecordedMacro: () => String,
    queryInterface: `type` => js.Any,
    recordDispatch: (URL, SeqEquiv[PropertyValue]) => Unit,
    recordDispatchAsComment: (URL, SeqEquiv[PropertyValue]) => Unit,
    release: () => Unit,
    startRecording: XFrame => Unit
  ): XDispatchRecorder = {
    val __obj = js.Dynamic.literal(RecordedMacro = RecordedMacro, acquire = js.Any.fromFunction0(acquire), endRecording = js.Any.fromFunction0(endRecording), getRecordedMacro = js.Any.fromFunction0(getRecordedMacro), queryInterface = js.Any.fromFunction1(queryInterface), recordDispatch = js.Any.fromFunction2(recordDispatch), recordDispatchAsComment = js.Any.fromFunction2(recordDispatchAsComment), release = js.Any.fromFunction0(release), startRecording = js.Any.fromFunction1(startRecording))
  
    __obj.asInstanceOf[XDispatchRecorder]
  }
}

