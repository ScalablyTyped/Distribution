package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePermissions extends StObject {
  
  /**
    * Indicates whether the image can be used for a fleet.
    */
  var allowFleet: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * Indicates whether the image can be used for an image builder.
    */
  var allowImageBuilder: js.UndefOr[BooleanObject] = js.undefined
}
object ImagePermissions {
  
  inline def apply(): ImagePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePermissions]
  }
  
  extension [Self <: ImagePermissions](x: Self) {
    
    inline def setAllowFleet(value: BooleanObject): Self = StObject.set(x, "allowFleet", value.asInstanceOf[js.Any])
    
    inline def setAllowFleetUndefined: Self = StObject.set(x, "allowFleet", js.undefined)
    
    inline def setAllowImageBuilder(value: BooleanObject): Self = StObject.set(x, "allowImageBuilder", value.asInstanceOf[js.Any])
    
    inline def setAllowImageBuilderUndefined: Self = StObject.set(x, "allowImageBuilder", js.undefined)
  }
}
