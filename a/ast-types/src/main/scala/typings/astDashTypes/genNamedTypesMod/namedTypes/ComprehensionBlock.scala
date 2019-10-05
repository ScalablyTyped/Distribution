package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ComprehensionBlock
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var each: Boolean
  var left: PatternKind
  var right: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.ComprehensionBlock
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ComprehensionBlock")
@js.native
object ComprehensionBlock extends TopLevel[Type[ComprehensionBlock]]

