package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEDelegateProvider
// see http://docs.angularjs.org/api/ng/provider/$sceDelegateProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEDelegateProvider extends IServiceProvider {
  def resourceUrlBlacklist(): js.Array[_] = js.native
  def resourceUrlBlacklist(blacklist: js.Array[_]): Unit = js.native
  def resourceUrlWhitelist(): js.Array[_] = js.native
  def resourceUrlWhitelist(whitelist: js.Array[_]): Unit = js.native
}

