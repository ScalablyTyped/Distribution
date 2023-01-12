package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events from a component when the state of an item changes. */
trait XItemListener
  extends StObject
     with XEventListener {
  
  /** is invoked when an item changes its state. */
  def itemStateChanged(rEvent: ItemEvent): Unit
}
object XItemListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    itemStateChanged: ItemEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XItemListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), itemStateChanged = js.Any.fromFunction1(itemStateChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XItemListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XItemListener] (val x: Self) extends AnyVal {
    
    inline def setItemStateChanged(value: ItemEvent => Unit): Self = StObject.set(x, "itemStateChanged", js.Any.fromFunction1(value))
  }
}
