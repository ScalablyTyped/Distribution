package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive an event when the current selection changes.
  * @see com.sun.star.view.XSelectionSupplier
  */
@js.native
trait XSelectionChangeListener extends XEventListener {
  
  /**
    * is called when the selection changes.
    *
    * You can get the new selection via {@link XSelectionSupplier} from {@link com.sun.star.lang.EventObject.Source} .
    */
  def selectionChanged(aEvent: EventObject): Unit = js.native
}
object XSelectionChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectionChanged: EventObject => Unit
  ): XSelectionChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectionChanged = js.Any.fromFunction1(selectionChanged))
    __obj.asInstanceOf[XSelectionChangeListener]
  }
  
  @scala.inline
  implicit class XSelectionChangeListenerMutableBuilder[Self <: XSelectionChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectionChanged(value: EventObject => Unit): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1(value))
  }
}
