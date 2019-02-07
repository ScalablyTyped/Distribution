package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPropertyBuilder extends js.Object {
  def apply(
    key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  ): astDashTypesLib.genNodesMod.ObjectProperty = js.native
  def apply(
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  ): astDashTypesLib.genNodesMod.ObjectProperty = js.native
  def from(params: astDashTypesLib.Anon_Accessibility): astDashTypesLib.genNodesMod.ObjectProperty = js.native
}

