package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassExpressionBuilder extends js.Object {
  def apply(id: astDashTypesLib.genKindsMod.IdentifierKind, body: astDashTypesLib.genKindsMod.ClassBodyKind): astDashTypesLib.genNodesMod.ClassExpression = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    body: astDashTypesLib.genKindsMod.ClassBodyKind,
    superClass: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.ClassExpression = js.native
  def apply(id: js.UndefOr[scala.Nothing], body: astDashTypesLib.genKindsMod.ClassBodyKind): astDashTypesLib.genNodesMod.ClassExpression = js.native
  def apply(
    id: js.UndefOr[scala.Nothing],
    body: astDashTypesLib.genKindsMod.ClassBodyKind,
    superClass: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.ClassExpression = js.native
  def apply(id: scala.Null, body: astDashTypesLib.genKindsMod.ClassBodyKind): astDashTypesLib.genNodesMod.ClassExpression = js.native
  def apply(
    id: scala.Null,
    body: astDashTypesLib.genKindsMod.ClassBodyKind,
    superClass: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.ClassExpression = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsIdImplements): astDashTypesLib.genNodesMod.ClassExpression = js.native
}

