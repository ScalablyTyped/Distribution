package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingConstraints extends StObject {
  
  /**
    * The upper boundary of EC2 instances in an instance group beyond which scaling activities are not allowed to grow. Scale-out activities will not add instances beyond this boundary.
    */
  var MaxCapacity: Integer
  
  /**
    * The lower boundary of EC2 instances in an instance group below which scaling activities are not allowed to shrink. Scale-in activities will not terminate instances below this boundary.
    */
  var MinCapacity: Integer
}
object ScalingConstraints {
  
  inline def apply(MaxCapacity: Integer, MinCapacity: Integer): ScalingConstraints = {
    val __obj = js.Dynamic.literal(MaxCapacity = MaxCapacity.asInstanceOf[js.Any], MinCapacity = MinCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalingConstraints] (val x: Self) extends AnyVal {
    
    inline def setMaxCapacity(value: Integer): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMinCapacity(value: Integer): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
  }
}
