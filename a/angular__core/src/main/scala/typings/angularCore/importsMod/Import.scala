package typings.angularCore.importsMod

import typings.typescript.mod.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import extends js.Object {
  var importModule: String
  var name: String
  var node: ImportDeclaration
}

object Import {
  @scala.inline
  def apply(importModule: String, name: String, node: ImportDeclaration): Import = {
    val __obj = js.Dynamic.literal(importModule = importModule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Import]
  }
}

