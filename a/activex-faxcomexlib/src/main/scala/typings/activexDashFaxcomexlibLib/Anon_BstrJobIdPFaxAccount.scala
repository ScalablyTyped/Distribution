package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrJobIdPFaxAccount extends js.Object {
  val bstrJobId: java.lang.String
  val pFaxAccount: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount
  val pJobStatus: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxJobStatus
}

object Anon_BstrJobIdPFaxAccount {
  @scala.inline
  def apply(
    bstrJobId: java.lang.String,
    pFaxAccount: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    pJobStatus: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxJobStatus
  ): Anon_BstrJobIdPFaxAccount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bstrJobId")(bstrJobId)
    __obj.updateDynamic("pFaxAccount")(pFaxAccount)
    __obj.updateDynamic("pJobStatus")(pJobStatus)
    __obj.asInstanceOf[Anon_BstrJobIdPFaxAccount]
  }
}

