package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.com_.sun.star.awt.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the options for Render jobs.
  * @since OOo 1.1.2
  */
@js.native
trait RenderDescriptor extends js.Object {
  
  /** specifies the page size for the current renderer. The unit of this page size is 1/100th mm. */
  var PageSize: Size = js.native
}
object RenderDescriptor {
  
  @scala.inline
  def apply(PageSize: Size): RenderDescriptor = {
    val __obj = js.Dynamic.literal(PageSize = PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderDescriptor]
  }
  
  @scala.inline
  implicit class RenderDescriptorOps[Self <: RenderDescriptor] (val x: Self) extends AnyVal {
    
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
    def setPageSize(value: Size): Self = this.set("PageSize", value.asInstanceOf[js.Any])
  }
}
