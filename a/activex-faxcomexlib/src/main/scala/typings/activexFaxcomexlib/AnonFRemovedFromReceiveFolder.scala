package typings.activexFaxcomexlib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFRemovedFromReceiveFolder extends js.Object {
  val bstrMessageId: String
  val fRemovedFromReceiveFolder: Boolean
  val pFaxAccount: FaxAccount
}

object AnonFRemovedFromReceiveFolder {
  @scala.inline
  def apply(bstrMessageId: String, fRemovedFromReceiveFolder: Boolean, pFaxAccount: FaxAccount): AnonFRemovedFromReceiveFolder = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fRemovedFromReceiveFolder = fRemovedFromReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFRemovedFromReceiveFolder]
  }
}

