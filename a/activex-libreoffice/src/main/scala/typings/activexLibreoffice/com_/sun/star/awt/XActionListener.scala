package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive action events. */
trait XActionListener
  extends StObject
     with XEventListener {
  
  /** is invoked when an action is performed. */
  def actionPerformed(rEvent: ActionEvent): Unit
}
object XActionListener {
  
  inline def apply(
    acquire: () => Unit,
    actionPerformed: ActionEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XActionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), actionPerformed = js.Any.fromFunction1(actionPerformed), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XActionListener]
  }
  
  extension [Self <: XActionListener](x: Self) {
    
    inline def setActionPerformed(value: ActionEvent => Unit): Self = StObject.set(x, "actionPerformed", js.Any.fromFunction1(value))
  }
}
