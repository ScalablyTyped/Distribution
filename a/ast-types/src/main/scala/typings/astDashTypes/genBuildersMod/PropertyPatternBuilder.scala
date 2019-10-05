package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsComputedKey
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.PropertyPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyPatternBuilder extends js.Object {
  def apply(key: ExpressionKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: IdentifierKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: LiteralKind, pattern: PatternKind): PropertyPattern = js.native
  def from(params: Anon_CommentsComputedKey): PropertyPattern = js.native
}

