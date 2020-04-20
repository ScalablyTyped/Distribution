package typings.activexFaxcomexlib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPFaxAccount extends js.Object {
  val bstrJobId: String
  val pFaxAccount: FaxAccount
  val pJobStatus: FaxJobStatus
}

object AnonPFaxAccount {
  @scala.inline
  def apply(bstrJobId: String, pFaxAccount: FaxAccount, pJobStatus: FaxJobStatus): AnonPFaxAccount = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPFaxAccount]
  }
}

