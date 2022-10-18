package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLedgerPermissionsModeResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the ledger.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQldbMod.Arn] = js.undefined
  
  /**
    * The name of the ledger.
    */
  var Name: js.UndefOr[LedgerName] = js.undefined
  
  /**
    * The current permissions mode of the ledger.
    */
  var PermissionsMode: js.UndefOr[typings.awsSdk.clientsQldbMod.PermissionsMode] = js.undefined
}
object UpdateLedgerPermissionsModeResponse {
  
  inline def apply(): UpdateLedgerPermissionsModeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLedgerPermissionsModeResponse]
  }
  
  extension [Self <: UpdateLedgerPermissionsModeResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPermissionsMode(value: PermissionsMode): Self = StObject.set(x, "PermissionsMode", value.asInstanceOf[js.Any])
    
    inline def setPermissionsModeUndefined: Self = StObject.set(x, "PermissionsMode", js.undefined)
  }
}
