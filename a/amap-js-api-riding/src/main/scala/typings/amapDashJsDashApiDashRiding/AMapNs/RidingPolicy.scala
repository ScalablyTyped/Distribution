package typings.amapDashJsDashApiDashRiding.AMapNs

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
  
  /* 0 */ val DEFAULT: typings.amapDashJsDashApiDashRiding.AMapNs.RidingPolicy.DEFAULT with Double = js.native
  /* 2 */ val FASTEST: typings.amapDashJsDashApiDashRiding.AMapNs.RidingPolicy.FASTEST with Double = js.native
  /* 1 */ val RECOMMENDED: typings.amapDashJsDashApiDashRiding.AMapNs.RidingPolicy.RECOMMENDED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RidingPolicy with Double] = js.native
}

