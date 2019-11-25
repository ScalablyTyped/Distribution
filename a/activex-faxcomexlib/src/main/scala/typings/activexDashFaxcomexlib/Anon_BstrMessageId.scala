package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrMessageId extends js.Object {
  val bstrMessageId: String
  val fAddedToReceiveFolder: Boolean
  val pFaxAccount: FaxAccount
}

object Anon_BstrMessageId {
  @scala.inline
  def apply(bstrMessageId: String, fAddedToReceiveFolder: Boolean, pFaxAccount: FaxAccount): Anon_BstrMessageId = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fAddedToReceiveFolder = fAddedToReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BstrMessageId]
  }
}

