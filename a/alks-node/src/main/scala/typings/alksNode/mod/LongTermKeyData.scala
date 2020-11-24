package typings.alksNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongTermKeyData extends js.Object {
  
  var accessKey: String = js.native
  
  var alksAccount: String = js.native
  
  var alksRole: String = js.native
  
  var iamUserArn: String = js.native
  
  var iamUserName: String = js.native
  
  var secretKey: String = js.native
}
object LongTermKeyData {
  
  @scala.inline
  def apply(
    accessKey: String,
    alksAccount: String,
    alksRole: String,
    iamUserArn: String,
    iamUserName: String,
    secretKey: String
  ): LongTermKeyData = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], iamUserArn = iamUserArn.asInstanceOf[js.Any], iamUserName = iamUserName.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongTermKeyData]
  }
  
  @scala.inline
  implicit class LongTermKeyDataOps[Self <: LongTermKeyData] (val x: Self) extends AnyVal {
    
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlksAccount(value: String): Self = this.set("alksAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlksRole(value: String): Self = this.set("alksRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserArn(value: String): Self = this.set("iamUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserName(value: String): Self = this.set("iamUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
  }
}
