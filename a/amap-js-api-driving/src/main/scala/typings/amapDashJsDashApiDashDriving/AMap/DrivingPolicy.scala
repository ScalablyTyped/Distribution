package typings.amapDashJsDashApiDashDriving.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrivingPolicy extends js.Object

@JSGlobal("AMap.DrivingPolicy")
@js.native
object DrivingPolicy extends js.Object {
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
  
  /* 7 */ val FEE_HIGHWAY: typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.FEE_HIGHWAY with Double = js.native
  /* 8 */ val FEE_TRAFFIC: typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.FEE_TRAFFIC with Double = js.native
  /* 6 */ val HIGHWAY: typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.HIGHWAY with Double = js.native
  /* 2 */ val LEAST_DISTANCE: typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.LEAST_DISTANCE with Double = js.native
  /* 1 */ val LEAST_FEE: typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.LEAST_FEE with Double = js.native
  /* 0 */ val LEAST_TIME: typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.LEAST_TIME with Double = js.native
  /* 5 */ val MULTI_POLICIES: typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.MULTI_POLICIES with Double = js.native
  /* 4 */ val REAL_TRAFFIC: typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.REAL_TRAFFIC with Double = js.native
  /* 9 */ val TRAFFIC_HIGHWAY: typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.TRAFFIC_HIGHWAY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrivingPolicy with Double] = js.native
}

