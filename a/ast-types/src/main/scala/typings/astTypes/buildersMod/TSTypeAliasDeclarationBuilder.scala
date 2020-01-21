package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsDeclare
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAliasDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, typeAnnotation: TSTypeKind): TSTypeAliasDeclaration = js.native
  def from(params: AnonCommentsDeclare): TSTypeAliasDeclaration = js.native
}

