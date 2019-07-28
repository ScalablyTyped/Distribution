package typings.activexDashLibreoffice.comNs.sunNs.starNs.reportNs

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
    val __obj = js.Dynamic.literal(Functions = Functions)
  
    __obj.asInstanceOf[XFunctionsSupplier]
  }
}

