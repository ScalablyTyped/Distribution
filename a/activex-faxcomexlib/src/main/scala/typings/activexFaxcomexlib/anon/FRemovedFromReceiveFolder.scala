package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FRemovedFromReceiveFolder extends js.Object {
  val bstrMessageId: String
  val fRemovedFromReceiveFolder: Boolean
  val pFaxAccount: FaxAccount
}

object FRemovedFromReceiveFolder {
  @scala.inline
  def apply(bstrMessageId: String, fRemovedFromReceiveFolder: Boolean, pFaxAccount: FaxAccount): FRemovedFromReceiveFolder = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fRemovedFromReceiveFolder = fRemovedFromReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FRemovedFromReceiveFolder]
  }
}

