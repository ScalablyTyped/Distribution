package typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CacheScope extends js.Object

@JSImport("apollo-cache-control", "CacheScope")
@js.native
object CacheScope extends js.Object {
  @js.native
  sealed trait Private extends CacheScope
  
  @js.native
  sealed trait Public extends CacheScope
  
  /* "PRIVATE" */ val Private: typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod.CacheScope.Private with String = js.native
  /* "PUBLIC" */ val Public: typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod.CacheScope.Public with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CacheScope with String] = js.native
}

