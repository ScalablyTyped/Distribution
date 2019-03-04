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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    createPeer: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer, 
      scala.Unit
    ],
    createWithFormat: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatter, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel],
    getPeer: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer],
    getView: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView],
    isDesignMode: js.Function0[scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, scala.Boolean]
  ): FilterControl = {
    val __obj = js.Dynamic.literal(Context = Context, Model = Model, Peer = Peer, View = View, acquire = acquire, addEventListener = addEventListener, createPeer = createPeer, createWithFormat = createWithFormat, dispose = dispose, getContext = getContext, getModel = getModel, getPeer = getPeer, getView = getView, isDesignMode = isDesignMode, isTransparent = isTransparent, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setContext = setContext, setDesignMode = setDesignMode, setModel = setModel)
  
    __obj.asInstanceOf[FilterControl]
  }
}

