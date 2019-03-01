package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrMessageId extends js.Object {
  val bstrMessageId: java.lang.String
  val fAddedToReceiveFolder: scala.Boolean
  val pFaxAccount: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount
}

object Anon_BstrMessageId {
  @scala.inline
  def apply(
    bstrMessageId: java.lang.String,
    fAddedToReceiveFolder: scala.Boolean,
    pFaxAccount: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount
  ): Anon_BstrMessageId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bstrMessageId")(bstrMessageId)
    __obj.updateDynamic("fAddedToReceiveFolder")(fAddedToReceiveFolder)
    __obj.updateDynamic("pFaxAccount")(pFaxAccount)
    __obj.asInstanceOf[Anon_BstrMessageId]
  }
}

