package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ClassMethodKind
import typings.astDashTypes.genKindsMod.ClassPrivateMethodKind
import typings.astDashTypes.genKindsMod.ClassPrivatePropertyKind
import typings.astDashTypes.genKindsMod.ClassPropertyDefinitionKind
import typings.astDashTypes.genKindsMod.ClassPropertyKind
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.MethodDefinitionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSDeclareMethodKind
import typings.astDashTypes.genKindsMod.TSIndexSignatureKind
import typings.astDashTypes.genKindsMod.TSMethodSignatureKind
import typings.astDashTypes.genKindsMod.TSPropertySignatureKind
import typings.astDashTypes.genKindsMod.VariableDeclaratorKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ClassBody
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: js.Array[
    MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var `type`: typings.astDashTypes.astDashTypesStrings.ClassBody
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassBody")
@js.native
object ClassBody extends TopLevel[Type[ClassBody]]

