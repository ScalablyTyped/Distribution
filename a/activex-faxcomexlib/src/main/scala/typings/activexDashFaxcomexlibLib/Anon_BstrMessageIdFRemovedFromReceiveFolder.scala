package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrMessageIdFRemovedFromReceiveFolder extends js.Object {
  val bstrMessageId: java.lang.String
  val fRemovedFromReceiveFolder: scala.Boolean
  val pFaxAccount: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount
}

object Anon_BstrMessageIdFRemovedFromReceiveFolder {
  @scala.inline
  def apply(
    bstrMessageId: java.lang.String,
    fRemovedFromReceiveFolder: scala.Boolean,
    pFaxAccount: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount
  ): Anon_BstrMessageIdFRemovedFromReceiveFolder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bstrMessageId")(bstrMessageId)
    __obj.updateDynamic("fRemovedFromReceiveFolder")(fRemovedFromReceiveFolder)
    __obj.updateDynamic("pFaxAccount")(pFaxAccount)
    __obj.asInstanceOf[Anon_BstrMessageIdFRemovedFromReceiveFolder]
  }
}

