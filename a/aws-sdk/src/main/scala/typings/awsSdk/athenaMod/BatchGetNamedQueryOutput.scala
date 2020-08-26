package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetNamedQueryOutput extends js.Object {
  /**
    * Information about the named query IDs submitted.
    */
  var NamedQueries: js.UndefOr[NamedQueryList] = js.native
  /**
    * Information about provided query IDs.
    */
  var UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.native
}

object BatchGetNamedQueryOutput {
  @scala.inline
  def apply(): BatchGetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetNamedQueryOutput]
  }
  @scala.inline
  implicit class BatchGetNamedQueryOutputOps[Self <: BatchGetNamedQueryOutput] (val x: Self) extends AnyVal {
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
    def setNamedQueriesVarargs(value: NamedQuery*): Self = this.set("NamedQueries", js.Array(value :_*))
    @scala.inline
    def setNamedQueries(value: NamedQueryList): Self = this.set("NamedQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedQueries: Self = this.set("NamedQueries", js.undefined)
    @scala.inline
    def setUnprocessedNamedQueryIdsVarargs(value: UnprocessedNamedQueryId*): Self = this.set("UnprocessedNamedQueryIds", js.Array(value :_*))
    @scala.inline
    def setUnprocessedNamedQueryIds(value: UnprocessedNamedQueryIdList): Self = this.set("UnprocessedNamedQueryIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedNamedQueryIds: Self = this.set("UnprocessedNamedQueryIds", js.undefined)
  }
  
}

