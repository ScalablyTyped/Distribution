package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentCommentsLocQualifier extends js.Object {
  var argument: astDashTypesLib.genKindsMod.StringLiteralKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var qualifier: js.UndefOr[
    astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  ] = js.undefined
  var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null] = js.undefined
}

object Anon_ArgumentCommentsLocQualifier {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.StringLiteralKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    qualifier: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind = null
  ): Anon_ArgumentCommentsLocQualifier = {
    val __obj = js.Dynamic.literal(argument = argument)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_ArgumentCommentsLocQualifier]
  }
}

