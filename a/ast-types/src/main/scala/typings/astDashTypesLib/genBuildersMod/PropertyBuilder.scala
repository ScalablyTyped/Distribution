package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyBuilder extends js.Object {
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.get,
    key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  ): astDashTypesLib.genNodesMod.Property = js.native
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.get,
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  ): astDashTypesLib.genNodesMod.Property = js.native
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.init,
    key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  ): astDashTypesLib.genNodesMod.Property = js.native
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.init,
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  ): astDashTypesLib.genNodesMod.Property = js.native
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.set,
    key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  ): astDashTypesLib.genNodesMod.Property = js.native
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.set,
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  ): astDashTypesLib.genNodesMod.Property = js.native
  def from(params: astDashTypesLib.Anon_CommentsComputed): astDashTypesLib.genNodesMod.Property = js.native
}

