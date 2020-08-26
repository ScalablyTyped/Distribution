package typings.activexLibreoffice.com_.sun.star.report

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the functions supplier which are located in a report definition or a group. */
@js.native
trait XFunctionsSupplier extends js.Object {
  /** access to the functions */
  var Functions: XFunctions = js.native
}

object XFunctionsSupplier {
  @scala.inline
  def apply(Functions: XFunctions): XFunctionsSupplier = {
    val __obj = js.Dynamic.literal(Functions = Functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[XFunctionsSupplier]
  }
  @scala.inline
  implicit class XFunctionsSupplierOps[Self <: XFunctionsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFunctions(value: XFunctions): Self = this.set("Functions", value.asInstanceOf[js.Any])
  }
  
}

