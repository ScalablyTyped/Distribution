package typings.applicationinsightsJs.AI

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DependencyKind with Double] = js.native
  /* 1 */ @js.native
  object Http extends TopLevel[Http with Double]
  
  /* 2 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  /* 0 */ @js.native
  object SQL extends TopLevel[SQL with Double]
  
}

