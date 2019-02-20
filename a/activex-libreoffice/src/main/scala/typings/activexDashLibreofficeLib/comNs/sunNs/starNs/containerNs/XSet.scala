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

