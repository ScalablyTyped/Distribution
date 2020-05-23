package typings.activexLibreoffice.com_.sun.star.report

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the functions supplier which are located in a report definition or a group. */
trait XFunctionsSupplier extends js.Object {
  /** access to the functions */
  var Functions: XFunctions
}

object XFunctionsSupplier {
  @scala.inline
  def apply(Functions: XFunctions): XFunctionsSupplier = {
    val __obj = js.Dynamic.literal(Functions = Functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[XFunctionsSupplier]
  }
}

