package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalProvider extends IServiceProvider {
  /**
    * Default options all modals will use.
    */
  var options: IModalSettings
}

object IModalProvider {
  @scala.inline
  def apply($get: js.Any, options: IModalSettings): IModalProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IModalProvider]
  }
}

