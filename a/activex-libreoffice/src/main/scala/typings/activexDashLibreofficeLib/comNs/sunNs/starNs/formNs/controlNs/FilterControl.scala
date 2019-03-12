package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a check box control which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.CheckBox} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
trait FilterControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl {
  def createWithFormat(
    MessageParent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    NumberFormatter: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatter,
    ControlModel: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  ): scala.Unit
}

object FilterControl {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    Peer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    createPeer: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer) => scala.Unit,
    createWithFormat: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatter, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet) => scala.Unit,
    dispose: () => scala.Unit,
    getContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    getPeer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    getView: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    isDesignMode: () => scala.Boolean,
    isTransparent: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setDesignMode: scala.Boolean => scala.Unit,
    setModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => scala.Boolean
  ): FilterControl = {
    val __obj = js.Dynamic.literal(Context = Context, Model = Model, Peer = Peer, View = View, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createPeer = js.Any.fromFunction2(createPeer), createWithFormat = js.Any.fromFunction3(createWithFormat), dispose = js.Any.fromFunction0(dispose), getContext = js.Any.fromFunction0(getContext), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setModel = js.Any.fromFunction1(setModel))
  
    __obj.asInstanceOf[FilterControl]
  }
}

