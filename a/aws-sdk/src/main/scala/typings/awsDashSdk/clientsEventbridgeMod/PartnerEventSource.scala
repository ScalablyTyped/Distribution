package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartnerEventSource extends js.Object {
  /**
    * The ARN of the partner event source.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The name of the partner event source.
    */
  var Name: js.UndefOr[String] = js.native
}

object PartnerEventSource {
  @scala.inline
  def apply(Arn: String = null, Name: String = null): PartnerEventSource = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerEventSource]
  }
}

