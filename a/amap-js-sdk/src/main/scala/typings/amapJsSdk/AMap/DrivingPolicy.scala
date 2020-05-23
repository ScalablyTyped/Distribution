package typings.amapJsSdk.AMap

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
  
}

