package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the elements of a collection through a unique identifier. */
trait XIdentifierAccess extends XElementAccess {
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  val Identifiers: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * @param Identifier specifies the identifier of the element that should be retrieved.
    * @returns the element with the specified identifier
    * @throws com::sun::star::lang::NoSuchElementException If the identifier is not existing.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByIdentifier(Identifier: scala.Double): js.Any
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  def getIdentifiers(): activexDashInteropLib.SafeArray[scala.Double]
}

