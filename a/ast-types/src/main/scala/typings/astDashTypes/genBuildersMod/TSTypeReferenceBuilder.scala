package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocTypeName
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeParameterInstantiationKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeReferenceBuilder extends js.Object {
  def apply(typeName: IdentifierKind): TSTypeReference = js.native
  def apply(typeName: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def from(params: Anon_CommentsLocTypeName): TSTypeReference = js.native
}

