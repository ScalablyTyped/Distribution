package typings.amazonProductApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICredentials extends js.Object {
  var awsId: String = js.native
  var awsSecret: String = js.native
  var awsTag: String = js.native
}

object ICredentials {
  @scala.inline
  def apply(awsId: String, awsSecret: String, awsTag: String): ICredentials = {
    val __obj = js.Dynamic.literal(awsId = awsId.asInstanceOf[js.Any], awsSecret = awsSecret.asInstanceOf[js.Any], awsTag = awsTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICredentials]
  }
  @scala.inline
  implicit class ICredentialsOps[Self <: ICredentials] (val x: Self) extends AnyVal {
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
    def setAwsId(value: String): Self = this.set("awsId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsSecret(value: String): Self = this.set("awsSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsTag(value: String): Self = this.set("awsTag", value.asInstanceOf[js.Any])
  }
  
}

