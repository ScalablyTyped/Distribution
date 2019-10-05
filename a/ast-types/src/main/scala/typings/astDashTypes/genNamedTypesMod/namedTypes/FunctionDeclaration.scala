package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.FunctionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'id'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait FunctionDeclaration
  extends ASTNode
     with DeclarationKind
     with FunctionKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var id: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.FunctionDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.FunctionDeclaration")
@js.native
object FunctionDeclaration extends TopLevel[Type[FunctionDeclaration]]

