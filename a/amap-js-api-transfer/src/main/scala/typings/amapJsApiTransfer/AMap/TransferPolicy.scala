package typings.amapJsApiTransfer.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransferPolicy extends js.Object

@JSGlobal("AMap.TransferPolicy")
@js.native
object TransferPolicy extends js.Object {
  /**
    * 最经济模式
    */
  @js.native
  sealed trait LEAST_FEE extends TransferPolicy
  
  /**
    * 最快捷模式
    */
  @js.native
  sealed trait LEAST_TIME extends TransferPolicy
  
  /**
    * 最少换乘模式
    */
  @js.native
  sealed trait LEAST_TRANSFER extends TransferPolicy
  
  /**
    * 最少步行模式
    */
  @js.native
  sealed trait LEAST_WALK extends TransferPolicy
  
  /**
    * 最舒适模式
    */
  @js.native
  sealed trait MOST_COMFORT extends TransferPolicy
  
  /**
    * 不乘地铁模式
    */
  @js.native
  sealed trait NO_SUBWAY extends TransferPolicy
  
}

