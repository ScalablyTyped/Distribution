package typings
package atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterContentChecked extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed checking all of the directive's
    * content.
    */
  def ngAfterContentChecked(): scala.Unit
}

object AfterContentChecked {
  @scala.inline
  def apply(ngAfterContentChecked: js.Function0[scala.Unit]): AfterContentChecked = {
    val __obj = js.Dynamic.literal(ngAfterContentChecked = ngAfterContentChecked)
  
    __obj.asInstanceOf[AfterContentChecked]
  }
}

