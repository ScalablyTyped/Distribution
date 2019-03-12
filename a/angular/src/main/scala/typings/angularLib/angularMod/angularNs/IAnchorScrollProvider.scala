package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnchorScrollProvider extends IServiceProvider {
  def disableAutoScrolling(): scala.Unit
}

object IAnchorScrollProvider {
  @scala.inline
  def apply($get: js.Any, disableAutoScrolling: () => scala.Unit): IAnchorScrollProvider = {
    val __obj = js.Dynamic.literal($get = $get, disableAutoScrolling = js.Any.fromFunction0(disableAutoScrolling))
  
    __obj.asInstanceOf[IAnchorScrollProvider]
  }
}

