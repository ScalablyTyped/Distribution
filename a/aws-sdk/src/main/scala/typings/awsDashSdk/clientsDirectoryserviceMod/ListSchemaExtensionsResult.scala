package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaExtensionsResult extends js.Object {
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListSchemaExtensions to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.native
  /**
    * Information about the schema extensions applied to the directory.
    */
  var SchemaExtensionsInfo: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SchemaExtensionsInfo] = js.native
}

object ListSchemaExtensionsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, SchemaExtensionsInfo: SchemaExtensionsInfo = null): ListSchemaExtensionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaExtensionsInfo != null) __obj.updateDynamic("SchemaExtensionsInfo")(SchemaExtensionsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaExtensionsResult]
  }
}

