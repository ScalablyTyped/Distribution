package typings.actionsOnGoogle.smarthomeSmarthomeMod

import typings.actionsOnGoogle.assistantMod.AppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeOptions extends AppOptions {
  
  /**
    * A JWT (JSON Web Token) that is able to access the home graph API.
    * This is used for report state. See https://jwt.io/. A JWT can be
    * created through the Google Cloud Console: https://console.cloud.google.com/apis/credentials
    * @public
    */
  var jwt: js.UndefOr[SmartHomeJwt] = js.native
  
  /**
    * An API key to use the home graph API. See
    * https://console.cloud.google.com/apis/api/homegraph.googleapis.com/overview
    * to learn more.
    * @public
    */
  var key: js.UndefOr[String] = js.native
}
object SmartHomeOptions {
  
  @scala.inline
  def apply(): SmartHomeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartHomeOptions]
  }
  
  @scala.inline
  implicit class SmartHomeOptionsOps[Self <: SmartHomeOptions] (val x: Self) extends AnyVal {
    
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
    def setJwt(value: SmartHomeJwt): Self = this.set("jwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwt: Self = this.set("jwt", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
