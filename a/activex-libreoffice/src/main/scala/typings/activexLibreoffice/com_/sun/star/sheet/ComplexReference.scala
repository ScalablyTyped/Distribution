package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a reference to a cell range. */
@js.native
trait ComplexReference extends js.Object {
  
  /** is the first reference. */
  var Reference1: SingleReference = js.native
  
  /** is the second reference. */
  var Reference2: SingleReference = js.native
}
object ComplexReference {
  
  @scala.inline
  def apply(Reference1: SingleReference, Reference2: SingleReference): ComplexReference = {
    val __obj = js.Dynamic.literal(Reference1 = Reference1.asInstanceOf[js.Any], Reference2 = Reference2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexReference]
  }
  
  @scala.inline
  implicit class ComplexReferenceOps[Self <: ComplexReference] (val x: Self) extends AnyVal {
    
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
    def setReference1(value: SingleReference): Self = this.set("Reference1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference2(value: SingleReference): Self = this.set("Reference2", value.asInstanceOf[js.Any])
  }
}
