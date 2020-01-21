package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.TypeParameterKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TypeParameterDeclaration
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var params: js.Array[TypeParameterKind]
  var `type`: typings.astTypes.astTypesStrings.TypeParameterDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TypeParameterDeclaration")
@js.native
object TypeParameterDeclaration extends TopLevel[Type[TypeParameterDeclaration]]

