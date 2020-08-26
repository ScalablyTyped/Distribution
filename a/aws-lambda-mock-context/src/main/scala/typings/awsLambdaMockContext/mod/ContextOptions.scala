package typings.awsLambdaMockContext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextOptions extends js.Object {
  var account: js.UndefOr[String] = js.native
  var alias: js.UndefOr[String] = js.native
  var functionName: js.UndefOr[String] = js.native
  var functionVersion: js.UndefOr[String] = js.native
  var memoryLimitInMB: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ContextOptions {
  @scala.inline
  def apply(): ContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextOptions]
  }
  @scala.inline
  implicit class ContextOptionsOps[Self <: ContextOptions] (val x: Self) extends AnyVal {
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    @scala.inline
    def setFunctionVersion(value: String): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionVersion: Self = this.set("functionVersion", js.undefined)
    @scala.inline
    def setMemoryLimitInMB(value: String): Self = this.set("memoryLimitInMB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryLimitInMB: Self = this.set("memoryLimitInMB", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

