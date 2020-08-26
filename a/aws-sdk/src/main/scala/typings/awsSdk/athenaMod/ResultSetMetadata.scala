package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetMetadata extends js.Object {
  /**
    * Information about the columns returned in a query result metadata.
    */
  var ColumnInfo: js.UndefOr[ColumnInfoList] = js.native
}

object ResultSetMetadata {
  @scala.inline
  def apply(): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetMetadata]
  }
  @scala.inline
  implicit class ResultSetMetadataOps[Self <: ResultSetMetadata] (val x: Self) extends AnyVal {
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
    def setColumnInfoVarargs(value: ColumnInfo*): Self = this.set("ColumnInfo", js.Array(value :_*))
    @scala.inline
    def setColumnInfo(value: ColumnInfoList): Self = this.set("ColumnInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnInfo: Self = this.set("ColumnInfo", js.undefined)
  }
  
}

