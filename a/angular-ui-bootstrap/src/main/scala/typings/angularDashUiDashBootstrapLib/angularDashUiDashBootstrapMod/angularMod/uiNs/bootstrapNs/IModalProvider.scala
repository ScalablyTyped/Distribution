package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
    * Default options all modals will use.
    */
  var options: IModalSettings
}

object IModalProvider {
  @scala.inline
  def apply($get: js.Any, options: IModalSettings): IModalProvider = {
    val __obj = js.Dynamic.literal($get = $get, options = options)
  
    __obj.asInstanceOf[IModalProvider]
  }
}

