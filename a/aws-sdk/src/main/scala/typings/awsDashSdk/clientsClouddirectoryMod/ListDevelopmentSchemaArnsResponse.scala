package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevelopmentSchemaArnsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The ARNs of retrieved development schemas.
    */
  var SchemaArns: js.UndefOr[Arns] = js.undefined
}

object ListDevelopmentSchemaArnsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SchemaArns: Arns = null): ListDevelopmentSchemaArnsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SchemaArns != null) __obj.updateDynamic("SchemaArns")(SchemaArns)
    __obj.asInstanceOf[ListDevelopmentSchemaArnsResponse]
  }
}

