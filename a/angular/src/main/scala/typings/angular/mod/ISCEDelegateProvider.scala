package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// SCEDelegateProvider
// see http://docs.angularjs.org/api/ng/provider/$sceDelegateProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEDelegateProvider extends IServiceProvider {
  
  def bannedResourceUrlList(): js.Array[_] = js.native
  def bannedResourceUrlList(bannedList: js.Array[_]): Unit = js.native
  
  def resourceUrlBlacklist(): js.Array[_] = js.native
  def resourceUrlBlacklist(bannedList: js.Array[_]): Unit = js.native
  
  def resourceUrlWhitelist(): js.Array[_] = js.native
  def resourceUrlWhitelist(trustedList: js.Array[_]): Unit = js.native
  
  def trustedResourceUrlList(): js.Array[_] = js.native
  def trustedResourceUrlList(trustedList: js.Array[_]): Unit = js.native
}
