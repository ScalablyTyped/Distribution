package typings
package angularDashBreadcrumbLib.angularDashBreadcrumbMod.angularMod.ncyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait $breadcrumbProvider extends js.Object {
  /**
    * Setter for options defined in a module.config block
    **/
  def setOptions(options: breadcrumbProviderOptions): scala.Unit
}

object $breadcrumbProvider {
  @scala.inline
  def apply(setOptions: js.Function1[breadcrumbProviderOptions, scala.Unit]): $breadcrumbProvider = {
    val __obj = js.Dynamic.literal(setOptions = setOptions)
  
    __obj.asInstanceOf[$breadcrumbProvider]
  }
}

