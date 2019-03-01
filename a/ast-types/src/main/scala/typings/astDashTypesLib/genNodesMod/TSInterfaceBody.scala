package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TSInterfaceBody
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var body: js.Array[
    astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSInterfaceBody
}

object TSInterfaceBody {
  @scala.inline
  def apply(
    body: js.Array[
      astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.TSInterfaceBody
  ): TSInterfaceBody = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[TSInterfaceBody]
  }
}

