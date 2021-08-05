package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accounts extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): Account
  
  /* private */ @JSName("Outlook.Accounts_typekey")
  var OutlookDotAccounts_typekey: Accounts
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object Accounts {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Account,
    OutlookDotAccounts_typekey: Accounts,
    Parent: js.Any,
    Session: NameSpace
  ): Accounts = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Accounts_typekey")(OutlookDotAccounts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accounts]
  }
  
  extension [Self <: Accounts](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any => Account): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotAccounts_typekey(value: Accounts): Self = StObject.set(x, "Outlook.Accounts_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
