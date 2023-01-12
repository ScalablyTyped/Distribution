package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive text change events. */
trait XTextListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the text has changed. */
  def textChanged(rEvent: TextEvent): Unit
}
object XTextListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    textChanged: TextEvent => Unit
  ): XTextListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), textChanged = js.Any.fromFunction1(textChanged))
    __obj.asInstanceOf[XTextListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTextListener] (val x: Self) extends AnyVal {
    
    inline def setTextChanged(value: TextEvent => Unit): Self = StObject.set(x, "textChanged", js.Any.fromFunction1(value))
  }
}
