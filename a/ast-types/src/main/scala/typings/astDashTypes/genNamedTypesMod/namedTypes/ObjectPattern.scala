package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DecoratorKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.ObjectPropertyKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.PropertyKind
import typings.astDashTypes.genKindsMod.PropertyPatternKind
import typings.astDashTypes.genKindsMod.RestPropertyKind
import typings.astDashTypes.genKindsMod.SpreadPropertyKind
import typings.astDashTypes.genKindsMod.SpreadPropertyPatternKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait ObjectPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var properties: js.Array[
    PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
  ]
  var `type`: typings.astDashTypes.astDashTypesStrings.ObjectPattern
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectPattern")
@js.native
object ObjectPattern extends TopLevel[Type[ObjectPattern]]

