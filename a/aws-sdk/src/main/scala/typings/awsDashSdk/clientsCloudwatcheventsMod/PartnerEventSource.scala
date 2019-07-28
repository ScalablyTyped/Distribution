package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartnerEventSource extends js.Object {
  /**
    * The ARN of the partner event source.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * The name of the partner event source.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object PartnerEventSource {
  @scala.inline
  def apply(Arn: String = null, Name: String = null): PartnerEventSource = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[PartnerEventSource]
  }
}

