package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Reference Resolved Broadcaster.
  *
  * This interface is used to manipulate reference resolved listener.
  */
@js.native
trait XReferenceResolvedBroadcaster extends XInterface {
  
  /**
    * Adds a new reference resolved listener for a element collector.
    *
    * When the element collector has completely collected that element, this listener will receive a notification.
    * @param referenceId the id of the element collector for which the new listener is added
    * @param listener the listener to be added
    */
  def addReferenceResolvedListener(referenceId: Double, listener: XReferenceResolvedListener): Unit = js.native
  
  /**
    * Removes a listener from a element collector.
    *
    * When a listener is removed, it will not receive notification when collection completes.
    * @param referenceId the id of the element collector from which the listener is removed
    * @param listener the listener to be removed
    */
  def removeReferenceResolvedListener(referenceId: Double, listener: XReferenceResolvedListener): Unit = js.native
}
object XReferenceResolvedBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addReferenceResolvedListener: (Double, XReferenceResolvedListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeReferenceResolvedListener: (Double, XReferenceResolvedListener) => Unit
  ): XReferenceResolvedBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addReferenceResolvedListener = js.Any.fromFunction2(addReferenceResolvedListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeReferenceResolvedListener = js.Any.fromFunction2(removeReferenceResolvedListener))
    __obj.asInstanceOf[XReferenceResolvedBroadcaster]
  }
  
  @scala.inline
  implicit class XReferenceResolvedBroadcasterOps[Self <: XReferenceResolvedBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddReferenceResolvedListener(value: (Double, XReferenceResolvedListener) => Unit): Self = this.set("addReferenceResolvedListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveReferenceResolvedListener(value: (Double, XReferenceResolvedListener) => Unit): Self = this.set("removeReferenceResolvedListener", js.Any.fromFunction2(value))
  }
}
