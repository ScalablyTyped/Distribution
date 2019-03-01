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
    Identifiers: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getByIdentifier: js.Function1[scala.Double, js.Any],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getIdentifiers: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    hasElements: js.Function0[scala.Boolean],
    insert: js.Function1[js.Any, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIdentifier: js.Function1[scala.Double, scala.Unit],
    replaceByIdentifer: js.Function2[scala.Double, js.Any, scala.Unit]
  ): XIdentifierContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("Identifiers")(Identifiers)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getByIdentifier")(getByIdentifier)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getIdentifiers")(getIdentifiers)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByIdentifier")(removeByIdentifier)
    __obj.updateDynamic("replaceByIdentifer")(replaceByIdentifer)
    __obj.asInstanceOf[XIdentifierContainer]
  }
}

