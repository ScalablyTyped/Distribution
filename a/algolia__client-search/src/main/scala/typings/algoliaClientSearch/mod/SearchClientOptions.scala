package typings.algoliaClientSearch.mod

import typings.algoliaClientCommon.mod.AuthModeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchClientOptions extends js.Object {
  
  /**
    * The api key.
    */
  val apiKey: String = js.native
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  /**
    * The auth mode type. In browser environments credentials may
    * be passed within the headers.
    */
  val authMode: js.UndefOr[AuthModeType] = js.native
}
object SearchClientOptions {
  
  @scala.inline
  def apply(apiKey: String, appId: String): SearchClientOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchClientOptions]
  }
  
  @scala.inline
  implicit class SearchClientOptionsOps[Self <: SearchClientOptions] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthMode(value: AuthModeType): Self = this.set("authMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthMode: Self = this.set("authMode", js.undefined)
  }
}
