package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the generic interface for supporting the insertion and removal of indexed elements.
  * @see XContainer
  */
trait XIndexContainer extends XIndexReplace {
  /**
    * inserts the given element at the specified index.
    *
    * To append an element, use the index "last index +1".
    */
  def insertByIndex(Index: scala.Double, Element: js.Any): scala.Unit
  /** removes the element at the specified index. */
  def removeByIndex(Index: scala.Double): scala.Unit
}

object XIndexContainer {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit]
  ): XIndexContainer = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, insertByIndex = insertByIndex, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex, replaceByIndex = replaceByIndex)
  
    __obj.asInstanceOf[XIndexContainer]
  }
}

