package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyPatternBuilder extends js.Object {
  def apply(
    key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind,
    pattern: astDashTypesLib.genKindsMod.PatternKind
  ): astDashTypesLib.genNodesMod.PropertyPattern = js.native
  def apply(key: astDashTypesLib.genKindsMod.ExpressionKind, pattern: astDashTypesLib.genKindsMod.PatternKind): astDashTypesLib.genNodesMod.PropertyPattern = js.native
  def from(params: astDashTypesLib.Anon_CommentsComputedKey): astDashTypesLib.genNodesMod.PropertyPattern = js.native
}

