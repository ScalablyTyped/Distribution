package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNamedQueryOutput extends js.Object {
  /**
    * Information about the query.
    */
  var NamedQuery: js.UndefOr[typings.awsSdk.athenaMod.NamedQuery] = js.native
}

object GetNamedQueryOutput {
  @scala.inline
  def apply(): GetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamedQueryOutput]
  }
  @scala.inline
  implicit class GetNamedQueryOutputOps[Self <: GetNamedQueryOutput] (val x: Self) extends AnyVal {
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
    def setNamedQuery(value: NamedQuery): Self = this.set("NamedQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedQuery: Self = this.set("NamedQuery", js.undefined)
  }
  
}

