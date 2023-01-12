package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMasterAccountResponse extends StObject {
  
  /**
    * The administrator account details.
    */
  var Master: typings.awsSdk.clientsGuarddutyMod.Master
}
object GetMasterAccountResponse {
  
  inline def apply(Master: Master): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal(Master = Master.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMasterAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setMaster(value: Master): Self = StObject.set(x, "Master", value.asInstanceOf[js.Any])
  }
}
