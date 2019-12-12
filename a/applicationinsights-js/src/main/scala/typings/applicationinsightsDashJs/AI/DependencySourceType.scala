package typings.applicationinsightsDashJs.AI

import org.scalablytyped.runtime.TopLevel
import typings.applicationinsightsDashJs.AI.DependencySourceType.Aic
import typings.applicationinsightsDashJs.AI.DependencySourceType.Apmc
import typings.applicationinsightsDashJs.AI.DependencySourceType.Undefined
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DependencySourceType with Double] = js.native
  /* 1 */ @js.native
  object Aic extends TopLevel[Aic with Double]
  
  /* 2 */ @js.native
  object Apmc extends TopLevel[Apmc with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}

