package typings.activexFaxcomexlib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBstrJobId extends js.Object {
  val bstrJobId: String
  val pFaxAccount: FaxAccount
}

object AnonBstrJobId {
  @scala.inline
  def apply(bstrJobId: String, pFaxAccount: FaxAccount): AnonBstrJobId = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBstrJobId]
  }
}

