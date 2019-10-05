package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait RestElement
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var argument: PatternKind
  var `type`: typings.astDashTypes.astDashTypesStrings.RestElement
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.RestElement")
@js.native
object RestElement extends TopLevel[Type[RestElement]]

