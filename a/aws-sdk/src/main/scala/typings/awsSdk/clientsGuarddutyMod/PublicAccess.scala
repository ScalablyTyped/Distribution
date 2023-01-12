package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicAccess extends StObject {
  
  /**
    * Describes the effective permission on this bucket after factoring all attached policies.
    */
  var EffectivePermission: js.UndefOr[String] = js.undefined
  
  /**
    * Contains information about how permissions are configured for the S3 bucket.
    */
  var PermissionConfiguration: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.PermissionConfiguration] = js.undefined
}
object PublicAccess {
  
  inline def apply(): PublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicAccess] (val x: Self) extends AnyVal {
    
    inline def setEffectivePermission(value: String): Self = StObject.set(x, "EffectivePermission", value.asInstanceOf[js.Any])
    
    inline def setEffectivePermissionUndefined: Self = StObject.set(x, "EffectivePermission", js.undefined)
    
    inline def setPermissionConfiguration(value: PermissionConfiguration): Self = StObject.set(x, "PermissionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPermissionConfigurationUndefined: Self = StObject.set(x, "PermissionConfiguration", js.undefined)
  }
}
