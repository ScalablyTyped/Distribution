package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPublishedSchemaArnsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The ARNs of published schemas.
    */
  var SchemaArns: js.UndefOr[Arns] = js.undefined
}

object ListPublishedSchemaArnsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SchemaArns: Arns = null): ListPublishedSchemaArnsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SchemaArns != null) __obj.updateDynamic("SchemaArns")(SchemaArns)
    __obj.asInstanceOf[ListPublishedSchemaArnsResponse]
  }
}

