package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetAUJobDetailsRequest")
@js.native
open class GetAUJobDetailsRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.GetAUJobDetailsRequest = js.native
  
  def getModifiedTypeFilter(): Any = js.native
  
  def getMonth(): Any = js.native
  
  def getPaging(): Any = js.native
  
  var modifiedTypeFilter: Any = js.native
  
  var month: Any = js.native
  
  var paging: Any = js.native
  
  def setModifiedTypeFilter(p_modifiedTypeFilter: Any): Unit = js.native
  
  def setMonth(p_month: Any): Unit = js.native
  
  def setPaging(p_paging: Any): Unit = js.native
}
