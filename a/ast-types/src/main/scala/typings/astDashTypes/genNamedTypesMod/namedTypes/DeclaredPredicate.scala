package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.FlowKind
import typings.astDashTypes.genKindsMod.FlowPredicateKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate[P]} */ trait DeclaredPredicate
  extends ASTNode
     with FlowKind
     with FlowPredicateKind
     with NodeKind
     with PrintableKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.DeclaredPredicate
  var value: ExpressionKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclaredPredicate")
@js.native
object DeclaredPredicate extends TopLevel[Type[DeclaredPredicate]]

