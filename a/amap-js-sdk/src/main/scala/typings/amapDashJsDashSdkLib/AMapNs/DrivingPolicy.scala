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
  
  val LEAST_DISTANCE: LEAST_DISTANCE with java.lang.String = js.native
  val LEAST_FEE: LEAST_FEE with java.lang.String = js.native
  val LEAST_TIME: LEAST_TIME with java.lang.String = js.native
  val REAL_TRAFFIC: REAL_TRAFFIC with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[amapDashJsDashSdkLib.AMapNs.DrivingPolicy with java.lang.String] = js.native
}

