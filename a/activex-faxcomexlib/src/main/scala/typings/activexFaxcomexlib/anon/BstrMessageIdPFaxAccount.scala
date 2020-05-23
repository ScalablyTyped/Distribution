package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BstrMessageIdPFaxAccount extends js.Object {
  val bstrMessageId: String
  val pFaxAccount: FaxAccount
}

object BstrMessageIdPFaxAccount {
  @scala.inline
  def apply(bstrMessageId: String, pFaxAccount: FaxAccount): BstrMessageIdPFaxAccount = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrMessageIdPFaxAccount]
  }
}

