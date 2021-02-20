package typings.amapJsApiDriving.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DrivingPolicy extends StObject
@JSGlobal("AMap.DrivingPolicy")
@js.native
object DrivingPolicy extends StObject {
  
  @js.native
  sealed trait FEE_HIGHWAY extends DrivingPolicy
  
  @js.native
  sealed trait FEE_TRAFFIC extends DrivingPolicy
  
  @js.native
  sealed trait HIGHWAY extends DrivingPolicy
  
  /**
    * 最短距离模式
    */
  @js.native
  sealed trait LEAST_DISTANCE extends DrivingPolicy
  
  /**
    * 最经济模式
    */
  @js.native
  sealed trait LEAST_FEE extends DrivingPolicy
  
  /**
    * 最快捷模式
    */
  @js.native
  sealed trait LEAST_TIME extends DrivingPolicy
  
  // form DragRoute
  @js.native
  sealed trait MULTI_POLICIES extends DrivingPolicy
  
  /**
    * 考虑实时路况
    */
  @js.native
  sealed trait REAL_TRAFFIC extends DrivingPolicy
  
  @js.native
  sealed trait TRAFFIC_HIGHWAY extends DrivingPolicy
}
