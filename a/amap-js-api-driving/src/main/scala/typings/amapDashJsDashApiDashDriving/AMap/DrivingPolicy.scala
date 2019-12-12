package typings.amapDashJsDashApiDashDriving.AMap

import org.scalablytyped.runtime.TopLevel
import typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.FEE_HIGHWAY
import typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.FEE_TRAFFIC
import typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.HIGHWAY
import typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.LEAST_DISTANCE
import typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.LEAST_FEE
import typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.LEAST_TIME
import typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.MULTI_POLICIES
import typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.REAL_TRAFFIC
import typings.amapDashJsDashApiDashDriving.AMap.DrivingPolicy.TRAFFIC_HIGHWAY
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrivingPolicy with Double] = js.native
  /* 7 */ @js.native
  object FEE_HIGHWAY extends TopLevel[FEE_HIGHWAY with Double]
  
  /* 8 */ @js.native
  object FEE_TRAFFIC extends TopLevel[FEE_TRAFFIC with Double]
  
  /* 6 */ @js.native
  object HIGHWAY extends TopLevel[HIGHWAY with Double]
  
  /* 2 */ @js.native
  object LEAST_DISTANCE extends TopLevel[LEAST_DISTANCE with Double]
  
  /* 1 */ @js.native
  object LEAST_FEE extends TopLevel[LEAST_FEE with Double]
  
  /* 0 */ @js.native
  object LEAST_TIME extends TopLevel[LEAST_TIME with Double]
  
  /* 5 */ @js.native
  object MULTI_POLICIES extends TopLevel[MULTI_POLICIES with Double]
  
  /* 4 */ @js.native
  object REAL_TRAFFIC extends TopLevel[REAL_TRAFFIC with Double]
  
  /* 9 */ @js.native
  object TRAFFIC_HIGHWAY extends TopLevel[TRAFFIC_HIGHWAY with Double]
  
}

