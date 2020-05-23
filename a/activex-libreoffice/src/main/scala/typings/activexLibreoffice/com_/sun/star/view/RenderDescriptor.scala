package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.com_.sun.star.awt.Size
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
    val __obj = js.Dynamic.literal(PageSize = PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderDescriptor]
  }
}

