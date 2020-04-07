package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEProvider
// see http://docs.angularjs.org/api/ng.$sceProvider
///////////////////////////////////////////////////////////////////////////
trait ISCEProvider extends IServiceProvider {
  def enabled(value: Boolean): Unit
}

object ISCEProvider {
  @scala.inline
  def apply($get: js.Any, enabled: Boolean => Unit): ISCEProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], enabled = js.Any.fromFunction1(enabled))
  
    __obj.asInstanceOf[ISCEProvider]
  }
}

