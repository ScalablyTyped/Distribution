package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountSet Class */
@JSGlobal("FAXCOMEXLib.FaxAccountSet")
@js.native
class FaxAccountSet protected () extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountSet_typekey")
  var FAXCOMEXLibDotFaxAccountSet_typekey: FaxAccountSet = js.native
  /** Adds a fax account */
  def AddAccount(bstrAccountName: String): FaxAccount = js.native
  /** Get fax account by name */
  def GetAccount(bstrAccountName: String): FaxAccount = js.native
  /** Collection of fax accounts */
  def GetAccounts(): FaxAccounts = js.native
  /** Removes a fax account by name */
  def RemoveAccount(bstrAccountName: String): Unit = js.native
}

