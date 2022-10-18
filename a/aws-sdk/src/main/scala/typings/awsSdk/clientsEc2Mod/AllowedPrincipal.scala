package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedPrincipal extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the principal.
    */
  var Principal: js.UndefOr[String] = js.undefined
  
  /**
    * The type of principal.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.clientsEc2Mod.PrincipalType] = js.undefined
  
  /**
    * The ID of the service.
    */
  var ServiceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the service permission.
    */
  var ServicePermissionId: js.UndefOr[String] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object AllowedPrincipal {
  
  inline def apply(): AllowedPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPrincipal]
  }
  
  extension [Self <: AllowedPrincipal](x: Self) {
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setServicePermissionId(value: String): Self = StObject.set(x, "ServicePermissionId", value.asInstanceOf[js.Any])
    
    inline def setServicePermissionIdUndefined: Self = StObject.set(x, "ServicePermissionId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
