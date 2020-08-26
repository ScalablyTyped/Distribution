package typings.atlassianConnectJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  jql :string,   header :string,   descriptionText :string,   submitText :string,   cancelText :string}> */
@js.native
trait Partialjqlstringheaderstr extends js.Object {
  var cancelText: js.UndefOr[String] = js.native
  var descriptionText: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
  var jql: js.UndefOr[String] = js.native
  var submitText: js.UndefOr[String] = js.native
}

object Partialjqlstringheaderstr {
  @scala.inline
  def apply(): Partialjqlstringheaderstr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialjqlstringheaderstr]
  }
  @scala.inline
  implicit class PartialjqlstringheaderstrOps[Self <: Partialjqlstringheaderstr] (val x: Self) extends AnyVal {
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
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    @scala.inline
    def setDescriptionText(value: String): Self = this.set("descriptionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionText: Self = this.set("descriptionText", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setJql(value: String): Self = this.set("jql", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJql: Self = this.set("jql", js.undefined)
    @scala.inline
    def setSubmitText(value: String): Self = this.set("submitText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitText: Self = this.set("submitText", js.undefined)
  }
  
}

