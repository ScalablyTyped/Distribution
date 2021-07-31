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
  
  def bannedResourceUrlList(): js.Array[js.Any] = js.native
  def bannedResourceUrlList(bannedList: js.Array[js.Any]): Unit = js.native
  
  def resourceUrlBlacklist(): js.Array[js.Any] = js.native
  def resourceUrlBlacklist(bannedList: js.Array[js.Any]): Unit = js.native
  
  def resourceUrlWhitelist(): js.Array[js.Any] = js.native
  def resourceUrlWhitelist(trustedList: js.Array[js.Any]): Unit = js.native
  
  def trustedResourceUrlList(): js.Array[js.Any] = js.native
  def trustedResourceUrlList(trustedList: js.Array[js.Any]): Unit = js.native
}
