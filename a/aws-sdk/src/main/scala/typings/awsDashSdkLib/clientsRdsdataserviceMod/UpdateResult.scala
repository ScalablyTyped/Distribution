package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResult extends js.Object {
  /**
    * Values for fields generated during the request.
    */
  var generatedFields: js.UndefOr[FieldList] = js.undefined
}

object UpdateResult {
  @scala.inline
  def apply(generatedFields: FieldList = null): UpdateResult = {
    val __obj = js.Dynamic.literal()
    if (generatedFields != null) __obj.updateDynamic("generatedFields")(generatedFields)
    __obj.asInstanceOf[UpdateResult]
  }
}

