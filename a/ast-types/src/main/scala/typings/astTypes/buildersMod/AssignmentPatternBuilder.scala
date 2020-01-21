package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLeftLocRight
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentPatternBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind): AssignmentPattern = js.native
  def from(params: AnonCommentsLeftLocRight): AssignmentPattern = js.native
}

