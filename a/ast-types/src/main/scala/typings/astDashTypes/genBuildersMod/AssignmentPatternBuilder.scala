package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLeftLocRight
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentPatternBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind): AssignmentPattern = js.native
  def from(params: Anon_CommentsLeftLocRight): AssignmentPattern = js.native
}

