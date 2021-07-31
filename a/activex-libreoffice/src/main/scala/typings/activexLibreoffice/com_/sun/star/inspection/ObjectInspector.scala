package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typings.activexLibreoffice.com_.sun.star.frame.XDispatch
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait ObjectInspector
  extends StObject
     with XObjectInspector {
  
  /**
    * creates a default instance of the {@link ObjectInspector}
    * @since OOo 2.2
    */
  def createDefault(): Unit
  
  /**
    * creates an instance of the {@link ObjectInspector} , using a given {@link ObjectInspectorModel}
    * @since OOo 2.2
    * @throws com::sun::star::lang::IllegalArgumentException if Model is `NULL` .
    */
  def createWithModel(Model: XObjectInspectorModel): Unit
}
object ObjectInspector {
  
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
    createDefault: () => Unit,
    createWithModel: XObjectInspectorModel => Unit,
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
  ): ObjectInspector = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], InspectorModel = InspectorModel.asInstanceOf[js.Any], InspectorUI = InspectorUI.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), createDefault = js.Any.fromFunction0(createDefault), createWithModel = js.Any.fromFunction1(createWithModel), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getViewData = js.Any.fromFunction0(getViewData), inspect = js.Any.fromFunction1(inspect), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), restoreViewData = js.Any.fromFunction1(restoreViewData), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[ObjectInspector]
  }
  
  @scala.inline
  implicit class ObjectInspectorMutableBuilder[Self <: ObjectInspector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDefault(value: () => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWithModel(value: XObjectInspectorModel => Unit): Self = StObject.set(x, "createWithModel", js.Any.fromFunction1(value))
  }
}
