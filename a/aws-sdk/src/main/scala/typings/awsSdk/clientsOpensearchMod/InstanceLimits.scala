package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceLimits extends StObject {
  
  var InstanceCountLimits: js.UndefOr[typings.awsSdk.clientsOpensearchMod.InstanceCountLimits] = js.undefined
}
object InstanceLimits {
  
  inline def apply(): InstanceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceLimits]
  }
  
  extension [Self <: InstanceLimits](x: Self) {
    
    inline def setInstanceCountLimits(value: InstanceCountLimits): Self = StObject.set(x, "InstanceCountLimits", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountLimitsUndefined: Self = StObject.set(x, "InstanceCountLimits", js.undefined)
  }
}
