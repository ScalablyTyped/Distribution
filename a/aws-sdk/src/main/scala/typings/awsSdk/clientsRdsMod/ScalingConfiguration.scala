package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingConfiguration extends StObject {
  
  /**
    * A value that indicates whether to allow or disallow automatic pause for an Aurora DB cluster in serverless DB engine mode. A DB cluster can be paused only when it's idle (it has no connections).  If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it. 
    */
  var AutoPause: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The maximum capacity for an Aurora DB cluster in serverless DB engine mode. For Aurora MySQL, valid capacity values are 1, 2, 4, 8, 16, 32, 64, 128, and 256. For Aurora PostgreSQL, valid capacity values are 2, 4, 8, 16, 32, 64, 192, and 384. The maximum capacity must be greater than or equal to the minimum capacity.
    */
  var MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The minimum capacity for an Aurora DB cluster in serverless DB engine mode. For Aurora MySQL, valid capacity values are 1, 2, 4, 8, 16, 32, 64, 128, and 256. For Aurora PostgreSQL, valid capacity values are 2, 4, 8, 16, 32, 64, 192, and 384. The minimum capacity must be less than or equal to the maximum capacity.
    */
  var MinCapacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The amount of time, in seconds, that Aurora Serverless v1 tries to find a scaling point to perform seamless scaling before enforcing the timeout action. The default is 300. Specify a value between 60 and 600 seconds.
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The time, in seconds, before an Aurora DB cluster in serverless mode is paused. Specify a value between 300 and 86,400 seconds.
    */
  var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The action to take when the timeout is reached, either ForceApplyCapacityChange or RollbackCapacityChange.  ForceApplyCapacityChange sets the capacity to the specified value as soon as possible.  RollbackCapacityChange, the default, ignores the capacity change if a scaling point isn't found in the timeout period.  If you specify ForceApplyCapacityChange, connections that prevent Aurora Serverless v1 from finding a scaling point might be dropped.  For more information, see  Autoscaling for Aurora Serverless v1 in the Amazon Aurora User Guide.
    */
  var TimeoutAction: js.UndefOr[String] = js.undefined
}
object ScalingConfiguration {
  
  inline def apply(): ScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAutoPause(value: BooleanOptional): Self = StObject.set(x, "AutoPause", value.asInstanceOf[js.Any])
    
    inline def setAutoPauseUndefined: Self = StObject.set(x, "AutoPause", js.undefined)
    
    inline def setMaxCapacity(value: IntegerOptional): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setMinCapacity(value: IntegerOptional): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
    
    inline def setMinCapacityUndefined: Self = StObject.set(x, "MinCapacity", js.undefined)
    
    inline def setSecondsBeforeTimeout(value: IntegerOptional): Self = StObject.set(x, "SecondsBeforeTimeout", value.asInstanceOf[js.Any])
    
    inline def setSecondsBeforeTimeoutUndefined: Self = StObject.set(x, "SecondsBeforeTimeout", js.undefined)
    
    inline def setSecondsUntilAutoPause(value: IntegerOptional): Self = StObject.set(x, "SecondsUntilAutoPause", value.asInstanceOf[js.Any])
    
    inline def setSecondsUntilAutoPauseUndefined: Self = StObject.set(x, "SecondsUntilAutoPause", js.undefined)
    
    inline def setTimeoutAction(value: String): Self = StObject.set(x, "TimeoutAction", value.asInstanceOf[js.Any])
    
    inline def setTimeoutActionUndefined: Self = StObject.set(x, "TimeoutAction", js.undefined)
  }
}
