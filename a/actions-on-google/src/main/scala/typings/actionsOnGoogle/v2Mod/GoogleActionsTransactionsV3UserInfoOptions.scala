package typings.actionsOnGoogle.v2Mod

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
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3UserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3UserInfoOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3UserInfoOptionsMutableBuilder[Self <: GoogleActionsTransactionsV3UserInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserInfoProperties(value: js.Array[GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties]): Self = StObject.set(x, "userInfoProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoPropertiesUndefined: Self = StObject.set(x, "userInfoProperties", js.undefined)
    
    @scala.inline
    def setUserInfoPropertiesVarargs(value: GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties*): Self = StObject.set(x, "userInfoProperties", js.Array(value :_*))
  }
}
