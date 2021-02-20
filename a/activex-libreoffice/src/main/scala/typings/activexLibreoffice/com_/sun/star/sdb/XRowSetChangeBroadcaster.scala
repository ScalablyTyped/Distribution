package typings.activexLibreoffice.com_.sun.star.sdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes in the `RowSet` supplied by a component
  * @see XRowSetSupplier
  * @see XRowSetChangeListener
  * @since OOo 3.2
  */
@js.native
trait XRowSetChangeBroadcaster extends StObject {
  
  /** adds a listener to be notified when the `RowSet` supplied by the component changes. */
  def addRowSetChangeListener(iListener: XRowSetChangeListener): Unit = js.native
  
  /** removes a previously added listener. */
  def removeRowSetChangeListener(iListener: XRowSetChangeListener): Unit = js.native
}
object XRowSetChangeBroadcaster {
  
  @scala.inline
  def apply(
    addRowSetChangeListener: XRowSetChangeListener => Unit,
    removeRowSetChangeListener: XRowSetChangeListener => Unit
  ): XRowSetChangeBroadcaster = {
    val __obj = js.Dynamic.literal(addRowSetChangeListener = js.Any.fromFunction1(addRowSetChangeListener), removeRowSetChangeListener = js.Any.fromFunction1(removeRowSetChangeListener))
    __obj.asInstanceOf[XRowSetChangeBroadcaster]
  }
  
  @scala.inline
  implicit class XRowSetChangeBroadcasterMutableBuilder[Self <: XRowSetChangeBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRowSetChangeListener(value: XRowSetChangeListener => Unit): Self = StObject.set(x, "addRowSetChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveRowSetChangeListener(value: XRowSetChangeListener => Unit): Self = StObject.set(x, "removeRowSetChangeListener", js.Any.fromFunction1(value))
  }
}
