package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSettingsResponse extends StObject {
  
  /**
    * OpenSearch Serverless-related details for the current account.
    */
  var accountSettingsDetail: js.UndefOr[AccountSettingsDetail] = js.undefined
}
object GetAccountSettingsResponse {
  
  inline def apply(): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountSettingsDetail(value: AccountSettingsDetail): Self = StObject.set(x, "accountSettingsDetail", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsDetailUndefined: Self = StObject.set(x, "accountSettingsDetail", js.undefined)
  }
}
