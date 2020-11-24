package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XRecordableDispatch extends XInterface {
  
  /**
    * dispatch and record it
    * @param URL full parsed URL which describe the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request (see {@link com.sun.star.document.MediaDescriptor} for details)
    * @param Recorder object which can be used to record the request (available on {@link XDispatchRecorderSupplier.getDispatchRecorder()} )
    */
  def dispatchAndRecord(URL: URL, Arguments: SeqEquiv[PropertyValue], Recorder: XDispatchRecorder): Unit = js.native
}
object XRecordableDispatch {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    dispatchAndRecord: (URL, SeqEquiv[PropertyValue], XDispatchRecorder) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRecordableDispatch = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dispatchAndRecord = js.Any.fromFunction3(dispatchAndRecord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRecordableDispatch]
  }
  
  @scala.inline
  implicit class XRecordableDispatchOps[Self <: XRecordableDispatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDispatchAndRecord(value: (URL, SeqEquiv[PropertyValue], XDispatchRecorder) => Unit): Self = this.set("dispatchAndRecord", js.Any.fromFunction3(value))
  }
}
