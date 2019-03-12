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
    Identifiers: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    getByIdentifier: scala.Double => js.Any,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getIdentifiers: () => stdLib.SafeArray[scala.Double],
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    replaceByIdentifer: (scala.Double, js.Any) => scala.Unit
  ): XIdentifierReplace = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, Identifiers = Identifiers, acquire = js.Any.fromFunction0(acquire), getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = js.Any.fromFunction0(getElementType), getIdentifiers = js.Any.fromFunction0(getIdentifiers), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByIdentifer = js.Any.fromFunction2(replaceByIdentifer))
  
    __obj.asInstanceOf[XIdentifierReplace]
  }
}

