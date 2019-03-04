package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends an existing {@link XDispatch} implementation with functionality for dispatch recording
  *
  * This interface can be implemented as an additional one beside an existing {@link XDispatch} one to provide record functionality of dispatches. Because
  * it's an additional interface the status events are available there and not at this interface.
  *
  * But normally this interface mustn't be used directly. If a dispatch object is well known and recording was enabled on a {@link
  * XDispatchRecorderSupplier} it's possible to use method {@link XDispatchRecorderSupplier.dispatchAndRecord()} of it to make dispatch and recording
  * automatically. The interface {@link XRecordableDispatch} is used transparently there.
  *
  * {{program example here, see documentation}}
  * @see XDispatchRecorderSupplier
  * @see XDispatch
  * @since OOo 1.1.2
  */
trait XRecordableDispatch
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * dispatch and record it
    * @param URL full parsed URL which describe the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request (see {@link com.sun.star.document.MediaDescriptor} for details)
    * @param Recorder object which can be used to record the request (available on {@link XDispatchRecorderSupplier.getDispatchRecorder()} )
    */
  def dispatchAndRecord(
    URL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Recorder: XDispatchRecorder
  ): scala.Unit
}

object XRecordableDispatch {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    dispatchAndRecord: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XDispatchRecorder, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRecordableDispatch = {
    val __obj = js.Dynamic.literal(acquire = acquire, dispatchAndRecord = dispatchAndRecord, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XRecordableDispatch]
  }
}

