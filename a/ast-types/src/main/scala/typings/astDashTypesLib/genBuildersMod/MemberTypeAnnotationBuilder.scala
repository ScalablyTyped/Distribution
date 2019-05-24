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
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.MemberTypeAnnotation = js.native
  def apply(
    `object`: astDashTypesLib.genKindsMod.IdentifierKind,
    property: astDashTypesLib.genKindsMod.MemberTypeAnnotationKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.MemberTypeAnnotation = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocObject): astDashTypesLib.genNamedTypesMod.namedTypesNs.MemberTypeAnnotation = js.native
}

