package typings.angularCompiler.htmlWhitespacesMod

import typings.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiblingVisitorContext extends js.Object {
  
  var next: js.UndefOr[Node] = js.native
  
  var prev: js.UndefOr[Node] = js.native
}
object SiblingVisitorContext {
  
  @scala.inline
  def apply(): SiblingVisitorContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiblingVisitorContext]
  }
  
  @scala.inline
  implicit class SiblingVisitorContextOps[Self <: SiblingVisitorContext] (val x: Self) extends AnyVal {
    
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
    def setNext(value: Node): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrev(value: Node): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
  }
}
