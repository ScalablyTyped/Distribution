package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implements a component which can default-fill the help section of an {@link ObjectInspector} .
  *
  * The component registers a {@link XPropertyControlObserver} at an XObjectInspectoryUI interface. Whenever it then is notified of a {@link
  * XPropertyControl} getting the focus, it will try to deduce the extended help text of this control's window, and set this help text at the object
  * inspector's help section.
  */
@js.native
trait DefaultHelpProvider extends XInterface {
  
  /**
    * creates a help provider instance
    * @param InspectorUI provides access to the UI of the {@link ObjectInspector} which should be observed. Must not be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if the given inspector UI is `NULL` .
    */
  def create(InspectorUI: XObjectInspectorUI): Unit = js.native
}
object DefaultHelpProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    create: XObjectInspectorUI => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DefaultHelpProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction1(create), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DefaultHelpProvider]
  }
  
  @scala.inline
  implicit class DefaultHelpProviderOps[Self <: DefaultHelpProvider] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: XObjectInspectorUI => Unit): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
