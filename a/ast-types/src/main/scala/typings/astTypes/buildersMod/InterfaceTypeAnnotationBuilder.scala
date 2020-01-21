package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsExtends
import typings.astTypes.kindsMod.InterfaceExtendsKind
import typings.astTypes.kindsMod.ObjectTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceTypeAnnotationBuilder extends js.Object {
  def apply(body: ObjectTypeAnnotationKind): InterfaceTypeAnnotation = js.native
  def apply(body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceTypeAnnotation = js.native
  def from(params: AnonBodyCommentsExtends): InterfaceTypeAnnotation = js.native
}

