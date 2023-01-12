package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InclusionProtectionFilters extends StObject {
  
  /**
    * The name of the protection that you want to retrieve. 
    */
  var ProtectionNames: js.UndefOr[ProtectionNameFilters] = js.undefined
  
  /**
    * The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve. 
    */
  var ResourceArns: js.UndefOr[ResourceArnFilters] = js.undefined
  
  /**
    * The type of protected resource whose protections you want to retrieve. 
    */
  var ResourceTypes: js.UndefOr[ProtectedResourceTypeFilters] = js.undefined
}
object InclusionProtectionFilters {
  
  inline def apply(): InclusionProtectionFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InclusionProtectionFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InclusionProtectionFilters] (val x: Self) extends AnyVal {
    
    inline def setProtectionNames(value: ProtectionNameFilters): Self = StObject.set(x, "ProtectionNames", value.asInstanceOf[js.Any])
    
    inline def setProtectionNamesUndefined: Self = StObject.set(x, "ProtectionNames", js.undefined)
    
    inline def setProtectionNamesVarargs(value: ProtectionName*): Self = StObject.set(x, "ProtectionNames", js.Array(value*))
    
    inline def setResourceArns(value: ResourceArnFilters): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsUndefined: Self = StObject.set(x, "ResourceArns", js.undefined)
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
    
    inline def setResourceTypes(value: ProtectedResourceTypeFilters): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ProtectedResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
  }
}
