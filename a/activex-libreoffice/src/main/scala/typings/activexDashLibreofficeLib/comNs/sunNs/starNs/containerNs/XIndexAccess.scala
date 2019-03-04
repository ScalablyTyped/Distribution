package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the elements of a collection through an index.
  *
  * This interface should only be used if the data structure, itself, is indexed.
  */
trait XIndexAccess extends XElementAccess {
  /** @returns the number of elements in this container. */
  val Count: scala.Double
  /**
    * @param Index specifies the position in the array. The first index is 0.
    * @returns the element at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByIndex(Index: scala.Double): js.Any
  /** @returns the number of elements in this container. */
  def getCount(): scala.Double
}

object XIndexAccess {
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
    release: js.Function0[scala.Unit]
  ): XIndexAccess = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XIndexAccess]
  }
}

