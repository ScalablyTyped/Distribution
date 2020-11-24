package typings.amapJsApiRiding.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
