package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBodyBuilder extends js.Object {
  def apply(
    body: js.Array[
      astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind | astDashTypesLib.genKindsMod.ClassPrivatePropertyKind | astDashTypesLib.genKindsMod.ClassMethodKind | astDashTypesLib.genKindsMod.ClassPrivateMethodKind | astDashTypesLib.genKindsMod.TSDeclareMethodKind | astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassBody = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsLocArray): astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassBody = js.native
}

