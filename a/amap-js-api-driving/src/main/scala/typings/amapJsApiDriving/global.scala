package typings.amapJsApiDriving

import typings.amapJsApiDriving.AMap.Driving.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object AMap extends js.Object {
    @js.native
    /**
      * 驾车路线规划服务
      * @param options 自定义选项
      */
    class Driving ()
      extends typings.amapJsApiDriving.AMap.Driving {
      def this(options: Options) = this()
    }
    
    @js.native
    object DrivingPolicy extends js.Object {
      /* 7 */ val FEE_HIGHWAY: typings.amapJsApiDriving.AMap.DrivingPolicy.FEE_HIGHWAY with Double = js.native
      /* 8 */ val FEE_TRAFFIC: typings.amapJsApiDriving.AMap.DrivingPolicy.FEE_TRAFFIC with Double = js.native
      /* 6 */ val HIGHWAY: typings.amapJsApiDriving.AMap.DrivingPolicy.HIGHWAY with Double = js.native
      /* 2 */ val LEAST_DISTANCE: typings.amapJsApiDriving.AMap.DrivingPolicy.LEAST_DISTANCE with Double = js.native
      /* 1 */ val LEAST_FEE: typings.amapJsApiDriving.AMap.DrivingPolicy.LEAST_FEE with Double = js.native
      /* 0 */ val LEAST_TIME: typings.amapJsApiDriving.AMap.DrivingPolicy.LEAST_TIME with Double = js.native
      /* 5 */ val MULTI_POLICIES: typings.amapJsApiDriving.AMap.DrivingPolicy.MULTI_POLICIES with Double = js.native
      /* 4 */ val REAL_TRAFFIC: typings.amapJsApiDriving.AMap.DrivingPolicy.REAL_TRAFFIC with Double = js.native
      /* 9 */ val TRAFFIC_HIGHWAY: typings.amapJsApiDriving.AMap.DrivingPolicy.TRAFFIC_HIGHWAY with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.amapJsApiDriving.AMap.DrivingPolicy with Double] = js.native
    }
    
  }
  
}

