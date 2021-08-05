package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to receive PropertyChangeEvents whenever a "constrained" property is changed.
  *
  * You can register an {@link XVetoableChangeListener} with a source object so as to be notified of any constrained property updates.
  */
trait XVetoableChangeListener
  extends StObject
     with XEventListener {
  
  /** gets called when a constrained property is changed. */
  def vetoableChange(aEvent: PropertyChangeEvent): Unit
}
object XVetoableChangeListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    vetoableChange: PropertyChangeEvent => Unit
  ): XVetoableChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), vetoableChange = js.Any.fromFunction1(vetoableChange))
    __obj.asInstanceOf[XVetoableChangeListener]
  }
  
  extension [Self <: XVetoableChangeListener](x: Self) {
    
    inline def setVetoableChange(value: PropertyChangeEvent => Unit): Self = StObject.set(x, "vetoableChange", js.Any.fromFunction1(value))
  }
}
