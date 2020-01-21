package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsConstDeclare
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSEnumMemberKind
import typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSEnumDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, members: js.Array[TSEnumMemberKind]): TSEnumDeclaration = js.native
  def from(params: AnonCommentsConstDeclare): TSEnumDeclaration = js.native
}

