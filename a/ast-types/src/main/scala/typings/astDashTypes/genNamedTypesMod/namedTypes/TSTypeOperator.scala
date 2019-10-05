package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTypeOperator
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var operator: String
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeOperator
  var typeAnnotation: TSTypeKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeOperator")
@js.native
object TSTypeOperator extends TopLevel[Type[TSTypeOperator]]

