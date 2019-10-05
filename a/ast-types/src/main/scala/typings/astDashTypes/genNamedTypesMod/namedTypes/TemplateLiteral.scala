package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TemplateElementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait TemplateLiteral
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var expressions: js.Array[ExpressionKind]
  var quasis: js.Array[TemplateElementKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TemplateLiteral
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TemplateLiteral")
@js.native
object TemplateLiteral extends TopLevel[Type[TemplateLiteral]]

