package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountSet Class */
@JSGlobal("FAXCOMEXLib.FaxAccountSet")
@js.native
class FaxAccountSet protected () extends js.Object {
  var `FAXCOMEXLib.FaxAccountSet_typekey`: FaxAccountSet = js.native
  /** Adds a fax account */
  def AddAccount(bstrAccountName: java.lang.String): FaxAccount = js.native
  /** Get fax account by name */
  def GetAccount(bstrAccountName: java.lang.String): FaxAccount = js.native
  /** Collection of fax accounts */
  def GetAccounts(): FaxAccounts = js.native
  /** Removes a fax account by name */
  def RemoveAccount(bstrAccountName: java.lang.String): scala.Unit = js.native
}

