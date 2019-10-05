package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrivingPolicy extends js.Object

@JSGlobal("AMap.DrivingPolicy")
@js.native
object DrivingPolicy extends js.Object {
  @js.native
  sealed trait LEAST_DISTANCE extends DrivingPolicy
  
  @js.native
  sealed trait LEAST_FEE extends DrivingPolicy
  
  @js.native
  sealed trait LEAST_TIME extends DrivingPolicy
  
  @js.native
  sealed trait REAL_TRAFFIC extends DrivingPolicy
  
  /* 2 */ val LEAST_DISTANCE: typings.amapDashJsDashSdk.AMap.DrivingPolicy.LEAST_DISTANCE with Double = js.native
  /* 1 */ val LEAST_FEE: typings.amapDashJsDashSdk.AMap.DrivingPolicy.LEAST_FEE with Double = js.native
  /* 0 */ val LEAST_TIME: typings.amapDashJsDashSdk.AMap.DrivingPolicy.LEAST_TIME with Double = js.native
  /* 3 */ val REAL_TRAFFIC: typings.amapDashJsDashSdk.AMap.DrivingPolicy.REAL_TRAFFIC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrivingPolicy with Double] = js.native
}

