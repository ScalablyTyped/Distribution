package typings.awsLambda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeStatementResource extends js.Object {
  var NotResource: js.UndefOr[String | js.Array[String]] = js.undefined
  var Resource: js.UndefOr[String | js.Array[String]] = js.undefined
}

object MaybeStatementResource {
  @scala.inline
  def apply(NotResource: String | js.Array[String] = null, Resource: String | js.Array[String] = null): MaybeStatementResource = {
    val __obj = js.Dynamic.literal()
    if (NotResource != null) __obj.updateDynamic("NotResource")(NotResource.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeStatementResource]
  }
}

