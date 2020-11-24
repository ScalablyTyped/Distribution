package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountSet Class */
@js.native
trait FaxAccountSet extends js.Object {
  
  /** Adds a fax account */
  def AddAccount(bstrAccountName: String): FaxAccount = js.native
  
  @JSName("FAXCOMEXLib.FaxAccountSet_typekey")
  var FAXCOMEXLibDotFaxAccountSet_typekey: FaxAccountSet = js.native
  
  /** Get fax account by name */
  def GetAccount(bstrAccountName: String): FaxAccount = js.native
  
  /** Collection of fax accounts */
  def GetAccounts(): FaxAccounts = js.native
  
  /** Removes a fax account by name */
  def RemoveAccount(bstrAccountName: String): Unit = js.native
}
object FaxAccountSet {
  
  @scala.inline
  def apply(
    AddAccount: String => FaxAccount,
    FAXCOMEXLibDotFaxAccountSet_typekey: FaxAccountSet,
    GetAccount: String => FaxAccount,
    GetAccounts: () => FaxAccounts,
    RemoveAccount: String => Unit
  ): FaxAccountSet = {
    val __obj = js.Dynamic.literal(AddAccount = js.Any.fromFunction1(AddAccount), GetAccount = js.Any.fromFunction1(GetAccount), GetAccounts = js.Any.fromFunction0(GetAccounts), RemoveAccount = js.Any.fromFunction1(RemoveAccount))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountSet_typekey")(FAXCOMEXLibDotFaxAccountSet_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountSet]
  }
  
  @scala.inline
  implicit class FaxAccountSetOps[Self <: FaxAccountSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddAccount(value: String => FaxAccount): Self = this.set("AddAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFAXCOMEXLibDotFaxAccountSet_typekey(value: FaxAccountSet): Self = this.set("FAXCOMEXLib.FaxAccountSet_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAccount(value: String => FaxAccount): Self = this.set("GetAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAccounts(value: () => FaxAccounts): Self = this.set("GetAccounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAccount(value: String => Unit): Self = this.set("RemoveAccount", js.Any.fromFunction1(value))
  }
}
