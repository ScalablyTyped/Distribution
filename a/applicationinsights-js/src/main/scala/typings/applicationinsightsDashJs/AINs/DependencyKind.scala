package typings.applicationinsightsDashJs.AINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DependencyKind extends js.Object

@JSGlobal("AI.DependencyKind")
@js.native
object DependencyKind extends js.Object {
  @js.native
  sealed trait Http extends DependencyKind
  
  @js.native
  sealed trait Other extends DependencyKind
  
  @js.native
  sealed trait SQL extends DependencyKind
  
  /* 1 */ val Http: typings.applicationinsightsDashJs.AINs.DependencyKind.Http with Double = js.native
  /* 2 */ val Other: typings.applicationinsightsDashJs.AINs.DependencyKind.Other with Double = js.native
  /* 0 */ val SQL: typings.applicationinsightsDashJs.AINs.DependencyKind.SQL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DependencyKind with Double] = js.native
}

