package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typings.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Security SAX Event Keeper.
  *
  * This interface is an extension of the {@link XSAXEventKeeper} interface, some security related features are added.
  */
@js.native
trait XSecuritySAXEventKeeper extends XSAXEventKeeper {
  
  /**
    * Adds a new element collector on the next element in the SAX event stream.
    * @param priority the priority of the element collector. See ConstOfPriority
    * @param modifyElement a flag representing whether the element collector will modify the content of its element after notification
    * @returns the keeper id of the new element collector
    */
  def addSecurityElementCollector(priority: ElementMarkPriority, modifyElement: Boolean): Double = js.native
  
  /**
    * Sets security id for an element mark.
    * @param id the keeper id of the element collector to be set
    * @param securityId the security id to be set
    */
  def setSecurityId(id: Double, securityId: Double): Unit = js.native
}
object XSecuritySAXEventKeeper {
  
  @scala.inline
  def apply(
    CurrentBlockingNode: XXMLElementWrapper,
    acquire: () => Unit,
    addBlocker: () => Double,
    addElementCollector: () => Double,
    addSecurityElementCollector: (ElementMarkPriority, Boolean) => Double,
    getCurrentBlockingNode: () => XXMLElementWrapper,
    getElement: Double => XXMLElementWrapper,
    isBlocking: () => Boolean,
    printBufferNodeTree: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeBlocker: Double => Unit,
    removeElementCollector: Double => Unit,
    setElement: (Double, XXMLElementWrapper) => Unit,
    setNextHandler: XDocumentHandler => XDocumentHandler,
    setSecurityId: (Double, Double) => Unit
  ): XSecuritySAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addBlocker = js.Any.fromFunction0(addBlocker), addElementCollector = js.Any.fromFunction0(addElementCollector), addSecurityElementCollector = js.Any.fromFunction2(addSecurityElementCollector), getCurrentBlockingNode = js.Any.fromFunction0(getCurrentBlockingNode), getElement = js.Any.fromFunction1(getElement), isBlocking = js.Any.fromFunction0(isBlocking), printBufferNodeTree = js.Any.fromFunction0(printBufferNodeTree), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBlocker = js.Any.fromFunction1(removeBlocker), removeElementCollector = js.Any.fromFunction1(removeElementCollector), setElement = js.Any.fromFunction2(setElement), setNextHandler = js.Any.fromFunction1(setNextHandler), setSecurityId = js.Any.fromFunction2(setSecurityId))
    __obj.asInstanceOf[XSecuritySAXEventKeeper]
  }
  
  @scala.inline
  implicit class XSecuritySAXEventKeeperOps[Self <: XSecuritySAXEventKeeper] (val x: Self) extends AnyVal {
    
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
    def setAddSecurityElementCollector(value: (ElementMarkPriority, Boolean) => Double): Self = this.set("addSecurityElementCollector", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSecurityId(value: (Double, Double) => Unit): Self = this.set("setSecurityId", js.Any.fromFunction2(value))
  }
}
