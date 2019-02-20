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

