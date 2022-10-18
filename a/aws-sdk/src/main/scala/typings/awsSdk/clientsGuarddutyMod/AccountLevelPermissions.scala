package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLevelPermissions extends StObject {
  
  /**
    * Describes the S3 Block Public Access settings of the bucket's parent account.
    */
  var BlockPublicAccess: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.BlockPublicAccess] = js.undefined
}
object AccountLevelPermissions {
  
  inline def apply(): AccountLevelPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLevelPermissions]
  }
  
  extension [Self <: AccountLevelPermissions](x: Self) {
    
    inline def setBlockPublicAccess(value: BlockPublicAccess): Self = StObject.set(x, "BlockPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicAccessUndefined: Self = StObject.set(x, "BlockPublicAccess", js.undefined)
  }
}
