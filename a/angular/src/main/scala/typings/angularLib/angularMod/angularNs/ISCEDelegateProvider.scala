package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEDelegateProvider
// see http://docs.angularjs.org/api/ng.$sceDelegateProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEDelegateProvider extends IServiceProvider {
  def resourceUrlBlacklist(): js.Array[_] = js.native
  def resourceUrlBlacklist(blacklist: js.Array[_]): scala.Unit = js.native
  def resourceUrlWhitelist(): js.Array[_] = js.native
  def resourceUrlWhitelist(whitelist: js.Array[_]): scala.Unit = js.native
}

