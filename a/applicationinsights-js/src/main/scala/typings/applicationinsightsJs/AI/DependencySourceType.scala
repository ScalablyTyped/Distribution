package typings.applicationinsightsJs.AI

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
  
}

