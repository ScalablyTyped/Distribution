package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo extends js.Object {
  /**
    * Name of the field.
    */
  var Name: js.UndefOr[FieldName] = js.undefined
}

object FieldInfo {
  @scala.inline
  def apply(Name: FieldName = null): FieldInfo = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[FieldInfo]
  }
}

