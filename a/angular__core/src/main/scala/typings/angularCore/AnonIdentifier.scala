package typings.angularCore

import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentifier extends js.Object {
  var identifier: Identifier
  var node: ClassDeclaration
}

object AnonIdentifier {
  @scala.inline
  def apply(identifier: Identifier, node: ClassDeclaration): AnonIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdentifier]
  }
}

