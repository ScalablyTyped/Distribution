package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTypeAnnotationBuilder extends js.Object {
  def apply(id: astDashTypesLib.genKindsMod.IdentifierKind): astDashTypesLib.genNamedTypesMod.namedTypesNs.GenericTypeAnnotation = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.GenericTypeAnnotation = js.native
  def apply(id: astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind): astDashTypesLib.genNamedTypesMod.namedTypesNs.GenericTypeAnnotation = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.GenericTypeAnnotation = js.native
  def from(params: astDashTypesLib.Anon_CommentsIdLocTypeParameters): astDashTypesLib.genNamedTypesMod.namedTypesNs.GenericTypeAnnotation = js.native
}

