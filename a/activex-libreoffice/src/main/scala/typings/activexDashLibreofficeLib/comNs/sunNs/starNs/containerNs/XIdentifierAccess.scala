package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the elements of a collection through a unique identifier. */
trait XIdentifierAccess extends XElementAccess {
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  val Identifiers: stdLib.SafeArray[scala.Double]
  /**
    * @param Identifier specifies the identifier of the element that should be retrieved.
    * @returns the element with the specified identifier
    * @throws com::sun::star::lang::NoSuchElementException If the identifier is not existing.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByIdentifier(Identifier: scala.Double): js.Any
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  def getIdentifiers(): stdLib.SafeArray[scala.Double]
}

object XIdentifierAccess {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    Identifiers: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    getByIdentifier: scala.Double => js.Any,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getIdentifiers: () => stdLib.SafeArray[scala.Double],
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XIdentifierAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, Identifiers = Identifiers, acquire = js.Any.fromFunction0(acquire), getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = js.Any.fromFunction0(getElementType), getIdentifiers = js.Any.fromFunction0(getIdentifiers), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIdentifierAccess]
  }
}

