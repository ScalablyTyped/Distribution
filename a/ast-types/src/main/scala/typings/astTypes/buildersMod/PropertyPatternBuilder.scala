package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsComputedKey
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.PropertyPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyPatternBuilder extends js.Object {
  def apply(key: ExpressionKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: IdentifierKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: LiteralKind, pattern: PatternKind): PropertyPattern = js.native
  def from(params: AnonCommentsComputedKey): PropertyPattern = js.native
}

