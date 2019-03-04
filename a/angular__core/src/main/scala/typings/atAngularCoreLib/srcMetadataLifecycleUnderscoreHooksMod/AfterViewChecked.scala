package typings
package atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterViewChecked extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed one change-check cycle
    * for a component's view.
    */
  def ngAfterViewChecked(): scala.Unit
}

object AfterViewChecked {
  @scala.inline
  def apply(ngAfterViewChecked: js.Function0[scala.Unit]): AfterViewChecked = {
    val __obj = js.Dynamic.literal(ngAfterViewChecked = ngAfterViewChecked)
  
    __obj.asInstanceOf[AfterViewChecked]
  }
}

