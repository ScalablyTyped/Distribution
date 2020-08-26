package typings.angularCore.importsMod

import typings.typescript.mod.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Import extends js.Object {
  var importModule: String = js.native
  var name: String = js.native
  var node: ImportDeclaration = js.native
}

object Import {
  @scala.inline
  def apply(importModule: String, name: String, node: ImportDeclaration): Import = {
    val __obj = js.Dynamic.literal(importModule = importModule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  @scala.inline
  implicit class ImportOps[Self <: Import] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImportModule(value: String): Self = this.set("importModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ImportDeclaration): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

