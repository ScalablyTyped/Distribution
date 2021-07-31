package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** receives events which get fired whenever a bound property is changed. */
trait XPropertiesChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called when bound properties are changed.
    * @param aEvent contains a sequence of {@link PropertyChangeEvent} objects which describe the event source and the properites that have changed.
    */
  def propertiesChange(aEvent: SeqEquiv[PropertyChangeEvent]): Unit
}
object XPropertiesChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    propertiesChange: SeqEquiv[PropertyChangeEvent] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertiesChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), propertiesChange = js.Any.fromFunction1(propertiesChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertiesChangeListener]
  }
  
  @scala.inline
  implicit class XPropertiesChangeListenerMutableBuilder[Self <: XPropertiesChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertiesChange(value: SeqEquiv[PropertyChangeEvent] => Unit): Self = StObject.set(x, "propertiesChange", js.Any.fromFunction1(value))
  }
}
