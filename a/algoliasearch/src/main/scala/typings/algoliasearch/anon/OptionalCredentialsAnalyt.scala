package typings.algoliasearch.anon

import typings.algoliasearch.algoliasearchStrings.de
import typings.algoliasearch.algoliasearchStrings.us
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined algoliasearch.algoliasearch/dist/algoliasearch.OptionalCredentials<@algolia/client-analytics.@algolia/client-analytics.AnalyticsClientOptions> */
@js.native
trait OptionalCredentialsAnalyt extends js.Object {
  
  var apiKey: js.UndefOr[String] = js.native
  
  var appId: js.UndefOr[String] = js.native
  
  var region: js.UndefOr[de | us] = js.native
}
object OptionalCredentialsAnalyt {
  
  @scala.inline
  def apply(): OptionalCredentialsAnalyt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalCredentialsAnalyt]
  }
  
  @scala.inline
  implicit class OptionalCredentialsAnalytOps[Self <: OptionalCredentialsAnalyt] (val x: Self) extends AnyVal {
    
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
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setRegion(value: de | us): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
