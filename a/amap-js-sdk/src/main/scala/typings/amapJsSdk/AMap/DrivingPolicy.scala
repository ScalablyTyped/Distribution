package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DrivingPolicy extends StObject
@JSGlobal("AMap.DrivingPolicy")
@js.native
object DrivingPolicy extends StObject {
  
  @js.native
  sealed trait LEAST_DISTANCE
    extends StObject
       with DrivingPolicy
  
  @js.native
  sealed trait LEAST_FEE
    extends StObject
       with DrivingPolicy
  
  @js.native
  sealed trait LEAST_TIME
    extends StObject
       with DrivingPolicy
  
  @js.native
  sealed trait REAL_TRAFFIC
    extends StObject
       with DrivingPolicy
}
