package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotScaledReason extends StObject {
  
  /**
    * A code that represents the reason for not scaling. Valid values:   AutoScalingAnticipatedFlapping   TargetServicePutResourceAsUnscalable   AlreadyAtMaxCapacity   AlreadyAtMinCapacity   AlreadyAtDesiredCapacity  
    */
  var Code: XmlString
  
  /**
    * The current capacity.
    */
  var CurrentCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  
  /**
    * The maximum capacity.
    */
  var MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  
  /**
    * The minimum capacity.
    */
  var MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
}
object NotScaledReason {
  
  inline def apply(Code: XmlString): NotScaledReason = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotScaledReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotScaledReason] (val x: Self) extends AnyVal {
    
    inline def setCode(value: XmlString): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCurrentCapacity(value: ResourceCapacity): Self = StObject.set(x, "CurrentCapacity", value.asInstanceOf[js.Any])
    
    inline def setCurrentCapacityUndefined: Self = StObject.set(x, "CurrentCapacity", js.undefined)
    
    inline def setMaxCapacity(value: ResourceCapacity): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setMinCapacity(value: ResourceCapacity): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
    
    inline def setMinCapacityUndefined: Self = StObject.set(x, "MinCapacity", js.undefined)
  }
}
