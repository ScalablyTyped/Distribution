package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrivingPolicy extends js.Object

@JSGlobal("AMap.DrivingPolicy")
@js.native
object DrivingPolicy extends js.Object {
  @js.native
  sealed trait LEAST_DISTANCE
    extends amapDashJsDashSdkLib.AMapNs.DrivingPolicy
  
  @js.native
  sealed trait LEAST_FEE
    extends amapDashJsDashSdkLib.AMapNs.DrivingPolicy
  
  @js.native
  sealed trait LEAST_TIME
    extends amapDashJsDashSdkLib.AMapNs.DrivingPolicy
  
  @js.native
  sealed trait REAL_TRAFFIC
    extends amapDashJsDashSdkLib.AMapNs.DrivingPolicy
  
  /* 2 */ val LEAST_DISTANCE: LEAST_DISTANCE with scala.Double = js.native
  /* 1 */ val LEAST_FEE: LEAST_FEE with scala.Double = js.native
  /* 0 */ val LEAST_TIME: LEAST_TIME with scala.Double = js.native
  /* 3 */ val REAL_TRAFFIC: REAL_TRAFFIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[amapDashJsDashSdkLib.AMapNs.DrivingPolicy with scala.Double] = js.native
}

