package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchemaExtensionsResult extends js.Object {
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListSchemaExtensions to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information about the schema extensions applied to the directory.
    */
  var SchemaExtensionsInfo: js.UndefOr[SchemaExtensionsInfo] = js.undefined
}

object ListSchemaExtensionsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, SchemaExtensionsInfo: SchemaExtensionsInfo = null): ListSchemaExtensionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SchemaExtensionsInfo != null) __obj.updateDynamic("SchemaExtensionsInfo")(SchemaExtensionsInfo)
    __obj.asInstanceOf[ListSchemaExtensionsResult]
  }
}

