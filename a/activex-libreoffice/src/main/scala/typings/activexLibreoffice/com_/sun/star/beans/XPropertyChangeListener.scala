package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to receive PropertyChangeEvents whenever a bound property is changed. */
trait XPropertyChangeListener
  extends StObject
     with XEventListener {
  
  /** is called when a bound property is changed. */
  def propertyChange(evt: PropertyChangeEvent): Unit
}
object XPropertyChangeListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    propertyChange: PropertyChangeEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertyChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), propertyChange = js.Any.fromFunction1(propertyChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertyChangeListener]
  }
  
  extension [Self <: XPropertyChangeListener](x: Self) {
    
    inline def setPropertyChange(value: PropertyChangeEvent => Unit): Self = StObject.set(x, "propertyChange", js.Any.fromFunction1(value))
  }
}
