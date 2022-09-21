package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.UpdateMerchantDetailsRequest")
@js.native
open class UpdateMerchantDetailsRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getIsTestMode(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.UpdateMerchantDetailsRequest = js.native
  
  var isTestMode: Any = js.native
  
  def setIsTestMode(p_isTestMode: Any): Unit = js.native
}
