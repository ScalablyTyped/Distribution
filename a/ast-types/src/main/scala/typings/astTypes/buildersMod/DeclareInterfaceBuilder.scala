package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsExtendsId
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.InterfaceExtendsKind
import typings.astTypes.kindsMod.ObjectTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareInterfaceBuilder extends js.Object {
  def apply(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): DeclareInterface = js.native
  def from(params: AnonBodyCommentsExtendsId): DeclareInterface = js.native
}

