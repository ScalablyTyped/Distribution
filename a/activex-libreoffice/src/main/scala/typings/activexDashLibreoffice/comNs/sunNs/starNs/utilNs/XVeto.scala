package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides information about a veto which has been raised against an operation */
trait XVeto extends js.Object {
  /**
    * provides additional details about the veto.
    *
    * The concrete semantics of this attribute is to be defined in the service implementing this interface.
    */
  var Details: js.Any
  /** describes the reason for the veto */
  var Reason: String
}

object XVeto {
  @scala.inline
  def apply(Details: js.Any, Reason: String): XVeto = {
    val __obj = js.Dynamic.literal(Details = Details, Reason = Reason)
  
    __obj.asInstanceOf[XVeto]
  }
}

