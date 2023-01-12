package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceCountLimits extends StObject {
  
  var MaximumInstanceCount: js.UndefOr[typings.awsSdk.clientsEsMod.MaximumInstanceCount] = js.undefined
  
  var MinimumInstanceCount: js.UndefOr[typings.awsSdk.clientsEsMod.MinimumInstanceCount] = js.undefined
}
object InstanceCountLimits {
  
  inline def apply(): InstanceCountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCountLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceCountLimits] (val x: Self) extends AnyVal {
    
    inline def setMaximumInstanceCount(value: MaximumInstanceCount): Self = StObject.set(x, "MaximumInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumInstanceCountUndefined: Self = StObject.set(x, "MaximumInstanceCount", js.undefined)
    
    inline def setMinimumInstanceCount(value: MinimumInstanceCount): Self = StObject.set(x, "MinimumInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setMinimumInstanceCountUndefined: Self = StObject.set(x, "MinimumInstanceCount", js.undefined)
  }
}
