package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsExtendsId
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.InterfaceExtendsKind
import typings.astTypes.kindsMod.ObjectTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceDeclaration = js.native
  def from(params: AnonBodyCommentsExtendsId): InterfaceDeclaration = js.native
}

