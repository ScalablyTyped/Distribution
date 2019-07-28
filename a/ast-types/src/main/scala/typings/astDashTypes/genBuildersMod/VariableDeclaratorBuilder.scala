package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsId
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclaratorBuilder extends js.Object {
  def apply(id: PatternKind): VariableDeclarator = js.native
  def apply(id: PatternKind, init: ExpressionKind): VariableDeclarator = js.native
  def from(params: Anon_CommentsId): VariableDeclarator = js.native
}

