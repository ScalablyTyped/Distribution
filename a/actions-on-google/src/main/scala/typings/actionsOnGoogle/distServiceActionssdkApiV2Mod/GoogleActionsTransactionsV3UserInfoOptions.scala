package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3UserInfoOptions extends StObject {
  
  /**
    * List of user info properties.
    */
  var userInfoProperties: js.UndefOr[js.Array[GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties]] = js.undefined
}
object GoogleActionsTransactionsV3UserInfoOptions {
  
  inline def apply(): GoogleActionsTransactionsV3UserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3UserInfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsTransactionsV3UserInfoOptions] (val x: Self) extends AnyVal {
    
    inline def setUserInfoProperties(value: js.Array[GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties]): Self = StObject.set(x, "userInfoProperties", value.asInstanceOf[js.Any])
    
    inline def setUserInfoPropertiesUndefined: Self = StObject.set(x, "userInfoProperties", js.undefined)
    
    inline def setUserInfoPropertiesVarargs(value: GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties*): Self = StObject.set(x, "userInfoProperties", js.Array(value*))
  }
}
