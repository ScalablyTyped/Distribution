package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceProfileResult extends StObject {
  
  /**
    * An object that contains information about your instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.undefined
}
object UpdateInstanceProfileResult {
  
  inline def apply(): UpdateInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceProfileResult]
  }
  
  extension [Self <: UpdateInstanceProfileResult](x: Self) {
    
    inline def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "instanceProfile", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfileUndefined: Self = StObject.set(x, "instanceProfile", js.undefined)
  }
}
