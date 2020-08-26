package typings.asyncblock.ab.ab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOptions extends js.Object {
  var dontWait: js.UndefOr[Boolean] = js.native
  var firstArgIsError: js.UndefOr[Boolean] = js.native
  var ignoreError: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[js.Any] = js.native
  var responseFormat: js.UndefOr[js.Array[String]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var timeoutIsError: js.UndefOr[Boolean] = js.native
}

object TaskOptions {
  @scala.inline
  def apply(): TaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOptions]
  }
  @scala.inline
  implicit class TaskOptionsOps[Self <: TaskOptions] (val x: Self) extends AnyVal {
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
    def setDontWait(value: Boolean): Self = this.set("dontWait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontWait: Self = this.set("dontWait", js.undefined)
    @scala.inline
    def setFirstArgIsError(value: Boolean): Self = this.set("firstArgIsError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstArgIsError: Self = this.set("firstArgIsError", js.undefined)
    @scala.inline
    def setIgnoreError(value: Boolean): Self = this.set("ignoreError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreError: Self = this.set("ignoreError", js.undefined)
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setResponseFormatVarargs(value: String*): Self = this.set("responseFormat", js.Array(value :_*))
    @scala.inline
    def setResponseFormat(value: js.Array[String]): Self = this.set("responseFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseFormat: Self = this.set("responseFormat", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTimeoutIsError(value: Boolean): Self = this.set("timeoutIsError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutIsError: Self = this.set("timeoutIsError", js.undefined)
  }
  
}

