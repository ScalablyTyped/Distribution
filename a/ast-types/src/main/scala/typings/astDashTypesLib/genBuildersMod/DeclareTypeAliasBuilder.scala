package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareTypeAliasBuilder extends js.Object {
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind,
    right: astDashTypesLib.genKindsMod.FlowTypeKind
  ): astDashTypesLib.genNodesMod.DeclareTypeAlias = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    typeParameters: scala.Null,
    right: astDashTypesLib.genKindsMod.FlowTypeKind
  ): astDashTypesLib.genNodesMod.DeclareTypeAlias = js.native
  def from(params: astDashTypesLib.Anon_CommentsIdLocRight): astDashTypesLib.genNodesMod.DeclareTypeAlias = js.native
}

