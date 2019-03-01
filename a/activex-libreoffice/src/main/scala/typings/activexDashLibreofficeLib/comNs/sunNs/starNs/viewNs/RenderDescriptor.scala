package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the options for Render jobs.
  * @since OOo 1.1.2
  */
trait RenderDescriptor extends js.Object {
  /** specifies the page size for the current renderer. The unit of this page size is 1/100th mm. */
  var PageSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
}

object RenderDescriptor {
  @scala.inline
  def apply(PageSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size): RenderDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PageSize")(PageSize)
    __obj.asInstanceOf[RenderDescriptor]
  }
}

