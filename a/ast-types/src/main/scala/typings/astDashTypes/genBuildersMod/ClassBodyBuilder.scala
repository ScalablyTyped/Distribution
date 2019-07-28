package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsLocArray
import typings.astDashTypes.genKindsMod.ClassMethodKind
import typings.astDashTypes.genKindsMod.ClassPrivateMethodKind
import typings.astDashTypes.genKindsMod.ClassPrivatePropertyKind
import typings.astDashTypes.genKindsMod.ClassPropertyDefinitionKind
import typings.astDashTypes.genKindsMod.ClassPropertyKind
import typings.astDashTypes.genKindsMod.MethodDefinitionKind
import typings.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSDeclareMethodKind
import typings.astDashTypes.genKindsMod.TSIndexSignatureKind
import typings.astDashTypes.genKindsMod.TSMethodSignatureKind
import typings.astDashTypes.genKindsMod.TSPropertySignatureKind
import typings.astDashTypes.genKindsMod.VariableDeclaratorKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ClassBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBodyBuilder extends js.Object {
  def apply(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): ClassBody = js.native
  def from(params: Anon_BodyCommentsLocArray): ClassBody = js.native
}

