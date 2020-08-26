package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetNamedQueryInput extends js.Object {
  /**
    * An array of query IDs.
    */
  var NamedQueryIds: NamedQueryIdList = js.native
}

object BatchGetNamedQueryInput {
  @scala.inline
  def apply(NamedQueryIds: NamedQueryIdList): BatchGetNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryIds = NamedQueryIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetNamedQueryInput]
  }
  @scala.inline
  implicit class BatchGetNamedQueryInputOps[Self <: BatchGetNamedQueryInput] (val x: Self) extends AnyVal {
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
    def setNamedQueryIdsVarargs(value: NamedQueryId*): Self = this.set("NamedQueryIds", js.Array(value :_*))
    @scala.inline
    def setNamedQueryIds(value: NamedQueryIdList): Self = this.set("NamedQueryIds", value.asInstanceOf[js.Any])
  }
  
}

