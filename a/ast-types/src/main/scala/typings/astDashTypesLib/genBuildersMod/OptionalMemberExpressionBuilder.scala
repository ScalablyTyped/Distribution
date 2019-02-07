package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalMemberExpressionBuilder extends js.Object {
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.OptionalMemberExpression = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.ExpressionKind,
    computed: scala.Boolean
  ): astDashTypesLib.genNodesMod.OptionalMemberExpression = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.ExpressionKind,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): astDashTypesLib.genNodesMod.OptionalMemberExpression = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNodesMod.OptionalMemberExpression = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.IdentifierKind,
    computed: scala.Boolean
  ): astDashTypesLib.genNodesMod.OptionalMemberExpression = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.IdentifierKind,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): astDashTypesLib.genNodesMod.OptionalMemberExpression = js.native
  def from(params: astDashTypesLib.Anon_CommentsComputedLocObjectOptional): astDashTypesLib.genNodesMod.OptionalMemberExpression = js.native
}

