package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.ObjectPropertyKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.PropertyKind
import typings.astTypes.kindsMod.PropertyPatternKind
import typings.astTypes.kindsMod.RestPropertyKind
import typings.astTypes.kindsMod.SpreadPropertyKind
import typings.astTypes.kindsMod.SpreadPropertyPatternKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.typesMod.Type
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
  var `type`: typings.astTypes.astTypesStrings.ObjectPattern
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectPattern")
@js.native
object ObjectPattern extends TopLevel[Type[ObjectPattern]]

