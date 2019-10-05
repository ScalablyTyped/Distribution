package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.minus
import typings.astDashTypes.astDashTypesStrings.plus
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait Variance
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var kind: plus | minus
  var `type`: typings.astDashTypes.astDashTypesStrings.Variance
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Variance")
@js.native
object Variance extends TopLevel[Type[Variance]]

