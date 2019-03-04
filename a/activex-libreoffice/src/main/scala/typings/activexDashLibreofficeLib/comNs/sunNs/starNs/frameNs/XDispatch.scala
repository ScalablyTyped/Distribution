package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * serves state information of objects which can be connected to controls (e.g. toolbox controls).
  *
  * Each state change is to be broadcasted to all registered status listeners. The first notification should be performed synchronously from {@link
  * XDispatch.addStatusListener()} ; if not, controls may flicker. State listener must be aware of this synchronous notification.
  *
  * The state consists of enabled/disabled and a short descriptive text of the function (e.g. "undo insert character"). It is to be broadcasted whenever
  * this state changes or the control should re-get the value for the URL it is connected to. Additionally, a context-switch-event is to be broadcasted
  * whenever the object may be out of scope, to force the state listener to requery the {@link XDispatch} .
  * @see Frame
  * @see FeatureStateEvent
  */
trait XDispatch
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers a listener of a control for a specific URL at this object to receive status events.
    *
    * It is only allowed to register URLs for which this {@link XDispatch} was explicitly queried. Additional arguments ("#..." or "?...") will be ignored.
    *
    * Note: Notifications can't be guaranteed! This will be a part of interface {@link XNotifyingDispatch} .
    * @param Control listener that wishes to be informed
    * @param URL the URL (without additional arguments) the listener wishes to be registered for. A listener can be registered for more than one URL at the sa
    * @see XStatusListener
    * @see XDispatch.removeStatusListener()
    */
  def addStatusListener(Control: XStatusListener, URL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL): scala.Unit
  /**
    * dispatches (executes) an URL
    *
    * It is only allowed to dispatch URLs for which this {@link XDispatch} was explicitly queried. Additional arguments ("'#..." or "?...") are allowed.
    * @param URL fully parsed URL describing the feature which should be dispatched (=executed)
    * @param Arguments optional arguments for this request (see {@link com.sun.star.document.MediaDescriptor} ) They depend on the real implementation of the
    */
  def dispatch(
    URL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * unregisters a listener from a control.
    * @param Control listener that wishes to be unregistered
    * @param URL URL the listener was registered for. Additional arguments ("#..." or "?...") will be ignored.
    * @see XStatusListener
    * @see XDispatch.addStatusListener()
    */
  def removeStatusListener(Control: XStatusListener, URL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL): scala.Unit
}

object XDispatch {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addStatusListener: js.Function2[XStatusListener, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, scala.Unit],
    dispatch: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeStatusListener: js.Function2[XStatusListener, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, scala.Unit]
  ): XDispatch = {
    val __obj = js.Dynamic.literal(acquire = acquire, addStatusListener = addStatusListener, dispatch = dispatch, queryInterface = queryInterface, release = release, removeStatusListener = removeStatusListener)
  
    __obj.asInstanceOf[XDispatch]
  }
}

