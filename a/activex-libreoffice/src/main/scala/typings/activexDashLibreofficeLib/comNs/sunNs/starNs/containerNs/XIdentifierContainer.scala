package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the generic interface for supporting the creation and removal of elements with unique identifiers.
  * @see XContainer
  */
trait XIdentifierContainer extends XIdentifierReplace {
  /**
    * inserts an element and creates a new unique identifier for it.
    * @param aElement The new element that will be inserted.
    * @returns the newly created identifier under which the element is inserted.
    * @throws com::sun::star::lang::IllegalArgumentException if the argument is not vailid for this container.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def insert(aElement: js.Any): scala.Double
  /**
    * removes the element with the specified identifier.
    * @param Identifier The identifier that should be removed.
    * @throws com::sun::star::lang::NoSuchElementException If the identifier does not exist.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def removeByIdentifier(Identifier: scala.Double): scala.Unit
}

object XIdentifierContainer {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    Identifiers: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    getByIdentifier: scala.Double => js.Any,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getIdentifiers: () => stdLib.SafeArray[scala.Double],
    hasElements: () => scala.Boolean,
    insert: js.Any => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByIdentifier: scala.Double => scala.Unit,
    replaceByIdentifer: (scala.Double, js.Any) => scala.Unit
  ): XIdentifierContainer = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, Identifiers = Identifiers, acquire = js.Any.fromFunction0(acquire), getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = js.Any.fromFunction0(getElementType), getIdentifiers = js.Any.fromFunction0(getIdentifiers), hasElements = js.Any.fromFunction0(hasElements), insert = js.Any.fromFunction1(insert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIdentifier = js.Any.fromFunction1(removeByIdentifier), replaceByIdentifer = js.Any.fromFunction2(replaceByIdentifer))
  
    __obj.asInstanceOf[XIdentifierContainer]
  }
}

