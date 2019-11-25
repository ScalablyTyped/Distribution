package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxAccount
import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrJobIdPFaxAccount extends js.Object {
  val bstrJobId: String
  val pFaxAccount: FaxAccount
  val pJobStatus: FaxJobStatus
}

object Anon_BstrJobIdPFaxAccount {
  @scala.inline
  def apply(bstrJobId: String, pFaxAccount: FaxAccount, pJobStatus: FaxJobStatus): Anon_BstrJobIdPFaxAccount = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BstrJobIdPFaxAccount]
  }
}

