package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the visibility state of a property.
  * @since OOo 2.0
  */
@js.native
trait Visibility extends js.Object {
  
  /** `TRUE` if the property is visible otherwise `FALSE` . */
  var bVisible: Boolean = js.native
}
object Visibility {
  
  @scala.inline
  def apply(bVisible: Boolean): Visibility = {
    val __obj = js.Dynamic.literal(bVisible = bVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibility]
  }
  
  @scala.inline
  implicit class VisibilityOps[Self <: Visibility] (val x: Self) extends AnyVal {
    
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
    def setBVisible(value: Boolean): Self = this.set("bVisible", value.asInstanceOf[js.Any])
  }
}
