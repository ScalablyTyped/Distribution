package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalProvider extends IServiceProvider {
  /**
    * Default options all modals will use.
    */
  var options: typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalSettings
}

object IModalProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    options: typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalSettings
  ): IModalProvider = {
    val __obj = js.Dynamic.literal($get = $get, options = options)
  
    __obj.asInstanceOf[IModalProvider]
  }
}

