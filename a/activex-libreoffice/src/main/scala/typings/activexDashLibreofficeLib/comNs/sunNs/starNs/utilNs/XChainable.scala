package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables the object to be a member of a chain. */
trait XChainable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  val Predecessor: XChainable
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  var Successor: XChainable
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  def getPredecessor(): XChainable
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  def getSuccessor(): XChainable
  /** checks if the specified object can be linked to this. */
  def isChainable(xChainable: XChainable): scala.Boolean
  /**
    * connects the specified object to this object as the successor in a chain.
    *
    * This implies that this object will become the predecessor of **xChainable** .
    */
  def setSuccessor(xChainable: XChainable): scala.Unit
}

