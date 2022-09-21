package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ARBGetSubscriptionListRequest")
@js.native
open class ARBGetSubscriptionListRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.ARBGetSubscriptionListRequest = js.native
  
  def getPaging(): Any = js.native
  
  def getSearchType(): Any = js.native
  
  def getSorting(): Any = js.native
  
  var paging: Any = js.native
  
  var searchType: Any = js.native
  
  def setPaging(p_paging: Any): Unit = js.native
  
  def setSearchType(p_searchType: Any): Unit = js.native
  
  def setSorting(p_sorting: Any): Unit = js.native
  
  var sorting: Any = js.native
}
