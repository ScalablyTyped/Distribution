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

object XIdentifierAccess {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    Identifiers: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getByIdentifier: js.Function1[scala.Double, js.Any],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getIdentifiers: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIdentifierAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("Identifiers")(Identifiers)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getByIdentifier")(getByIdentifier)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getIdentifiers")(getIdentifiers)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XIdentifierAccess]
  }
}

