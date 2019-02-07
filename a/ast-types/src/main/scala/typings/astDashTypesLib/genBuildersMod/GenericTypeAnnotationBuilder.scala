package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTypeAnnotationBuilder extends js.Object {
  def apply(id: astDashTypesLib.genKindsMod.IdentifierKind): astDashTypesLib.genNodesMod.GenericTypeAnnotation = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind
  ): astDashTypesLib.genNodesMod.GenericTypeAnnotation = js.native
  def apply(id: astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind): astDashTypesLib.genNodesMod.GenericTypeAnnotation = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind
  ): astDashTypesLib.genNodesMod.GenericTypeAnnotation = js.native
  def from(params: astDashTypesLib.Anon_CommentsIdLocTypeParameters): astDashTypesLib.genNodesMod.GenericTypeAnnotation = js.native
}

