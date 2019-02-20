package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the generic interface for supporting the replacement of named elements.
  * @see XContainer
  */
trait XNameReplace extends XNameAccess {
  /** replaces the element with the specified name with the given element. */
  def replaceByName(aName: java.lang.String, aElement: js.Any): scala.Unit
}

