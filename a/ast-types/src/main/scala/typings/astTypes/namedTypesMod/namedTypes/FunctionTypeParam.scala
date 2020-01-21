package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait FunctionTypeParam
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var name: IdentifierKind
  var optional: Boolean
  var `type`: typings.astTypes.astTypesStrings.FunctionTypeParam
  var typeAnnotation: FlowTypeKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.FunctionTypeParam")
@js.native
object FunctionTypeParam extends TopLevel[Type[FunctionTypeParam]]

