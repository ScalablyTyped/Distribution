package typings.amapJsApiTransfer.AMap

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransferPolicy with Double] = js.native
  /* 1 */ @js.native
  object LEAST_FEE extends TopLevel[LEAST_FEE with Double]
  
  /* 0 */ @js.native
  object LEAST_TIME extends TopLevel[LEAST_TIME with Double]
  
  /* 2 */ @js.native
  object LEAST_TRANSFER extends TopLevel[LEAST_TRANSFER with Double]
  
  /* 3 */ @js.native
  object LEAST_WALK extends TopLevel[LEAST_WALK with Double]
  
  /* 4 */ @js.native
  object MOST_COMFORT extends TopLevel[MOST_COMFORT with Double]
  
  /* 5 */ @js.native
  object NO_SUBWAY extends TopLevel[NO_SUBWAY with Double]
  
}

