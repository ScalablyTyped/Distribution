package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a listener for events related to changing XCommandInfos.
  * @author Kai Sommerfeld
  * @see CommandInfoChangeEvent
  * @see XCommandInfoChangeNotifier
  * @version 1.0
  */
trait XCommandInfoChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called whenever changes of a {@link XCommandInfo} shall be propagated.
    * @param evt the event.
    */
  def commandInfoChange(evt: CommandInfoChangeEvent): Unit
}
object XCommandInfoChangeListener {
  
  inline def apply(
    acquire: () => Unit,
    commandInfoChange: CommandInfoChangeEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCommandInfoChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), commandInfoChange = js.Any.fromFunction1(commandInfoChange), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCommandInfoChangeListener]
  }
  
  extension [Self <: XCommandInfoChangeListener](x: Self) {
    
    inline def setCommandInfoChange(value: CommandInfoChangeEvent => Unit): Self = StObject.set(x, "commandInfoChange", js.Any.fromFunction1(value))
  }
}
