package typings.angularDashBreadcrumb.angularDashBreadcrumbMod.angularMod.ncy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait $breadcrumbProvider extends js.Object {
  /**
    * Setter for options defined in a module.config block
    **/
  def setOptions(options: breadcrumbProviderOptions): Unit
}

object $breadcrumbProvider {
  @scala.inline
  def apply(setOptions: breadcrumbProviderOptions => Unit): $breadcrumbProvider = {
    val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[$breadcrumbProvider]
  }
}

