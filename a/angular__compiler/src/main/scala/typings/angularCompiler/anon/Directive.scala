package typings.angularCompiler.anon

import typings.angularCompiler.r3AstMod.Element
import typings.angularCompiler.r3AstMod.Template
import typings.angularCompiler.t2ApiMod.DirectiveMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directive[DirectiveT /* <: DirectiveMeta */] extends js.Object {
  
  var directive: DirectiveT = js.native
  
  var node: Element | Template = js.native
}
object Directive {
  
  @scala.inline
  def apply[DirectiveT /* <: DirectiveMeta */](directive: DirectiveT, node: Element | Template): Directive[DirectiveT] = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive[DirectiveT]]
  }
  
  @scala.inline
  implicit class DirectiveOps[Self <: Directive[_], DirectiveT /* <: DirectiveMeta */] (val x: Self with Directive[DirectiveT]) extends AnyVal {
    
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
    def setDirective(value: DirectiveT): Self = this.set("directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Element | Template): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
