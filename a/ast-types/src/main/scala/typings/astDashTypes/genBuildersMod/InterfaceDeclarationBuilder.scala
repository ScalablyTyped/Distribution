package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsExtendsId
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.InterfaceExtendsKind
import typings.astDashTypes.genKindsMod.ObjectTypeAnnotationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceDeclaration = js.native
  def from(params: Anon_BodyCommentsExtendsId): InterfaceDeclaration = js.native
}

