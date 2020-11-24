package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgiliteConfig extends js.Object {
  
  var apiKey: js.UndefOr[String] = js.native
  
  var apiServerUrl: js.UndefOr[String] = js.native
  
  var teamId: js.UndefOr[String] = js.native
}
object AgiliteConfig {
  
  @scala.inline
  def apply(): AgiliteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgiliteConfig]
  }
  
  @scala.inline
  implicit class AgiliteConfigOps[Self <: AgiliteConfig] (val x: Self) extends AnyVal {
    
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
    def setApiServerUrl(value: String): Self = this.set("apiServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiServerUrl: Self = this.set("apiServerUrl", js.undefined)
    
    @scala.inline
    def setTeamId(value: String): Self = this.set("teamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamId: Self = this.set("teamId", js.undefined)
  }
}
