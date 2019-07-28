package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Accessibility
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ObjectProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPropertyBuilder extends js.Object {
  def apply(key: ExpressionKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: ExpressionKind, value: PatternKind): ObjectProperty = js.native
  def apply(key: IdentifierKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: IdentifierKind, value: PatternKind): ObjectProperty = js.native
  def apply(key: LiteralKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: LiteralKind, value: PatternKind): ObjectProperty = js.native
  def from(params: Anon_Accessibility): ObjectProperty = js.native
}

