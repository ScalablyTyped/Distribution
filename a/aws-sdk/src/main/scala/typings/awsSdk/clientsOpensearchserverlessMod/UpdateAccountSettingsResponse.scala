package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountSettingsResponse extends StObject {
  
  /**
    * OpenSearch Serverless-related settings for the current Amazon Web Services account. 
    */
  var accountSettingsDetail: js.UndefOr[AccountSettingsDetail] = js.undefined
}
object UpdateAccountSettingsResponse {
  
  inline def apply(): UpdateAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAccountSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountSettingsDetail(value: AccountSettingsDetail): Self = StObject.set(x, "accountSettingsDetail", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsDetailUndefined: Self = StObject.set(x, "accountSettingsDetail", js.undefined)
  }
}
