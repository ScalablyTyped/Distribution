package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsExtends
import typings.astDashTypes.genKindsMod.InterfaceExtendsKind
import typings.astDashTypes.genKindsMod.ObjectTypeAnnotationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceTypeAnnotationBuilder extends js.Object {
  def apply(body: ObjectTypeAnnotationKind): InterfaceTypeAnnotation = js.native
  def apply(body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceTypeAnnotation = js.native
  def from(params: Anon_BodyCommentsExtends): InterfaceTypeAnnotation = js.native
}

