package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ClassBody
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: js.Array[
    astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind | astDashTypesLib.genKindsMod.ClassPrivatePropertyKind | astDashTypesLib.genKindsMod.ClassMethodKind | astDashTypesLib.genKindsMod.ClassPrivateMethodKind | astDashTypesLib.genKindsMod.TSDeclareMethodKind | astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ClassBody
}

object ClassBody {
  @scala.inline
  def apply(
    body: js.Array[
      astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind | astDashTypesLib.genKindsMod.ClassPrivatePropertyKind | astDashTypesLib.genKindsMod.ClassMethodKind | astDashTypesLib.genKindsMod.ClassPrivateMethodKind | astDashTypesLib.genKindsMod.TSDeclareMethodKind | astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.ClassBody
  ): ClassBody = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClassBody]
  }
}

