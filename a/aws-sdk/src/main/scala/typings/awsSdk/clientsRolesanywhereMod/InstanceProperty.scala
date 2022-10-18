package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceProperty extends StObject {
  
  /**
    * Indicates whether the CreateSession operation was successful. 
    */
  var failed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of instanceProperty objects. 
    */
  var properties: js.UndefOr[InstancePropertyMap] = js.undefined
  
  /**
    * The ISO-8601 time stamp of when the certificate was last used in a CreateSession operation.
    */
  var seenAt: js.UndefOr[js.Date] = js.undefined
}
object InstanceProperty {
  
  inline def apply(): InstanceProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceProperty]
  }
  
  extension [Self <: InstanceProperty](x: Self) {
    
    inline def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setProperties(value: InstancePropertyMap): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSeenAt(value: js.Date): Self = StObject.set(x, "seenAt", value.asInstanceOf[js.Any])
    
    inline def setSeenAtUndefined: Self = StObject.set(x, "seenAt", js.undefined)
  }
}
