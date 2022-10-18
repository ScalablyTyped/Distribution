package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceCount extends StObject {
  
  /**
    * The number of listed Reserved Instances in the state specified by the state.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The states of the listed Reserved Instances.
    */
  var State: js.UndefOr[ListingState] = js.undefined
}
object InstanceCount {
  
  inline def apply(): InstanceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCount]
  }
  
  extension [Self <: InstanceCount](x: Self) {
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setState(value: ListingState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
