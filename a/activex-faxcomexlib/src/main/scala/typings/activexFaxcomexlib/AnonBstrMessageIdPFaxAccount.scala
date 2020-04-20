package typings.activexFaxcomexlib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBstrMessageIdPFaxAccount extends js.Object {
  val bstrMessageId: String
  val pFaxAccount: FaxAccount
}

object AnonBstrMessageIdPFaxAccount {
  @scala.inline
  def apply(bstrMessageId: String, pFaxAccount: FaxAccount): AnonBstrMessageIdPFaxAccount = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBstrMessageIdPFaxAccount]
  }
}

