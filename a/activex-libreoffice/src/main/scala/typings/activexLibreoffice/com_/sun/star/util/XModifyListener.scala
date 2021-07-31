package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when a model object changes. */
trait XModifyListener
  extends StObject
     with XEventListener {
  
  /**
    * is called when something changes in the object.
    *
    * Due to such an event, it may be necessary to update views or controllers.
    *
    * The source of the event may be the content of the object to which the listener is registered.
    */
  def modified(aEvent: EventObject): Unit
}
object XModifyListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    modified: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModifyListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), modified = js.Any.fromFunction1(modified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModifyListener]
  }
  
  @scala.inline
  implicit class XModifyListenerMutableBuilder[Self <: XModifyListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModified(value: EventObject => Unit): Self = StObject.set(x, "modified", js.Any.fromFunction1(value))
  }
}
