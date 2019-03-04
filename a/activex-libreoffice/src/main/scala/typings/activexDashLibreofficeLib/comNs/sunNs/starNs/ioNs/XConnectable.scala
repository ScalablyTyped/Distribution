package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to connect data sinks and sources.
  *
  * The predecessor-member is the element in the connection that is nearer to the source of the data. The successor-member is the element that is further
  * away from the source of the data. (Note that this classification does not depend on whether the class implements {@link XInputStream} or {@link
  * XOutputStream} ; it only depends on the direction of data flow.)
  *
  * This interface allows generic services to navigate between arbitrary elements of a connection.
  */
trait XConnectable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the predecessor of this object. */
  var Predecessor: XConnectable
  /** @returns the successor of this object. */
  var Successor: XConnectable
  /** @returns the predecessor of this object. */
  def getPredecessor(): XConnectable
  /** @returns the successor of this object. */
  def getSuccessor(): XConnectable
  /** sets the source of the data flow for this object. */
  def setPredecessor(aPredecessor: XConnectable): scala.Unit
  /** sets the sink of the data flow for this object. */
  def setSuccessor(aSuccessor: XConnectable): scala.Unit
}

object XConnectable {
  @scala.inline
  def apply(
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: js.Function0[scala.Unit],
    getPredecessor: js.Function0[XConnectable],
    getSuccessor: js.Function0[XConnectable],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPredecessor: js.Function1[XConnectable, scala.Unit],
    setSuccessor: js.Function1[XConnectable, scala.Unit]
  ): XConnectable = {
    val __obj = js.Dynamic.literal(Predecessor = Predecessor, Successor = Successor, acquire = acquire, getPredecessor = getPredecessor, getSuccessor = getSuccessor, queryInterface = queryInterface, release = release, setPredecessor = setPredecessor, setSuccessor = setSuccessor)
  
    __obj.asInstanceOf[XConnectable]
  }
}

