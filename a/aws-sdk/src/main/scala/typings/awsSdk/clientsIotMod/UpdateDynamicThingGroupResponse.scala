package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDynamicThingGroupResponse extends StObject {
  
  /**
    * The dynamic thing group version.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object UpdateDynamicThingGroupResponse {
  
  inline def apply(): UpdateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDynamicThingGroupResponse]
  }
  
  extension [Self <: UpdateDynamicThingGroupResponse](x: Self) {
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
