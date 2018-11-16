package typings
package apolloDashCacheDashControlLib.apolloDashCacheDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CacheScope extends js.Object

@JSImport("apollo-cache-control", "CacheScope")
@js.native
object CacheScope extends js.Object {
  @js.native
  sealed trait Private
    extends apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheScope
  
  @js.native
  sealed trait Public
    extends apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheScope
  
  /* "PRIVATE" */ val Private: Private with java.lang.String = js.native
  /* "PUBLIC" */ val Public: Public with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheScope with java.lang.String
  ] = js.native
}

