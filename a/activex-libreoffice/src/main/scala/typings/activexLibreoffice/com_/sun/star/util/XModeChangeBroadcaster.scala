package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes in an object's internal mode.
  * @see XModeSelector
  * @see XModeChangeListener
  * @see XModeChangeApproveListener
  * @since OOo 1.1.2
  */
trait XModeChangeBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds the given listener to the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def addModeChangeApproveListener(rxListener: XModeChangeApproveListener): Unit
  
  /** adds the given listener to the list of components to be notified when the mode changes. */
  def addModeChangeListener(rxListener: XModeChangeListener): Unit
  
  /**
    * remove the given listener from the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def removeModeChangeApproveListener(rxListener: XModeChangeApproveListener): Unit
  
  /** removes the given listener from the list of components to be notified when the mode changes. */
  def removeModeChangeListener(rxListener: XModeChangeListener): Unit
}
object XModeChangeBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addModeChangeApproveListener: XModeChangeApproveListener => Unit,
    addModeChangeListener: XModeChangeListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeModeChangeApproveListener: XModeChangeApproveListener => Unit,
    removeModeChangeListener: XModeChangeListener => Unit
  ): XModeChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModeChangeApproveListener = js.Any.fromFunction1(addModeChangeApproveListener), addModeChangeListener = js.Any.fromFunction1(addModeChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModeChangeApproveListener = js.Any.fromFunction1(removeModeChangeApproveListener), removeModeChangeListener = js.Any.fromFunction1(removeModeChangeListener))
    __obj.asInstanceOf[XModeChangeBroadcaster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XModeChangeBroadcaster] (val x: Self) extends AnyVal {
    
    inline def setAddModeChangeApproveListener(value: XModeChangeApproveListener => Unit): Self = StObject.set(x, "addModeChangeApproveListener", js.Any.fromFunction1(value))
    
    inline def setAddModeChangeListener(value: XModeChangeListener => Unit): Self = StObject.set(x, "addModeChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemoveModeChangeApproveListener(value: XModeChangeApproveListener => Unit): Self = StObject.set(x, "removeModeChangeApproveListener", js.Any.fromFunction1(value))
    
    inline def setRemoveModeChangeListener(value: XModeChangeListener => Unit): Self = StObject.set(x, "removeModeChangeListener", js.Any.fromFunction1(value))
  }
}
