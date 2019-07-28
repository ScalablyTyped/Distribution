package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailableProcessorFeature extends js.Object {
  /**
    * The allowed values for the processor feature of the DB instance class.
    */
  var AllowedValues: js.UndefOr[String] = js.undefined
  /**
    * The default value for the processor feature of the DB instance class.
    */
  var DefaultValue: js.UndefOr[String] = js.undefined
  /**
    * The name of the processor feature. Valid names are coreCount and threadsPerCore.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object AvailableProcessorFeature {
  @scala.inline
  def apply(AllowedValues: String = null, DefaultValue: String = null, Name: String = null): AvailableProcessorFeature = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues)
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[AvailableProcessorFeature]
  }
}

