package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// SCEDelegateProvider
// see http://docs.angularjs.org/api/ng/provider/$sceDelegateProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEDelegateProvider
  extends StObject
     with IServiceProvider {
  
  def bannedResourceUrlList(): js.Array[Any] = js.native
  def bannedResourceUrlList(bannedList: js.Array[Any]): Unit = js.native
  
  /** @deprecated since 1.8.1 */
  def resourceUrlBlacklist(): js.Array[Any] = js.native
  /** @deprecated since 1.8.1 */
  def resourceUrlBlacklist(bannedList: js.Array[Any]): Unit = js.native
  
  /** @deprecated since 1.8.1 */
  def resourceUrlWhitelist(): js.Array[Any] = js.native
  /** @deprecated since 1.8.1 */
  def resourceUrlWhitelist(trustedList: js.Array[Any]): Unit = js.native
  
  def trustedResourceUrlList(): js.Array[Any] = js.native
  def trustedResourceUrlList(trustedList: js.Array[Any]): Unit = js.native
}
