package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.controlNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XToolkit
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XView
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindowPeer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XNumberFormatter
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
trait FilterControl extends XControl {
  def createWithFormat(MessageParent: XWindow, NumberFormatter: XNumberFormatter, ControlModel: XPropertySet): Unit
}

object FilterControl {
  @scala.inline
  def apply(
    Context: XInterface,
    Model: XControlModel,
    Peer: XWindowPeer,
    View: XView,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    createWithFormat: (XWindow, XNumberFormatter, XPropertySet) => Unit,
    dispose: () => Unit,
    getContext: () => XInterface,
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getView: () => XView,
    isDesignMode: () => Boolean,
    isTransparent: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setModel: XControlModel => Boolean
  ): FilterControl = {
    val __obj = js.Dynamic.literal(Context = Context, Model = Model, Peer = Peer, View = View, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createPeer = js.Any.fromFunction2(createPeer), createWithFormat = js.Any.fromFunction3(createWithFormat), dispose = js.Any.fromFunction0(dispose), getContext = js.Any.fromFunction0(getContext), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setModel = js.Any.fromFunction1(setModel))
  
    __obj.asInstanceOf[FilterControl]
  }
}

