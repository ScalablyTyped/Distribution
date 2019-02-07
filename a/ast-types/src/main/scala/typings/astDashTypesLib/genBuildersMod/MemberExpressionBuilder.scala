package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberExpressionBuilder extends js.Object {
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.MemberExpression = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.ExpressionKind,
    computed: scala.Boolean
  ): astDashTypesLib.genNodesMod.MemberExpression = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNodesMod.MemberExpression = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.IdentifierKind,
    computed: scala.Boolean
  ): astDashTypesLib.genNodesMod.MemberExpression = js.native
  def from(params: astDashTypesLib.Anon_CommentsComputedLoc): astDashTypesLib.genNodesMod.MemberExpression = js.native
}

