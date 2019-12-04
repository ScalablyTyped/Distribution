package typings.atAngularCore.schematicsUtilsNgUnderscoreDecoratorsMod

import typings.typescript.typescriptMod.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgDecorator extends js.Object {
  var importNode: ImportDeclaration
  var name: String
  var node: CallExpressionDecorator
}

object NgDecorator {
  @scala.inline
  def apply(importNode: ImportDeclaration, name: String, node: CallExpressionDecorator): NgDecorator = {
    val __obj = js.Dynamic.literal(importNode = importNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NgDecorator]
  }
}

