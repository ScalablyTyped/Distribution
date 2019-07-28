package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizationWarning extends js.Object {
  /**
    * The name of the XML attribute that has been sanitized.
    */
  var AttributeName: js.UndefOr[__string] = js.undefined
  /**
    * The name of the XML element that has been sanitized.
    */
  var ElementName: js.UndefOr[__string] = js.undefined
  /**
    * Required. The reason for which the XML elements or attributes were sanitized.
    */
  var Reason: js.UndefOr[SanitizationWarningReason] = js.undefined
}

object SanitizationWarning {
  @scala.inline
  def apply(
    AttributeName: __string = null,
    ElementName: __string = null,
    Reason: SanitizationWarningReason = null
  ): SanitizationWarning = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (ElementName != null) __obj.updateDynamic("ElementName")(ElementName)
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizationWarning]
  }
}

