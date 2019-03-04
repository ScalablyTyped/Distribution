package typings
package atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDestroy extends js.Object {
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  def ngOnDestroy(): scala.Unit
}

object OnDestroy {
  @scala.inline
  def apply(ngOnDestroy: js.Function0[scala.Unit]): OnDestroy = {
    val __obj = js.Dynamic.literal(ngOnDestroy = ngOnDestroy)
  
    __obj.asInstanceOf[OnDestroy]
  }
}

