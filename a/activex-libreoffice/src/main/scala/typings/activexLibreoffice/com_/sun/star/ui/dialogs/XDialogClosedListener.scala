package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to notify listeners about dialog-closed events.
  *
  * Registered listeners will be notified with a {@link DialogClosedEvent} when a {@link XAsynchronousExecutableDialog} is closed.
  * @see XAsynchronousExecutableDialog
  * @see DialogClosedEvent
  */
trait XDialogClosedListener
  extends StObject
     with XEventListener {
  
  /**
    * A client receives this event if a dialog is closed.
    * @param aEvent of type {@link DialogClosedEvent} that describes the event
    * @see EndDialogEvent
    */
  def dialogClosed(aEvent: DialogClosedEvent): Unit
}
object XDialogClosedListener {
  
  inline def apply(
    acquire: () => Unit,
    dialogClosed: DialogClosedEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDialogClosedListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dialogClosed = js.Any.fromFunction1(dialogClosed), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDialogClosedListener]
  }
  
  extension [Self <: XDialogClosedListener](x: Self) {
    
    inline def setDialogClosed(value: DialogClosedEvent => Unit): Self = StObject.set(x, "dialogClosed", js.Any.fromFunction1(value))
  }
}
