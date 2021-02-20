package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.com_.sun.star.awt.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the options for Render jobs.
  * @since OOo 1.1.2
  */
@js.native
trait RenderDescriptor extends StObject {
  
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
  implicit class RenderDescriptorMutableBuilder[Self <: RenderDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageSize(value: Size): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
  }
}
