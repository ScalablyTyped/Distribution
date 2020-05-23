package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BstrMessageId extends js.Object {
  val bstrMessageId: String
  val fAddedToReceiveFolder: Boolean
  val pFaxAccount: FaxAccount
}

object BstrMessageId {
  @scala.inline
  def apply(bstrMessageId: String, fAddedToReceiveFolder: Boolean, pFaxAccount: FaxAccount): BstrMessageId = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fAddedToReceiveFolder = fAddedToReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrMessageId]
  }
}

