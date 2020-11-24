package typings.activexLibreoffice.com_.sun.star.form.control

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.awt.XToolkit
import typings.activexLibreoffice.com_.sun.star.awt.XView
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a check box control which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.CheckBox} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
@js.native
trait FilterControl extends XControl {
  
  def createWithFormat(MessageParent: XWindow, NumberFormatter: XNumberFormatter, ControlModel: XPropertySet): Unit = js.native
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createPeer = js.Any.fromFunction2(createPeer), createWithFormat = js.Any.fromFunction3(createWithFormat), dispose = js.Any.fromFunction0(dispose), getContext = js.Any.fromFunction0(getContext), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setModel = js.Any.fromFunction1(setModel))
    __obj.asInstanceOf[FilterControl]
  }
  
  @scala.inline
  implicit class FilterControlOps[Self <: FilterControl] (val x: Self) extends AnyVal {
    
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
    def setCreateWithFormat(value: (XWindow, XNumberFormatter, XPropertySet) => Unit): Self = this.set("createWithFormat", js.Any.fromFunction3(value))
  }
}
