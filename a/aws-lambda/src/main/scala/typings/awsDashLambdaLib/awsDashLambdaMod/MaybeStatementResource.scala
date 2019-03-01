package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeStatementResource extends js.Object {
  var NotResource: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var Resource: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object MaybeStatementResource {
  @scala.inline
  def apply(
    NotResource: java.lang.String | js.Array[java.lang.String] = null,
    Resource: java.lang.String | js.Array[java.lang.String] = null
  ): MaybeStatementResource = {
    val __obj = js.Dynamic.literal()
    if (NotResource != null) __obj.updateDynamic("NotResource")(NotResource.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeStatementResource]
  }
}

