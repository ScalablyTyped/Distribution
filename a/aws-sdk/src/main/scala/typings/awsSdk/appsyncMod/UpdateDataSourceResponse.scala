package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceResponse extends js.Object {
  /**
    * The updated DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.native
}

object UpdateDataSourceResponse {
  @scala.inline
  def apply(): UpdateDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataSourceResponse]
  }
  @scala.inline
  implicit class UpdateDataSourceResponseOps[Self <: UpdateDataSourceResponse] (val x: Self) extends AnyVal {
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
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
  }
  
}

