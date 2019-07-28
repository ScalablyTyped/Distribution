package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables the object to be a member of a chain. */
trait XChainable extends XInterface {
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  val Predecessor: XChainable
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  var Successor: XChainable
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  def getPredecessor(): XChainable
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  def getSuccessor(): XChainable
  /** checks if the specified object can be linked to this. */
  def isChainable(xChainable: XChainable): Boolean
  /**
    * connects the specified object to this object as the successor in a chain.
    *
    * This implies that this object will become the predecessor of **xChainable** .
    */
  def setSuccessor(xChainable: XChainable): Unit
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
    val __obj = js.Dynamic.literal(Predecessor = Predecessor, Successor = Successor, acquire = js.Any.fromFunction0(acquire), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), isChainable = js.Any.fromFunction1(isChainable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSuccessor = js.Any.fromFunction1(setSuccessor))
  
    __obj.asInstanceOf[XChainable]
  }
}

