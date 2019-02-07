package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberTypeAnnotationBuilder extends js.Object {
  def apply(
    `object`: astDashTypesLib.genKindsMod.IdentifierKind,
    property: astDashTypesLib.genKindsMod.GenericTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.MemberTypeAnnotation = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.IdentifierKind,
    property: astDashTypesLib.genKindsMod.MemberTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.MemberTypeAnnotation = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocObject): astDashTypesLib.genNodesMod.MemberTypeAnnotation = js.native
}

