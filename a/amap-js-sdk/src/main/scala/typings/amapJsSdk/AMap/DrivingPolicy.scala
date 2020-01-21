package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrivingPolicy with Double] = js.native
  /* 2 */ @js.native
  object LEAST_DISTANCE extends TopLevel[LEAST_DISTANCE with Double]
  
  /* 1 */ @js.native
  object LEAST_FEE extends TopLevel[LEAST_FEE with Double]
  
  /* 0 */ @js.native
  object LEAST_TIME extends TopLevel[LEAST_TIME with Double]
  
  /* 3 */ @js.native
  object REAL_TRAFFIC extends TopLevel[REAL_TRAFFIC with Double]
  
}

