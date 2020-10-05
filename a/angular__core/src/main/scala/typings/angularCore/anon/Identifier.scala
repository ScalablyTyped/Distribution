package typings.angularCore.anon

import typings.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifier extends js.Object {
  var identifier: typings.typescript.mod.Identifier = js.native
  var node: ClassDeclaration = js.native
}

object Identifier {
  @scala.inline
  def apply(identifier: typings.typescript.mod.Identifier, node: ClassDeclaration): Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  @scala.inline
  implicit class IdentifierOps[Self <: Identifier] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: typings.typescript.mod.Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ClassDeclaration): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

