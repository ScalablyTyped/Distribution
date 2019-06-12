package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchemasResponse extends js.Object {
  /**
    * A token used to get the next set of schemas (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of schemas.
    */
  var schemas: js.UndefOr[Schemas] = js.undefined
}

object ListSchemasResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, schemas: Schemas = null): ListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[ListSchemasResponse]
  }
}

