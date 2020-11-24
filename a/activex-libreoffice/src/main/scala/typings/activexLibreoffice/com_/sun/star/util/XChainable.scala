package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables the object to be a member of a chain. */
@js.native
trait XChainable extends XInterface {
  
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  val Predecessor: XChainable = js.native
  
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  var Successor: XChainable = js.native
  
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  def getPredecessor(): XChainable = js.native
  
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  def getSuccessor(): XChainable = js.native
  
  /** checks if the specified object can be linked to this. */
  def isChainable(xChainable: XChainable): Boolean = js.native
  
  /**
    * connects the specified object to this object as the successor in a chain.
    *
    * This implies that this object will become the predecessor of **xChainable** .
    */
  def setSuccessor(xChainable: XChainable): Unit = js.native
}
object XChainable {
  
  @scala.inline
  def apply(
    Predecessor: XChainable,
    Successor: XChainable,
    acquire: () => Unit,
    getPredecessor: () => XChainable,
    getSuccessor: () => XChainable,
    isChainable: XChainable => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSuccessor: XChainable => Unit
  ): XChainable = {
    val __obj = js.Dynamic.literal(Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), isChainable = js.Any.fromFunction1(isChainable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSuccessor = js.Any.fromFunction1(setSuccessor))
    __obj.asInstanceOf[XChainable]
  }
  
  @scala.inline
  implicit class XChainableOps[Self <: XChainable] (val x: Self) extends AnyVal {
    
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
    def setPredecessor(value: XChainable): Self = this.set("Predecessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessor(value: XChainable): Self = this.set("Successor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPredecessor(value: () => XChainable): Self = this.set("getPredecessor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSuccessor(value: () => XChainable): Self = this.set("getSuccessor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsChainable(value: XChainable => Boolean): Self = this.set("isChainable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSuccessor(value: XChainable => Unit): Self = this.set("setSuccessor", js.Any.fromFunction1(value))
  }
}
