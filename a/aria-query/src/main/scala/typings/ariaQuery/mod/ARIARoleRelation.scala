package typings.ariaQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIARoleRelation extends js.Object {
  
  var concept: js.UndefOr[ARIARoleRelationConcept] = js.native
  
  var module: js.UndefOr[String] = js.native
}
object ARIARoleRelation {
  
  @scala.inline
  def apply(): ARIARoleRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARIARoleRelation]
  }
  
  @scala.inline
  implicit class ARIARoleRelationOps[Self <: ARIARoleRelation] (val x: Self) extends AnyVal {
    
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
    def setConcept(value: ARIARoleRelationConcept): Self = this.set("concept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcept: Self = this.set("concept", js.undefined)
    
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
  }
}
