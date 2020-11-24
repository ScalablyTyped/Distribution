package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InforNexusConnectorProfileCredentials extends js.Object {
  
  /**
    *  The Access Key portion of the credentials. 
    */
  var accessKeyId: AccessKeyId = js.native
  
  /**
    *  The encryption keys used to encrypt data. 
    */
  var datakey: Key = js.native
  
  /**
    *  The secret key used to sign requests. 
    */
  var secretAccessKey: Key = js.native
  
  /**
    *  The identifier for the user. 
    */
  var userId: Username = js.native
}
object InforNexusConnectorProfileCredentials {
  
  @scala.inline
  def apply(accessKeyId: AccessKeyId, datakey: Key, secretAccessKey: Key, userId: Username): InforNexusConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], datakey = datakey.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InforNexusConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class InforNexusConnectorProfileCredentialsOps[Self <: InforNexusConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
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
    def setAccessKeyId(value: AccessKeyId): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatakey(value: Key): Self = this.set("datakey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretAccessKey(value: Key): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: Username): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
