package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the generic interface for supporting the insertion and removal of named elements.
  * @see XContainer
  */
trait XNameContainer extends XNameReplace {
  /** inserts the given element at the specified name. */
  def insertByName(aName: java.lang.String, aElement: js.Any): scala.Unit
  /** removes the element with the specified name. */
  def removeByName(Name: java.lang.String): scala.Unit
}

