package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessorFeature extends js.Object {
  /**
    * The name of the processor feature. Valid names are coreCount and threadsPerCore.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The value of a processor feature name.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object ProcessorFeature {
  @scala.inline
  def apply(Name: String = null, Value: String = null): ProcessorFeature = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ProcessorFeature]
  }
}

