package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ClassPropertyDefinitionKind
import typings.astDashTypes.genKindsMod.ClassPropertyKind
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.MethodDefinitionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.VariableDeclaratorKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ClassPropertyDefinition
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind
  var `type`: typings.astDashTypes.astDashTypesStrings.ClassPropertyDefinition
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassPropertyDefinition")
@js.native
object ClassPropertyDefinition extends TopLevel[Type[ClassPropertyDefinition]]

