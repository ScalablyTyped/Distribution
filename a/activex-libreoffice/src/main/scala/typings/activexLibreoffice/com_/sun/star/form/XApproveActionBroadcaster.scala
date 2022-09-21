package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to probably veto actions to be performed on components.
  *
  * Usually, a component which supports the {@link XApproveActionBroadcaster} interface implements {@link com.sun.star.awt.XActionListener} as well.
  */
trait XApproveActionBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive the {@link XApproveActionListener.approveAction()} event.
    * @param aListener the listener to be added
    */
  def addApproveActionListener(aListener: XApproveActionListener): Unit
  
  /**
    * removes the specified listener
    * @param aListener the listener to be removed
    */
  def removeApproveActionListener(aListener: XApproveActionListener): Unit
}
object XApproveActionBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addApproveActionListener: XApproveActionListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeApproveActionListener: XApproveActionListener => Unit
  ): XApproveActionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addApproveActionListener = js.Any.fromFunction1(addApproveActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeApproveActionListener = js.Any.fromFunction1(removeApproveActionListener))
    __obj.asInstanceOf[XApproveActionBroadcaster]
  }
  
  extension [Self <: XApproveActionBroadcaster](x: Self) {
    
    inline def setAddApproveActionListener(value: XApproveActionListener => Unit): Self = StObject.set(x, "addApproveActionListener", js.Any.fromFunction1(value))
    
    inline def setRemoveApproveActionListener(value: XApproveActionListener => Unit): Self = StObject.set(x, "removeApproveActionListener", js.Any.fromFunction1(value))
  }
}
