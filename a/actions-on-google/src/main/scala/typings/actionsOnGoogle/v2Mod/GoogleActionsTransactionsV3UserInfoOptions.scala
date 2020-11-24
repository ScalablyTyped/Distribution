package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3UserInfoOptions extends js.Object {
  
  /**
    * List of user info properties.
    */
  var userInfoProperties: js.UndefOr[js.Array[GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties]] = js.native
}
object GoogleActionsTransactionsV3UserInfoOptions {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3UserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3UserInfoOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3UserInfoOptionsOps[Self <: GoogleActionsTransactionsV3UserInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUserInfoPropertiesVarargs(value: GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties*): Self = this.set("userInfoProperties", js.Array(value :_*))
    
    @scala.inline
    def setUserInfoProperties(value: js.Array[GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties]): Self = this.set("userInfoProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserInfoProperties: Self = this.set("userInfoProperties", js.undefined)
  }
}
