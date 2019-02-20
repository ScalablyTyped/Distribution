package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the main interface of an {@link ObjectInspector} .
  * @see ObjectInspector
  * @since OOo 2.0.3
  */
trait XObjectInspector
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProvider {
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
  var InspectorModel: XObjectInspectorModel
  /**
    * provides access to the user interface of the object inspector.
    *
    * This interface can be used to access and manipulate various aspects of the user interface. For instance, you can enable and disable certain property
    * controls (or parts thereof), or register observers for all property controls.
    * @since OOo 2.2
    */
  var InspectorUI: XObjectInspectorUI
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
  def inspect(
    Objects: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface]
  ): scala.Unit
}

