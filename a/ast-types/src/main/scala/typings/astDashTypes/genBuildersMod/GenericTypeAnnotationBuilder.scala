package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsIdLocTypeParameters
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.QualifiedTypeIdentifierKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.GenericTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTypeAnnotationBuilder extends js.Object {
  def apply(id: IdentifierKind): GenericTypeAnnotation = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifierKind): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def from(params: Anon_CommentsIdLocTypeParameters): GenericTypeAnnotation = js.native
}

