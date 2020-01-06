package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAppliedSchemaArnsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
  /**
    * The ARNs of schemas that are applied to the directory.
    */
  var SchemaArns: js.UndefOr[Arns] = js.native
}

object ListAppliedSchemaArnsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SchemaArns: Arns = null): ListAppliedSchemaArnsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaArns != null) __obj.updateDynamic("SchemaArns")(SchemaArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppliedSchemaArnsResponse]
  }
}

