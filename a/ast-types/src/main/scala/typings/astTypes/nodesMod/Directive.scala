package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.DirectiveLiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Directive extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.Directive
  var value: DirectiveLiteralKind
}

object Directive {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.Directive, value: DirectiveLiteralKind): Directive = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
}

