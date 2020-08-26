package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableMetadataOutput extends js.Object {
  /**
    * An object that contains table metadata.
    */
  var TableMetadata: js.UndefOr[typings.awsSdk.athenaMod.TableMetadata] = js.native
}

object GetTableMetadataOutput {
  @scala.inline
  def apply(): GetTableMetadataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableMetadataOutput]
  }
  @scala.inline
  implicit class GetTableMetadataOutputOps[Self <: GetTableMetadataOutput] (val x: Self) extends AnyVal {
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
    def setTableMetadata(value: TableMetadata): Self = this.set("TableMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableMetadata: Self = this.set("TableMetadata", js.undefined)
  }
  
}

