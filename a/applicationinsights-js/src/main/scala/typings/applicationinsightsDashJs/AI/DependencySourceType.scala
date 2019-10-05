package typings.applicationinsightsDashJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DependencySourceType extends js.Object

@JSGlobal("AI.DependencySourceType")
@js.native
object DependencySourceType extends js.Object {
  @js.native
  sealed trait Aic extends DependencySourceType
  
  @js.native
  sealed trait Apmc extends DependencySourceType
  
  @js.native
  sealed trait Undefined extends DependencySourceType
  
  /* 1 */ val Aic: typings.applicationinsightsDashJs.AI.DependencySourceType.Aic with Double = js.native
  /* 2 */ val Apmc: typings.applicationinsightsDashJs.AI.DependencySourceType.Apmc with Double = js.native
  /* 0 */ val Undefined: typings.applicationinsightsDashJs.AI.DependencySourceType.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DependencySourceType with Double] = js.native
}

