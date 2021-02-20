package typings.amapJsApiTransfer

import typings.amapJsApiTransfer.AMap.Transfer.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Transfer")
    @js.native
    class Transfer protected ()
      extends typings.amapJsApiTransfer.AMap.Transfer {
      /**
        * 公交换乘服务
        * @param options 构造函数选项
        */
      def this(options: Options) = this()
    }
    
    @JSGlobal("AMap.TransferPolicy")
    @js.native
    object TransferPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.amapJsApiTransfer.AMap.TransferPolicy with Double] = js.native
      
      /* 1 */ val LEAST_FEE: typings.amapJsApiTransfer.AMap.TransferPolicy.LEAST_FEE with Double = js.native
      
      /* 0 */ val LEAST_TIME: typings.amapJsApiTransfer.AMap.TransferPolicy.LEAST_TIME with Double = js.native
      
      /* 2 */ val LEAST_TRANSFER: typings.amapJsApiTransfer.AMap.TransferPolicy.LEAST_TRANSFER with Double = js.native
      
      /* 3 */ val LEAST_WALK: typings.amapJsApiTransfer.AMap.TransferPolicy.LEAST_WALK with Double = js.native
      
      /* 4 */ val MOST_COMFORT: typings.amapJsApiTransfer.AMap.TransferPolicy.MOST_COMFORT with Double = js.native
      
      /* 5 */ val NO_SUBWAY: typings.amapJsApiTransfer.AMap.TransferPolicy.NO_SUBWAY with Double = js.native
    }
  }
}
