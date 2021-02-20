package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSelector extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  @JSName("Outlook.AccountSelector_typekey")
  var OutlookDotAccountSelector_typekey: AccountSelector = js.native
  
  val Parent: js.Any = js.native
  
  val SelectedAccount: Account = js.native
  
  val Session: NameSpace = js.native
}
object AccountSelector {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    OutlookDotAccountSelector_typekey: AccountSelector,
    Parent: js.Any,
    SelectedAccount: Account,
    Session: NameSpace
  ): AccountSelector = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SelectedAccount = SelectedAccount.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AccountSelector_typekey")(OutlookDotAccountSelector_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountSelector]
  }
  
  @scala.inline
  implicit class AccountSelectorMutableBuilder[Self <: AccountSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotAccountSelector_typekey(value: AccountSelector): Self = StObject.set(x, "Outlook.AccountSelector_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedAccount(value: Account): Self = StObject.set(x, "SelectedAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
