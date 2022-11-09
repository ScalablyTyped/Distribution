package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterUserOptions extends StObject {
  
  /**
    * Amazon Resource Name (ARN) for the master user. Only specify if InternalUserDatabaseEnabled is false.
    */
  var MasterUserARN: js.UndefOr[ARN] = js.undefined
  
  /**
    * User name for the master user. Only specify if InternalUserDatabaseEnabled is true.
    */
  var MasterUserName: js.UndefOr[Username] = js.undefined
  
  /**
    * Password for the master user. Only specify if InternalUserDatabaseEnabled is true.
    */
  var MasterUserPassword: js.UndefOr[Password] = js.undefined
}
object MasterUserOptions {
  
  inline def apply(): MasterUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterUserOptions]
  }
  
  extension [Self <: MasterUserOptions](x: Self) {
    
    inline def setMasterUserARN(value: ARN): Self = StObject.set(x, "MasterUserARN", value.asInstanceOf[js.Any])
    
    inline def setMasterUserARNUndefined: Self = StObject.set(x, "MasterUserARN", js.undefined)
    
    inline def setMasterUserName(value: Username): Self = StObject.set(x, "MasterUserName", value.asInstanceOf[js.Any])
    
    inline def setMasterUserNameUndefined: Self = StObject.set(x, "MasterUserName", js.undefined)
    
    inline def setMasterUserPassword(value: Password): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
  }
}
