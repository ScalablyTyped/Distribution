package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynatraceConnectorProfileCredentials extends js.Object {
  
  /**
    *  The API tokens used by Dynatrace API to authenticate various API calls. 
    */
  var apiToken: ApiToken = js.native
}
object DynatraceConnectorProfileCredentials {
  
  @scala.inline
  def apply(apiToken: ApiToken): DynatraceConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(apiToken = apiToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynatraceConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class DynatraceConnectorProfileCredentialsOps[Self <: DynatraceConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiToken(value: ApiToken): Self = this.set("apiToken", value.asInstanceOf[js.Any])
  }
}
