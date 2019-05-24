package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeLiteralBuilder extends js.Object {
  def apply(
    members: js.Array[
      astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeLiteral = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocMembers): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeLiteral = js.native
}

