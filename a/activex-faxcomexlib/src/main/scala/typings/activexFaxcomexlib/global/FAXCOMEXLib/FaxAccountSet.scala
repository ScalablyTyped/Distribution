package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccounts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountSet Class */
@JSGlobal("FAXCOMEXLib.FaxAccountSet")
@js.native
class FaxAccountSet protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountSet {
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccountSet_typekey")
  override var FAXCOMEXLibDotFaxAccountSet_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountSet = js.native
  /** Adds a fax account */
  /* CompleteClass */
  override def AddAccount(bstrAccountName: String): typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount = js.native
  /** Get fax account by name */
  /* CompleteClass */
  override def GetAccount(bstrAccountName: String): typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount = js.native
  /** Collection of fax accounts */
  /* CompleteClass */
  override def GetAccounts(): FaxAccounts = js.native
  /** Removes a fax account by name */
  /* CompleteClass */
  override def RemoveAccount(bstrAccountName: String): Unit = js.native
}

