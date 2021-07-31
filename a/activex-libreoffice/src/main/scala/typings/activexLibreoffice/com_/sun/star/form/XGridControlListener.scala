package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a listener which is to be notified about state changes in a grid control
  * @see XGridControl
  * @since OOo 3.1
  */
trait XGridControlListener
  extends StObject
     with XEventListener {
  
  /**
    * called when the current column in a grid control changed
    * @see XGrid.getCurrentColumnPosition
    */
  def columnChanged(event: EventObject): Unit
}
object XGridControlListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    columnChanged: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGridControlListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), columnChanged = js.Any.fromFunction1(columnChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGridControlListener]
  }
  
  @scala.inline
  implicit class XGridControlListenerMutableBuilder[Self <: XGridControlListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnChanged(value: EventObject => Unit): Self = StObject.set(x, "columnChanged", js.Any.fromFunction1(value))
  }
}
