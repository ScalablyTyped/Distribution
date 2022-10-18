package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationExceptionResourceKey extends StObject {
  
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: js.UndefOr[StringWithCharLimit1024] = js.undefined
  
  /**
    * The type of a resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object RemediationExceptionResourceKey {
  
  inline def apply(): RemediationExceptionResourceKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExceptionResourceKey]
  }
  
  extension [Self <: RemediationExceptionResourceKey](x: Self) {
    
    inline def setResourceId(value: StringWithCharLimit1024): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
