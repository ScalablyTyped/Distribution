package typings.amapJsApiTransfer.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransferPolicy extends StObject
@JSGlobal("AMap.TransferPolicy")
@js.native
object TransferPolicy extends StObject {
  
  /**
    * 最经济模式
    */
  @js.native
  sealed trait LEAST_FEE
    extends StObject
       with TransferPolicy
  
  /**
    * 最快捷模式
    */
  @js.native
  sealed trait LEAST_TIME
    extends StObject
       with TransferPolicy
  
  /**
    * 最少换乘模式
    */
  @js.native
  sealed trait LEAST_TRANSFER
    extends StObject
       with TransferPolicy
  
  /**
    * 最少步行模式
    */
  @js.native
  sealed trait LEAST_WALK
    extends StObject
       with TransferPolicy
  
  /**
    * 最舒适模式
    */
  @js.native
  sealed trait MOST_COMFORT
    extends StObject
       with TransferPolicy
  
  /**
    * 不乘地铁模式
    */
  @js.native
  sealed trait NO_SUBWAY
    extends StObject
       with TransferPolicy
}
