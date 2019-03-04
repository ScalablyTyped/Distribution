package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * dispatch with guaranteed notify (instead of {@link XDispatch} )
  * @see XDispatch
  * @see XStatusListener
  */
trait XNotifyingDispatch extends XDispatch {
  /**
    * Do the same like {@link XDispatch.dispatch()} but notifies listener in every case. Should be used if result must be known.
    * @param URL full parsed URL describes the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request (see {@link com.sun.star.document.MediaDescriptor} )
    * @param Listener optional listener for guaranteed notifications of this request
    */
  def dispatchWithNotification(
    URL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Listener: XDispatchResultListener
  ): scala.Unit
}

object XNotifyingDispatch {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addStatusListener: js.Function2[XStatusListener, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, scala.Unit],
    dispatch: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    dispatchWithNotification: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XDispatchResultListener, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeStatusListener: js.Function2[XStatusListener, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, scala.Unit]
  ): XNotifyingDispatch = {
    val __obj = js.Dynamic.literal(acquire = acquire, addStatusListener = addStatusListener, dispatch = dispatch, dispatchWithNotification = dispatchWithNotification, queryInterface = queryInterface, release = release, removeStatusListener = removeStatusListener)
  
    __obj.asInstanceOf[XNotifyingDispatch]
  }
}

