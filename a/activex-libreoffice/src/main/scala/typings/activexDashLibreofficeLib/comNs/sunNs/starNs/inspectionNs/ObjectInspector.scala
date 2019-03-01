package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes an {@link com.sun.star.frame.Controller} which can be used to browse and modify properties of components.
  *
  * The controller can be plugged into an {@link com.sun.star.frame.XFrame} , and will provide a visual component for inspecting and modifying component
  * properties. ;  Note that "property" here is a generic term - any aspect of a component can be considered a property, as long as some property handler
  * is able to describe this aspect in a property-like way.
  *
  * The basic idea is that one facet of the inspected component is represented by a single line of controls: A label, an input control, and optionally one
  * or two buttons which, when pressed, trigger additional user interaction (e.g. a more sophisticated dialog to enter a property value).
  *
  * Additionally, property lines can be grouped into different categories. A usual implementation of such categories would be tab pages, but other
  * implementations are possible, too.
  *
  * Even more, the inspector can optionally display a help section at the bottom of its window, which can display arbitrary (context-sensitive) help
  * texts.
  *
  * An {@link ObjectInspector} needs one or more property handlers which describe the facets of an inspected component - without such handlers, the
  * inspector window will simply stay empty.
  *
  * The property handlers, as well as more information about the layout of the inspector, are provided by a inspector model, which has to be implemented
  * by the user of the inspector.
  *
  * Since property handlers might have the need to raise UI, they will be created with a context value named "DialogParentWindow", which contains an
  * XWindow which should be used as parent of any windows to raise. ;  If the {@link com.sun.star.uno.XComponentContext} in which the {@link
  * ObjectInspector} was created already contains such a value, it is not overwritten. Only if it doesn't, the inspector will add an own value - which
  * contains the inspector's main window - to the context when creating handlers.
  * @see XPropertyHandler
  * @see LineDescriptor
  * @see PropertyControlType
  * @see ObjectInspectorModel
  * @see com.sun.star.uno.XComponentContext
  * @see com.sun.star.lang.XMultiComponentFactory
  * @since OOo 2.0.3
  */
trait ObjectInspector extends XObjectInspector {
  /**
    * creates a default instance of the {@link ObjectInspector}
    * @since OOo 2.2
    */
  def createDefault(): scala.Unit
  /**
    * creates an instance of the {@link ObjectInspector} , using a given {@link ObjectInspectorModel}
    * @since OOo 2.2
    * @throws com::sun::star::lang::IllegalArgumentException if Model is `NULL` .
    */
  def createWithModel(Model: XObjectInspectorModel): scala.Unit
}

object ObjectInspector {
  @scala.inline
  def apply(
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    InspectorModel: XObjectInspectorModel,
    InspectorUI: XObjectInspectorUI,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    ViewData: js.Any,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attachFrame: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, scala.Unit],
    attachModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, scala.Boolean],
    createDefault: js.Function0[scala.Unit],
    createWithModel: js.Function1[XObjectInspectorModel, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getFrame: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel],
    getViewData: js.Function0[js.Any],
    inspect: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface], 
      scala.Unit
    ],
    queryDispatch: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch
    ],
    queryDispatches: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchDescriptor], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    restoreViewData: js.Function1[js.Any, scala.Unit],
    suspend: js.Function1[scala.Boolean, scala.Boolean]
  ): ObjectInspector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Frame")(Frame)
    __obj.updateDynamic("InspectorModel")(InspectorModel)
    __obj.updateDynamic("InspectorUI")(InspectorUI)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("ViewData")(ViewData)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("attachFrame")(attachFrame)
    __obj.updateDynamic("attachModel")(attachModel)
    __obj.updateDynamic("createDefault")(createDefault)
    __obj.updateDynamic("createWithModel")(createWithModel)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getFrame")(getFrame)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getViewData")(getViewData)
    __obj.updateDynamic("inspect")(inspect)
    __obj.updateDynamic("queryDispatch")(queryDispatch)
    __obj.updateDynamic("queryDispatches")(queryDispatches)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("restoreViewData")(restoreViewData)
    __obj.updateDynamic("suspend")(suspend)
    __obj.asInstanceOf[ObjectInspector]
  }
}

