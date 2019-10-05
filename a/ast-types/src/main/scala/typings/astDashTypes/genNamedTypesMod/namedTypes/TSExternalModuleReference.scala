package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSExternalModuleReference
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var expression: StringLiteralKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSExternalModuleReference
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSExternalModuleReference")
@js.native
object TSExternalModuleReference extends TopLevel[Type[TSExternalModuleReference]]

