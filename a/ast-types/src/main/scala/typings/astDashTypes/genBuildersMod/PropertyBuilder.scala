package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsComputed
import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.init
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyBuilder extends js.Object {
  def apply(kind: get, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: get, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: get, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: LiteralKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: LiteralKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: LiteralKind, value: PatternKind): Property = js.native
  def from(params: Anon_CommentsComputed): Property = js.native
}

