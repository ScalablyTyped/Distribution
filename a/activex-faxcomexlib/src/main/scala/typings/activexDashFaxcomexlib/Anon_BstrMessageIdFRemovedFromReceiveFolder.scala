package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrMessageIdFRemovedFromReceiveFolder extends js.Object {
  val bstrMessageId: String
  val fRemovedFromReceiveFolder: Boolean
  val pFaxAccount: FaxAccount
}

object Anon_BstrMessageIdFRemovedFromReceiveFolder {
  @scala.inline
  def apply(bstrMessageId: String, fRemovedFromReceiveFolder: Boolean, pFaxAccount: FaxAccount): Anon_BstrMessageIdFRemovedFromReceiveFolder = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fRemovedFromReceiveFolder = fRemovedFromReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BstrMessageIdFRemovedFromReceiveFolder]
  }
}

