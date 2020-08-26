package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNamedQueryInput extends js.Object {
  /**
    * The unique ID of the query to delete.
    */
  var NamedQueryId: typings.awsSdk.athenaMod.NamedQueryId = js.native
}

object DeleteNamedQueryInput {
  @scala.inline
  def apply(NamedQueryId: NamedQueryId): DeleteNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryId = NamedQueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamedQueryInput]
  }
  @scala.inline
  implicit class DeleteNamedQueryInputOps[Self <: DeleteNamedQueryInput] (val x: Self) extends AnyVal {
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
    def setNamedQueryId(value: NamedQueryId): Self = this.set("NamedQueryId", value.asInstanceOf[js.Any])
  }
  
}

