package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is the base interface of all collection interfaces. */
trait XElementAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the type of the elements. `void` means that it is a multi-type container and you cannot determine the exact types with this interface. */
  val ElementType: activexDashLibreofficeLib.`type`
  /** @returns the type of the elements. `void` means that it is a multi-type container and you cannot determine the exact types with this interface. */
  def getElementType(): activexDashLibreofficeLib.`type`
  /** @returns `TRUE` if the object contain elements, otherwise `FALSE` . */
  def hasElements(): scala.Boolean
}

