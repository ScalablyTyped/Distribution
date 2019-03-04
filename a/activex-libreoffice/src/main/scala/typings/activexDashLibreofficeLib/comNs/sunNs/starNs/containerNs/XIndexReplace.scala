package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the generic interface for supporting the replacement of indexed elements.
  * @see XContainer
  */
trait XIndexReplace extends XIndexAccess {
  /** replaces the element at the specified index with the given element. */
  def replaceByIndex(Index: scala.Double, Element: js.Any): scala.Unit
}

object XIndexReplace {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit]
  ): XIndexReplace = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release, replaceByIndex = replaceByIndex)
  
    __obj.asInstanceOf[XIndexReplace]
  }
}

