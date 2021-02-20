package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountSet Class */
@js.native
trait FaxAccountSet extends StObject {
  
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
  implicit class FaxAccountSetMutableBuilder[Self <: FaxAccountSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAccount(value: String => FaxAccount): Self = StObject.set(x, "AddAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFAXCOMEXLibDotFaxAccountSet_typekey(value: FaxAccountSet): Self = StObject.set(x, "FAXCOMEXLib.FaxAccountSet_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAccount(value: String => FaxAccount): Self = StObject.set(x, "GetAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAccounts(value: () => FaxAccounts): Self = StObject.set(x, "GetAccounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAccount(value: String => Unit): Self = StObject.set(x, "RemoveAccount", js.Any.fromFunction1(value))
  }
}
