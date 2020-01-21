package typings.amapJsApiRiding.AMap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RidingPolicy extends js.Object

@JSGlobal("AMap.RidingPolicy")
@js.native
object RidingPolicy extends js.Object {
   // 推荐路线及最快路线综合
  @js.native
  sealed trait DEFAULT extends RidingPolicy
  
  @js.native
  sealed trait FASTEST extends RidingPolicy
  
   // 推荐路线
  @js.native
  sealed trait RECOMMENDED extends RidingPolicy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RidingPolicy with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 2 */ @js.native
  object FASTEST extends TopLevel[FASTEST with Double]
  
  /* 1 */ @js.native
  object RECOMMENDED extends TopLevel[RECOMMENDED with Double]
  
}

