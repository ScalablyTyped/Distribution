package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentCommentsLocQualifier extends js.Object {
  var argument: StringLiteralKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var qualifier: js.UndefOr[IdentifierKind | TSQualifiedNameKind] = js.undefined
  var typeParameters: js.UndefOr[TSTypeParameterInstantiationKind | Null] = js.undefined
}

object Anon_ArgumentCommentsLocQualifier {
  @scala.inline
  def apply(
    argument: StringLiteralKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    qualifier: IdentifierKind | TSQualifiedNameKind = null,
    typeParameters: TSTypeParameterInstantiationKind = null
  ): Anon_ArgumentCommentsLocQualifier = {
    val __obj = js.Dynamic.literal(argument = argument)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_ArgumentCommentsLocQualifier]
  }
}

