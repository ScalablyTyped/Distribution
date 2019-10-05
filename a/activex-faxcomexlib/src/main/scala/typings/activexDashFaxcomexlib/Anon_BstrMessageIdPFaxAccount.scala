package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrMessageIdPFaxAccount extends js.Object {
  val bstrMessageId: String
  val pFaxAccount: FaxAccount
}

object Anon_BstrMessageIdPFaxAccount {
  @scala.inline
  def apply(bstrMessageId: String, pFaxAccount: FaxAccount): Anon_BstrMessageIdPFaxAccount = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId, pFaxAccount = pFaxAccount)
  
    __obj.asInstanceOf[Anon_BstrMessageIdPFaxAccount]
  }
}

