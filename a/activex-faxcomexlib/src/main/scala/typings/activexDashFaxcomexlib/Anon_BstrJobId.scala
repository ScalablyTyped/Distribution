package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrJobId extends js.Object {
  val bstrJobId: String
  val pFaxAccount: FaxAccount
}

object Anon_BstrJobId {
  @scala.inline
  def apply(bstrJobId: String, pFaxAccount: FaxAccount): Anon_BstrJobId = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BstrJobId]
  }
}

