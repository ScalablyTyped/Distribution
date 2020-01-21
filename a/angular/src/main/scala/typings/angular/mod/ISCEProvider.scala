package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEProvider
// see http://docs.angularjs.org/api/ng.$sceProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEProvider extends IServiceProvider {
  def enabled(value: Boolean): Unit = js.native
}

