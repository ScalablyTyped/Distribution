package typings
package atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterViewInit extends js.Object {
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of a component's view.
    * It is invoked only once when the view is instantiated.
    *
    */
  def ngAfterViewInit(): scala.Unit
}

object AfterViewInit {
  @scala.inline
  def apply(ngAfterViewInit: js.Function0[scala.Unit]): AfterViewInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngAfterViewInit")(ngAfterViewInit)
    __obj.asInstanceOf[AfterViewInit]
  }
}

