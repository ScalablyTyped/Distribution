package typings.angularCore.anon

import typings.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier extends js.Object {
  var identifier: typings.typescript.mod.Identifier
  var node: ClassDeclaration
}

object Identifier {
  @scala.inline
  def apply(identifier: typings.typescript.mod.Identifier, node: ClassDeclaration): Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

