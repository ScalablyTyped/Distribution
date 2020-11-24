package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.util.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * dispatch with guaranteed notify (instead of {@link XDispatch} )
  * @see XDispatch
  * @see XStatusListener
  */
@js.native
trait XNotifyingDispatch extends XDispatch {
  
  /**
    * Do the same like {@link XDispatch.dispatch()} but notifies listener in every case. Should be used if result must be known.
    * @param URL full parsed URL describes the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request (see {@link com.sun.star.document.MediaDescriptor} )
    * @param Listener optional listener for guaranteed notifications of this request
    */
  def dispatchWithNotification(URL: URL, Arguments: SeqEquiv[PropertyValue], Listener: XDispatchResultListener): Unit = js.native
}
object XNotifyingDispatch {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addStatusListener: (XStatusListener, URL) => Unit,
    dispatch: (URL, SeqEquiv[PropertyValue]) => Unit,
    dispatchWithNotification: (URL, SeqEquiv[PropertyValue], XDispatchResultListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeStatusListener: (XStatusListener, URL) => Unit
  ): XNotifyingDispatch = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addStatusListener = js.Any.fromFunction2(addStatusListener), dispatch = js.Any.fromFunction2(dispatch), dispatchWithNotification = js.Any.fromFunction3(dispatchWithNotification), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStatusListener = js.Any.fromFunction2(removeStatusListener))
    __obj.asInstanceOf[XNotifyingDispatch]
  }
  
  @scala.inline
  implicit class XNotifyingDispatchOps[Self <: XNotifyingDispatch] (val x: Self) extends AnyVal {
    
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
    def setDispatchWithNotification(value: (URL, SeqEquiv[PropertyValue], XDispatchResultListener) => Unit): Self = this.set("dispatchWithNotification", js.Any.fromFunction3(value))
  }
}
