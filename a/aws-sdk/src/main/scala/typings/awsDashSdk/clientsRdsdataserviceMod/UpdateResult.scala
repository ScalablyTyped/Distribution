package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResult extends js.Object {
  /**
    * Values for fields generated during the request.
    */
  var generatedFields: js.UndefOr[FieldList] = js.native
}

object UpdateResult {
  @scala.inline
  def apply(generatedFields: FieldList = null): UpdateResult = {
    val __obj = js.Dynamic.literal()
    if (generatedFields != null) __obj.updateDynamic("generatedFields")(generatedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult]
  }
}

