package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMasterAccountResponse extends StObject {
  
  /**
    * A list of details about the Security Hub administrator account for the current member account. 
    */
  var Master: js.UndefOr[Invitation] = js.undefined
}
object GetMasterAccountResponse {
  
  inline def apply(): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
  
  extension [Self <: GetMasterAccountResponse](x: Self) {
    
    inline def setMaster(value: Invitation): Self = StObject.set(x, "Master", value.asInstanceOf[js.Any])
    
    inline def setMasterUndefined: Self = StObject.set(x, "Master", js.undefined)
  }
}
