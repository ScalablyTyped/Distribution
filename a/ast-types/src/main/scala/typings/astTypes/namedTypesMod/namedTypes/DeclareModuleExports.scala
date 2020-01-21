package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DeclareModuleExports
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `type`: typings.astTypes.astTypesStrings.DeclareModuleExports
  var typeAnnotation: TypeAnnotationKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareModuleExports")
@js.native
object DeclareModuleExports extends TopLevel[Type[DeclareModuleExports]]

