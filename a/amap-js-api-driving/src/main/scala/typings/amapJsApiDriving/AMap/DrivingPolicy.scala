package typings.amapJsApiDriving.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DrivingPolicy extends StObject
@JSGlobal("AMap.DrivingPolicy")
@js.native
object DrivingPolicy extends StObject {
  
  @js.native
  sealed trait FEE_HIGHWAY
    extends StObject
       with DrivingPolicy
  
  @js.native
  sealed trait FEE_TRAFFIC
    extends StObject
       with DrivingPolicy
  
  @js.native
  sealed trait HIGHWAY
    extends StObject
       with DrivingPolicy
  
  /**
    * 最短距离模式
    */
  @js.native
  sealed trait LEAST_DISTANCE
    extends StObject
       with DrivingPolicy
  
  /**
    * 最经济模式
    */
  @js.native
  sealed trait LEAST_FEE
    extends StObject
       with DrivingPolicy
  
  /**
    * 最快捷模式
    */
  @js.native
  sealed trait LEAST_TIME
    extends StObject
       with DrivingPolicy
  
  // form DragRoute
  @js.native
  sealed trait MULTI_POLICIES
    extends StObject
       with DrivingPolicy
  
  /**
    * 考虑实时路况
    */
  @js.native
  sealed trait REAL_TRAFFIC
    extends StObject
       with DrivingPolicy
  
  @js.native
  sealed trait TRAFFIC_HIGHWAY
    extends StObject
       with DrivingPolicy
}
