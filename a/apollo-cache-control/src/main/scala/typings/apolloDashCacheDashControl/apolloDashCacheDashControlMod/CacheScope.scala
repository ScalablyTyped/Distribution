package typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CacheScope with String] = js.native
  /* "PRIVATE" */ @js.native
  object Private extends TopLevel[Private with String]
  
  /* "PUBLIC" */ @js.native
  object Public extends TopLevel[Public with String]
  
}

