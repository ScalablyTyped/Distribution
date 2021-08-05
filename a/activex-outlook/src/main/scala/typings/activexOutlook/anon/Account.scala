package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  val Account: typings.activexOutlook.Outlook.Account
}
object Account {
  
  inline def apply(Account: typings.activexOutlook.Outlook.Account): Account = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccount(value: typings.activexOutlook.Outlook.Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
  }
}
