package typings.angularCore.definitionCollectorMod

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedNgModule extends js.Object {
  
  var decorator: NgDecorator = js.native
  
  var name: String = js.native
  
  var node: ClassDeclaration = js.native
  
  var providersExpr: Expression | Null = js.native
}
object ResolvedNgModule {
  
  @scala.inline
  def apply(decorator: NgDecorator, name: String, node: ClassDeclaration): ResolvedNgModule = {
    val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNgModule]
  }
  
  @scala.inline
  implicit class ResolvedNgModuleOps[Self <: ResolvedNgModule] (val x: Self) extends AnyVal {
    
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
    def setDecorator(value: NgDecorator): Self = this.set("decorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ClassDeclaration): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersExpr(value: Expression): Self = this.set("providersExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersExprNull: Self = this.set("providersExpr", null)
  }
}
