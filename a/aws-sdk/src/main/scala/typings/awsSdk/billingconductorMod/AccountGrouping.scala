package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountGrouping extends StObject {
  
  /**
    *  The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing family, and not associated with another billing group. 
    */
  var LinkedAccountIds: AccountIdList
}
object AccountGrouping {
  
  inline def apply(LinkedAccountIds: AccountIdList): AccountGrouping = {
    val __obj = js.Dynamic.literal(LinkedAccountIds = LinkedAccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountGrouping]
  }
  
  extension [Self <: AccountGrouping](x: Self) {
    
    inline def setLinkedAccountIds(value: AccountIdList): Self = StObject.set(x, "LinkedAccountIds", value.asInstanceOf[js.Any])
    
    inline def setLinkedAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "LinkedAccountIds", js.Array(value*))
  }
}
