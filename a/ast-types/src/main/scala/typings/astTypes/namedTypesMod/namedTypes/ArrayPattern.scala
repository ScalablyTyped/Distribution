package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait ArrayPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var elements: js.Array[PatternKind | SpreadElementKind | Null]
  var `type`: typings.astTypes.astTypesStrings.ArrayPattern
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ArrayPattern")
@js.native
object ArrayPattern extends TopLevel[Type[ArrayPattern]]

