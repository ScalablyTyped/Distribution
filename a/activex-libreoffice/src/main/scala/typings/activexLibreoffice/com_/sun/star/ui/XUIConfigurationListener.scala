package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supplies information about changes of a user interface configuration manager.
  * @since OOo 2.0
  */
trait XUIConfigurationListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when a configuration has inserted an user interface element.
    * @param Event provides information about the element which has been inserted.
    */
  def elementInserted(Event: ConfigurationEvent): Unit
  
  /**
    * is invoked when a configuration has removed an user interface element.
    * @param Event provides information about the element which has been removed.
    */
  def elementRemoved(Event: ConfigurationEvent): Unit
  
  /**
    * is invoked when a configuration has replaced an user interface element.
    * @param Event provides information about the element which has been inserted/replaced.
    */
  def elementReplaced(Event: ConfigurationEvent): Unit
}
object XUIConfigurationListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    elementInserted: ConfigurationEvent => Unit,
    elementRemoved: ConfigurationEvent => Unit,
    elementReplaced: ConfigurationEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XUIConfigurationListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), elementInserted = js.Any.fromFunction1(elementInserted), elementRemoved = js.Any.fromFunction1(elementRemoved), elementReplaced = js.Any.fromFunction1(elementReplaced), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUIConfigurationListener]
  }
  
  extension [Self <: XUIConfigurationListener](x: Self) {
    
    inline def setElementInserted(value: ConfigurationEvent => Unit): Self = StObject.set(x, "elementInserted", js.Any.fromFunction1(value))
    
    inline def setElementRemoved(value: ConfigurationEvent => Unit): Self = StObject.set(x, "elementRemoved", js.Any.fromFunction1(value))
    
    inline def setElementReplaced(value: ConfigurationEvent => Unit): Self = StObject.set(x, "elementReplaced", js.Any.fromFunction1(value))
  }
}
