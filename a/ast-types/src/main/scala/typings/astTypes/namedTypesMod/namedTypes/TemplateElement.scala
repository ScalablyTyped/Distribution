package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.AnonCooked
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TemplateElement
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var tail: Boolean
  var `type`: typings.astTypes.astTypesStrings.TemplateElement
  var value: AnonCooked
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TemplateElement")
@js.native
object TemplateElement extends TopLevel[Type[TemplateElement]]

