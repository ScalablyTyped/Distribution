package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a reference to a cell range. */
trait ComplexReference extends js.Object {
  /** is the first reference. */
  var Reference1: SingleReference
  /** is the second reference. */
  var Reference2: SingleReference
}

object ComplexReference {
  @scala.inline
  def apply(Reference1: SingleReference, Reference2: SingleReference): ComplexReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Reference1")(Reference1)
    __obj.updateDynamic("Reference2")(Reference2)
    __obj.asInstanceOf[ComplexReference]
  }
}

