package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when the active spreadsheet changes. */
@js.native
trait XActivationEventListener extends XEventListener {
  
  /**
    * is called whenever data or a selection changed.
    *
    * This interface must be implemented by components that wish to get notified of changes of the active {@link Spreadsheet} . They can be registered at an
    * XSpreadsheetViewEventProvider component.
    * @param aEvent the event that gives further information on which {@link Spreadsheet} is active now.
    * @see ActivationEvent
    * @see XSpreadsheetViewEventProvider
    * @since OOo 2.0
    */
  def activeSpreadsheetChanged(aEvent: ActivationEvent): Unit = js.native
}
object XActivationEventListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    activeSpreadsheetChanged: ActivationEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XActivationEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activeSpreadsheetChanged = js.Any.fromFunction1(activeSpreadsheetChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XActivationEventListener]
  }
  
  @scala.inline
  implicit class XActivationEventListenerMutableBuilder[Self <: XActivationEventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSpreadsheetChanged(value: ActivationEvent => Unit): Self = StObject.set(x, "activeSpreadsheetChanged", js.Any.fromFunction1(value))
  }
}
