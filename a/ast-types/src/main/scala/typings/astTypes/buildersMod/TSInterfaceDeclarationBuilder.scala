package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsDeclareExtends
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSInterfaceBodyKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInterfaceDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def from(params: AnonBodyCommentsDeclareExtends): TSInterfaceDeclaration = js.native
}

