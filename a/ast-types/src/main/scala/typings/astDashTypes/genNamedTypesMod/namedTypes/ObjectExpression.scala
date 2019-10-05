package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.ObjectMethodKind
import typings.astDashTypes.genKindsMod.ObjectPropertyKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.PropertyKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.genKindsMod.SpreadPropertyKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ObjectExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var properties: js.Array[
    PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
  ]
  var `type`: typings.astDashTypes.astDashTypesStrings.ObjectExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectExpression")
@js.native
object ObjectExpression extends TopLevel[Type[ObjectExpression]]

