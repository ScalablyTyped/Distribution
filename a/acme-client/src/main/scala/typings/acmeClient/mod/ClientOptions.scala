package typings.acmeClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var accountKey: PrivateKeyBuffer | PrivateKeyString = js.native
  var accountUrl: js.UndefOr[String] = js.native
  var backoffAttempts: js.UndefOr[Double] = js.native
  var backoffMax: js.UndefOr[Double] = js.native
  var backoffMin: js.UndefOr[Double] = js.native
  var directoryUrl: String = js.native
}

object ClientOptions {
  @scala.inline
  def apply(accountKey: PrivateKeyBuffer | PrivateKeyString, directoryUrl: String): ClientOptions = {
    val __obj = js.Dynamic.literal(accountKey = accountKey.asInstanceOf[js.Any], directoryUrl = directoryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def setAccountKey(value: PrivateKeyBuffer | PrivateKeyString): Self = this.set("accountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryUrl(value: String): Self = this.set("directoryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountUrl(value: String): Self = this.set("accountUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountUrl: Self = this.set("accountUrl", js.undefined)
    @scala.inline
    def setBackoffAttempts(value: Double): Self = this.set("backoffAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackoffAttempts: Self = this.set("backoffAttempts", js.undefined)
    @scala.inline
    def setBackoffMax(value: Double): Self = this.set("backoffMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackoffMax: Self = this.set("backoffMax", js.undefined)
    @scala.inline
    def setBackoffMin(value: Double): Self = this.set("backoffMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackoffMin: Self = this.set("backoffMin", js.undefined)
  }
  
}

