package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.FlowKind
import typings.astTypes.kindsMod.FlowPredicateKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate[P]} */ trait InferredPredicate
  extends ASTNode
     with FlowKind
     with FlowPredicateKind
     with NodeKind
     with PrintableKind {
  var `type`: typings.astTypes.astTypesStrings.InferredPredicate
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.InferredPredicate")
@js.native
object InferredPredicate extends TopLevel[Type[InferredPredicate]]

