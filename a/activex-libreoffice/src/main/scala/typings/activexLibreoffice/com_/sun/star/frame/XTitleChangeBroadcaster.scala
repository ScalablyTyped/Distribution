package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to register for title changed events. */
trait XTitleChangeBroadcaster
  extends StObject
     with XInterface {
  
  /** Add a listener */
  def addTitleChangeListener(xListener: XTitleChangeListener): Unit
  
  /** Remove a listener */
  def removeTitleChangeListener(xListener: XTitleChangeListener): Unit
}
object XTitleChangeBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addTitleChangeListener: XTitleChangeListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeTitleChangeListener: XTitleChangeListener => Unit
  ): XTitleChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addTitleChangeListener = js.Any.fromFunction1(addTitleChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTitleChangeListener = js.Any.fromFunction1(removeTitleChangeListener))
    __obj.asInstanceOf[XTitleChangeBroadcaster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTitleChangeBroadcaster] (val x: Self) extends AnyVal {
    
    inline def setAddTitleChangeListener(value: XTitleChangeListener => Unit): Self = StObject.set(x, "addTitleChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemoveTitleChangeListener(value: XTitleChangeListener => Unit): Self = StObject.set(x, "removeTitleChangeListener", js.Any.fromFunction1(value))
  }
}
