package typings.angularCore.queryDefinitionMod

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.PropertyDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgQueryDefinition extends js.Object {
  /** Class declaration that holds this query. */
  var container: ClassDeclaration = js.native
  /** Decorator that declares this as a query. */
  var decorator: NgDecorator = js.native
  /** Name of the query. Set to "null" in case the query name is not statically analyzable. */
  var name: String | Null = js.native
  /** Node that declares this query. */
  var node: Node = js.native
  /**
    * Property declaration that refers to the query value. For accessors there
    * is no property that is guaranteed to access the query value.
    */
  var property: PropertyDeclaration | Null = js.native
  /** Type of the query definition. */
  var `type`: QueryType = js.native
}

object NgQueryDefinition {
  @scala.inline
  def apply(container: ClassDeclaration, decorator: NgDecorator, node: Node, `type`: QueryType): NgQueryDefinition = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], decorator = decorator.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgQueryDefinition]
  }
  @scala.inline
  implicit class NgQueryDefinitionOps[Self <: NgQueryDefinition] (val x: Self) extends AnyVal {
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
    def setContainer(value: ClassDeclaration): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecorator(value: NgDecorator): Self = this.set("decorator", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: QueryType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setProperty(value: PropertyDeclaration): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyNull: Self = this.set("property", null)
  }
  
}

