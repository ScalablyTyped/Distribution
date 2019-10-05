package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocObject
import typings.astDashTypes.genKindsMod.GenericTypeAnnotationKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.MemberTypeAnnotationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.MemberTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberTypeAnnotationBuilder extends js.Object {
  def apply(`object`: IdentifierKind, property: GenericTypeAnnotationKind): MemberTypeAnnotation = js.native
  def apply(`object`: IdentifierKind, property: MemberTypeAnnotationKind): MemberTypeAnnotation = js.native
  def from(params: Anon_CommentsLocObject): MemberTypeAnnotation = js.native
}

