package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageTotal extends StObject {
  
  /**
    * The account ID of the account that usage data was retrieved for.
    */
  var accountId: js.UndefOr[MeteringAccountId] = js.undefined
  
  /**
    * An object representing the total usage for an account.
    */
  var usage: js.UndefOr[UsageList] = js.undefined
}
object UsageTotal {
  
  inline def apply(): UsageTotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageTotal]
  }
  
  extension [Self <: UsageTotal](x: Self) {
    
    inline def setAccountId(value: MeteringAccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setUsage(value: UsageList): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setUsageVarargs(value: Usage*): Self = StObject.set(x, "usage", js.Array(value*))
  }
}
