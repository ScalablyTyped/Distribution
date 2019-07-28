package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListManagedSchemaArnsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The ARNs for all AWS managed schemas.
    */
  var SchemaArns: js.UndefOr[Arns] = js.undefined
}

object ListManagedSchemaArnsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SchemaArns: Arns = null): ListManagedSchemaArnsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SchemaArns != null) __obj.updateDynamic("SchemaArns")(SchemaArns)
    __obj.asInstanceOf[ListManagedSchemaArnsResponse]
  }
}

