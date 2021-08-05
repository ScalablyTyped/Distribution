package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedAccount extends StObject {
  
  val SelectedAccount: typings.activexOutlook.Outlook.Account
}
object SelectedAccount {
  
  inline def apply(SelectedAccount: typings.activexOutlook.Outlook.Account): SelectedAccount = {
    val __obj = js.Dynamic.literal(SelectedAccount = SelectedAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedAccount]
  }
  
  extension [Self <: SelectedAccount](x: Self) {
    
    inline def setSelectedAccount(value: typings.activexOutlook.Outlook.Account): Self = StObject.set(x, "SelectedAccount", value.asInstanceOf[js.Any])
  }
}
