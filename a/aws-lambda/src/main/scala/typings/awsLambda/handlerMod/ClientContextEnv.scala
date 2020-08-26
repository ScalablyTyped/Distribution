package typings.awsLambda.handlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientContextEnv extends js.Object {
  var locale: String = js.native
  var make: String = js.native
  var model: String = js.native
  var platform: String = js.native
  var platformVersion: String = js.native
}

object ClientContextEnv {
  @scala.inline
  def apply(locale: String, make: String, model: String, platform: String, platformVersion: String): ClientContextEnv = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContextEnv]
  }
  @scala.inline
  implicit class ClientContextEnvOps[Self <: ClientContextEnv] (val x: Self) extends AnyVal {
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMake(value: String): Self = this.set("make", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
  }
  
}

