package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnchorScrollProvider extends IServiceProvider {
  def disableAutoScrolling(): Unit
}

object IAnchorScrollProvider {
  @scala.inline
  def apply($get: js.Any, disableAutoScrolling: () => Unit): IAnchorScrollProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], disableAutoScrolling = js.Any.fromFunction0(disableAutoScrolling))
  
    __obj.asInstanceOf[IAnchorScrollProvider]
  }
}

