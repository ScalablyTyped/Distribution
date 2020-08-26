package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides information about a veto which has been raised against an operation */
@js.native
trait XVeto extends js.Object {
  /**
    * provides additional details about the veto.
    *
    * The concrete semantics of this attribute is to be defined in the service implementing this interface.
    */
  var Details: js.Any = js.native
  /** describes the reason for the veto */
  var Reason: String = js.native
}

object XVeto {
  @scala.inline
  def apply(Details: js.Any, Reason: String): XVeto = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[XVeto]
  }
  @scala.inline
  implicit class XVetoOps[Self <: XVeto] (val x: Self) extends AnyVal {
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
    def setDetails(value: js.Any): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("Reason", value.asInstanceOf[js.Any])
  }
  
}

