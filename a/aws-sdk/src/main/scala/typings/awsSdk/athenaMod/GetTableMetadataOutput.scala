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
  def apply(TableMetadata: TableMetadata = null): GetTableMetadataOutput = {
    val __obj = js.Dynamic.literal()
    if (TableMetadata != null) __obj.updateDynamic("TableMetadata")(TableMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableMetadataOutput]
  }
}

