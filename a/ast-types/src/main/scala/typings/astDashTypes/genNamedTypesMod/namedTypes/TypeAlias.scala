package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TypeAliasKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TypeAlias
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TypeAliasKind {
  var id: IdentifierKind
  var right: FlowTypeKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TypeAlias
  var typeParameters: TypeParameterDeclarationKind | Null
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TypeAlias")
@js.native
object TypeAlias extends TopLevel[Type[TypeAlias]]

