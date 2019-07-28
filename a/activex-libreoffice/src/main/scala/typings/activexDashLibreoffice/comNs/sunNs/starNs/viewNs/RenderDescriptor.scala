package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the options for Render jobs.
  * @since OOo 1.1.2
  */
trait RenderDescriptor extends js.Object {
  /** specifies the page size for the current renderer. The unit of this page size is 1/100th mm. */
  var PageSize: Size
}

object RenderDescriptor {
  @scala.inline
  def apply(PageSize: Size): RenderDescriptor = {
    val __obj = js.Dynamic.literal(PageSize = PageSize)
  
    __obj.asInstanceOf[RenderDescriptor]
  }
}

