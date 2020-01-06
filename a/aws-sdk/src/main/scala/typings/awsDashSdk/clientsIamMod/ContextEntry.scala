package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextEntry extends js.Object {
  /**
    * The full name of a condition context key, including the service prefix. For example, aws:SourceIp or s3:VersionId.
    */
  var ContextKeyName: js.UndefOr[ContextKeyNameType] = js.native
  /**
    * The data type of the value (or values) specified in the ContextKeyValues parameter.
    */
  var ContextKeyType: js.UndefOr[ContextKeyTypeEnum] = js.native
  /**
    * The value (or values, if the condition context key supports multiple values) to provide to the simulation when the key is referenced by a Condition element in an input policy.
    */
  var ContextKeyValues: js.UndefOr[ContextKeyValueListType] = js.native
}

object ContextEntry {
  @scala.inline
  def apply(
    ContextKeyName: ContextKeyNameType = null,
    ContextKeyType: ContextKeyTypeEnum = null,
    ContextKeyValues: ContextKeyValueListType = null
  ): ContextEntry = {
    val __obj = js.Dynamic.literal()
    if (ContextKeyName != null) __obj.updateDynamic("ContextKeyName")(ContextKeyName.asInstanceOf[js.Any])
    if (ContextKeyType != null) __obj.updateDynamic("ContextKeyType")(ContextKeyType.asInstanceOf[js.Any])
    if (ContextKeyValues != null) __obj.updateDynamic("ContextKeyValues")(ContextKeyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEntry]
  }
}

