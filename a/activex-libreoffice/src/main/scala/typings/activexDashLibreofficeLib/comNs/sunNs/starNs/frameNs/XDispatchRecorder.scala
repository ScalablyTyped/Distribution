package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

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
trait XDispatchRecorder
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the recorded source code
    *
    * This method must be used before {@link endRecording()} is called! Otherwise the macro will be released.
    * @returns the recorded data as a string which can be interpreted as a script
    */
  val RecordedMacro: java.lang.String
  /**
    * stops the recording process
    *
    * Must be called in pairs with {@link XDispatchRecorder.startRecording()} .
    * @see getRecordedMacro()
    */
  def endRecording(): scala.Unit
  /**
    * returns the recorded source code
    *
    * This method must be used before {@link endRecording()} is called! Otherwise the macro will be released.
    * @returns the recorded data as a string which can be interpreted as a script
    */
  def getRecordedMacro(): java.lang.String
  /**
    * records a single dispatch call identified by its command URL
    * @param URL the full parsed command URL
    * @param Arguments optional arguments for the command URL ;  (see {@link com.sun.star.document.MediaDescriptor} for further information)
    */
  def recordDispatch(
    URL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * records a single dispatch call identified by its command URL, but comments it out
    *
    * This way calls that failed on execution can be documented.
    * @param URL the full parsed command URL
    * @param Arguments optional arguments for the command URL ;  (see {@link com.sun.star.document.MediaDescriptor} for further information)
    */
  def recordDispatchAsComment(
    URL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * initializes the recorder by passing the frame for which all macro statements shall be recorded
    * @param Frame it includes the document on which such requests shall be recorded
    */
  def startRecording(Frame: XFrame): scala.Unit
}

object XDispatchRecorder {
  @scala.inline
  def apply(
    RecordedMacro: java.lang.String,
    acquire: () => scala.Unit,
    endRecording: () => scala.Unit,
    getRecordedMacro: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    recordDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    recordDispatchAsComment: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    release: () => scala.Unit,
    startRecording: XFrame => scala.Unit
  ): XDispatchRecorder = {
    val __obj = js.Dynamic.literal(RecordedMacro = RecordedMacro, acquire = js.Any.fromFunction0(acquire), endRecording = js.Any.fromFunction0(endRecording), getRecordedMacro = js.Any.fromFunction0(getRecordedMacro), queryInterface = js.Any.fromFunction1(queryInterface), recordDispatch = js.Any.fromFunction2(recordDispatch), recordDispatchAsComment = js.Any.fromFunction2(recordDispatchAsComment), release = js.Any.fromFunction0(release), startRecording = js.Any.fromFunction1(startRecording))
  
    __obj.asInstanceOf[XDispatchRecorder]
  }
}

