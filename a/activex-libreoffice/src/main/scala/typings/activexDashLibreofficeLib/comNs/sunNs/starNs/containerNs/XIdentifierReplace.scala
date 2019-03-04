package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is the generic interface for supporting the replacement of elements with unique identifiers. */
trait XIdentifierReplace extends XIdentifierAccess {
  /**
    * replaces the element with the specified identifier.
    * @param Identifier specifies the identifier of the element that should be retrieved.
    * @param aElement the new element that replaces the old element for the specified identifier.
    * @throws com::sun::star::lang::IllegalArgumentException If the argument is not valid for this container.
    * @throws com::sun::star::lang::NoSuchElementException If the identifier is not existing.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def replaceByIdentifer(Identifier: scala.Double, aElement: js.Any): scala.Unit
}

object XIdentifierReplace {
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
    release: js.Function0[scala.Unit],
    replaceByIdentifer: js.Function2[scala.Double, js.Any, scala.Unit]
  ): XIdentifierReplace = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, Identifiers = Identifiers, acquire = acquire, getByIdentifier = getByIdentifier, getElementType = getElementType, getIdentifiers = getIdentifiers, hasElements = hasElements, queryInterface = queryInterface, release = release, replaceByIdentifer = replaceByIdentifer)
  
    __obj.asInstanceOf[XIdentifierReplace]
  }
}

