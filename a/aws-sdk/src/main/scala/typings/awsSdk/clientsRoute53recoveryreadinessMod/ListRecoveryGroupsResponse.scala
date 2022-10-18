package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecoveryGroupsResponse extends StObject {
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of recovery groups.
    */
  var RecoveryGroups: js.UndefOr[listOfRecoveryGroupOutput] = js.undefined
}
object ListRecoveryGroupsResponse {
  
  inline def apply(): ListRecoveryGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecoveryGroupsResponse]
  }
  
  extension [Self <: ListRecoveryGroupsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecoveryGroups(value: listOfRecoveryGroupOutput): Self = StObject.set(x, "RecoveryGroups", value.asInstanceOf[js.Any])
    
    inline def setRecoveryGroupsUndefined: Self = StObject.set(x, "RecoveryGroups", js.undefined)
    
    inline def setRecoveryGroupsVarargs(value: RecoveryGroupOutput*): Self = StObject.set(x, "RecoveryGroups", js.Array(value*))
  }
}
