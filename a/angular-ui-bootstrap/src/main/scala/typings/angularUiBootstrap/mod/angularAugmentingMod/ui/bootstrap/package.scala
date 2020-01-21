package typings.angularUiBootstrap.mod.angularAugmentingMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bootstrap {
  type DatepickerCallback[T] = js.Function1[
    /* args */ typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap.IDatepickerCellArgs, 
    T
  ]
  /**
    * @deprecated use IModalInstanceService instead.
    */
  type IModalServiceInstance = typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap.IModalInstanceService
}
