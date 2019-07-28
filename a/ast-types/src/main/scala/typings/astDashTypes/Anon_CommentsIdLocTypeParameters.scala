package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.QualifiedTypeIdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdLocTypeParameters extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind | QualifiedTypeIdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var typeParameters: TypeParameterInstantiationKind | Null
}

object Anon_CommentsIdLocTypeParameters {
  @scala.inline
  def apply(
    id: IdentifierKind | QualifiedTypeIdentifierKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterInstantiationKind = null
  ): Anon_CommentsIdLocTypeParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsIdLocTypeParameters]
  }
}

