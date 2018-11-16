package typings
package applicationinsightsDashJsLib.AINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DependencyKind extends js.Object

@JSGlobal("AI.DependencyKind")
@js.native
object DependencyKind extends js.Object {
  @js.native
  sealed trait Http
    extends applicationinsightsDashJsLib.AINs.DependencyKind
  
  @js.native
  sealed trait Other
    extends applicationinsightsDashJsLib.AINs.DependencyKind
  
  @js.native
  sealed trait SQL
    extends applicationinsightsDashJsLib.AINs.DependencyKind
  
  /* 1 */ val Http: Http with scala.Double = js.native
  /* 2 */ val Other: Other with scala.Double = js.native
  /* 0 */ val SQL: SQL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[applicationinsightsDashJsLib.AINs.DependencyKind with scala.Double] = js.native
}

