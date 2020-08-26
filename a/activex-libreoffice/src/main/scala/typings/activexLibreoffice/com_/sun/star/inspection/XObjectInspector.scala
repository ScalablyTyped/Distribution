package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.frame.XDispatch
import typings.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the main interface of an {@link ObjectInspector} .
  * @see ObjectInspector
  * @since OOo 2.0.3
  */
@js.native
trait XObjectInspector
  extends XController
     with XDispatchProvider {
  /**
    * provides access to the current model of the inspector
    *
    * The model is mainly responsible for providing the property handlers. Additionally, it can provide user interface names and help URLs for property
    * categories.
    *
    * Note that there are two ways of setting or retrieving the current model: You can either use com::sun::star::frame::XModel::setModel(), or, if you do
    * not want or need to implement the full-blown {@link com.sun.star.frame.XModel} interface, you can use this property directly. Both approaches are
    * semantically equivalent.
    *
    * If a new model is set at the inspector, the complete UI will be rebuilt to reflect the change, using the new property handlers provided by the new
    * model.
    */
  var InspectorModel: XObjectInspectorModel = js.native
  /**
    * provides access to the user interface of the object inspector.
    *
    * This interface can be used to access and manipulate various aspects of the user interface. For instance, you can enable and disable certain property
    * controls (or parts thereof), or register observers for all property controls.
    * @since OOo 2.2
    */
  var InspectorUI: XObjectInspectorUI = js.native
  /**
    * inspects a new collection of one or more objects.
    *
    * If the sequence is empty, the UI of the {@link ObjectInspector} will be cleared.
    *
    * If the sequence contains more than one object, the {@link XObjectInspector} will create a complete set of property handlers (as indicated by {@link
    * XObjectInspectorModel.HandlerFactories} ) for **every** of the objects, and compose their output.
    * @see XPropertyHandler.isComposable
    * @see XPropertyHandler.onInteractivePropertySelection
    * @see XPropertyHandler.suspend
    * @throws com::sun::star::util::VetoException if the inspector cannot switch to another object set. This typically happens if one of the active {@link XPro
    */
  def inspect(Objects: SeqEquiv[XInterface]): Unit = js.native
}

object XObjectInspector {
  @scala.inline
  def apply(
    Frame: XFrame,
    InspectorModel: XObjectInspectorModel,
    InspectorUI: XObjectInspectorUI,
    Model: XModel,
    ViewData: js.Any,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attachFrame: XFrame => Unit,
    attachModel: XModel => Boolean,
    dispose: () => Unit,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getViewData: () => js.Any,
    inspect: SeqEquiv[XInterface] => Unit,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    restoreViewData: js.Any => Unit,
    suspend: Boolean => Boolean
  ): XObjectInspector = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], InspectorModel = InspectorModel.asInstanceOf[js.Any], InspectorUI = InspectorUI.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getViewData = js.Any.fromFunction0(getViewData), inspect = js.Any.fromFunction1(inspect), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), restoreViewData = js.Any.fromFunction1(restoreViewData), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[XObjectInspector]
  }
  @scala.inline
  implicit class XObjectInspectorOps[Self <: XObjectInspector] (val x: Self) extends AnyVal {
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
    def setInspectorModel(value: XObjectInspectorModel): Self = this.set("InspectorModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspectorUI(value: XObjectInspectorUI): Self = this.set("InspectorUI", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspect(value: SeqEquiv[XInterface] => Unit): Self = this.set("inspect", js.Any.fromFunction1(value))
  }
  
}

