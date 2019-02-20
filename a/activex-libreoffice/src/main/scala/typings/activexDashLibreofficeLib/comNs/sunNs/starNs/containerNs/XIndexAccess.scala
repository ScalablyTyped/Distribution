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

