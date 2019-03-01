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

object XChainable {
  @scala.inline
  def apply(
    Predecessor: XChainable,
    Successor: XChainable,
    acquire: js.Function0[scala.Unit],
    getPredecessor: js.Function0[XChainable],
    getSuccessor: js.Function0[XChainable],
    isChainable: js.Function1[XChainable, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setSuccessor: js.Function1[XChainable, scala.Unit]
  ): XChainable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Predecessor")(Predecessor)
    __obj.updateDynamic("Successor")(Successor)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getPredecessor")(getPredecessor)
    __obj.updateDynamic("getSuccessor")(getSuccessor)
    __obj.updateDynamic("isChainable")(isChainable)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setSuccessor")(setSuccessor)
    __obj.asInstanceOf[XChainable]
  }
}

