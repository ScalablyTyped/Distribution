package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the generic interface for supporting the insertion and removal of elements.
  * @see XContainer
  */
trait XSet extends XEnumerationAccess {
  /** @returns `TRUE` if the given element is a member of this container, otherwise `FALSE` . */
  def has(aElement: js.Any): scala.Boolean
  /** inserts the given element into this container. */
  def insert(aElement: js.Any): scala.Unit
  /** removes the given element from this container. */
  def remove(aElement: js.Any): scala.Unit
}

object XSet {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    createEnumeration: js.Function0[XEnumeration],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    has: js.Function1[js.Any, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insert: js.Function1[js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[js.Any, scala.Unit]
  ): XSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createEnumeration")(createEnumeration)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[XSet]
  }
}

