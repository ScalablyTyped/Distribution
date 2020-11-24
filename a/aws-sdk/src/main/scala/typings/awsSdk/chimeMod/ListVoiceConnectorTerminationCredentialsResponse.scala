package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
  
  /**
    * A list of user names.
    */
  var Usernames: js.UndefOr[SensitiveStringList] = js.native
}
object ListVoiceConnectorTerminationCredentialsResponse {
  
  @scala.inline
  def apply(): ListVoiceConnectorTerminationCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
  }
  
  @scala.inline
  implicit class ListVoiceConnectorTerminationCredentialsResponseOps[Self <: ListVoiceConnectorTerminationCredentialsResponse] (val x: Self) extends AnyVal {
    
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
    def setUsernamesVarargs(value: SensitiveString*): Self = this.set("Usernames", js.Array(value :_*))
    
    @scala.inline
    def setUsernames(value: SensitiveStringList): Self = this.set("Usernames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernames: Self = this.set("Usernames", js.undefined)
  }
}
