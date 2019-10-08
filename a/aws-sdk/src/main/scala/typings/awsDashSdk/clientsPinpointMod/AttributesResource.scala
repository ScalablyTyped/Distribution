package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesResource extends js.Object {
  /**
    * The unique identifier for the application.
    */
  var ApplicationId: __string
  /**
    * The type of attribute or attributes that were removed from the endpoints. Valid values are: endpoint-custom-attributes - Custom attributes that describe endpoints. endpoint-custom-metrics - Custom metrics that your app reports to Amazon Pinpoint for endpoints. endpoint-user-attributes - Custom attributes that describe users.
    */
  var AttributeType: __string
  /**
    * An array that specifies the names of the attributes that were removed from the endpoints.
    */
  var Attributes: js.UndefOr[ListOf__string] = js.undefined
}

object AttributesResource {
  @scala.inline
  def apply(ApplicationId: __string, AttributeType: __string, Attributes: ListOf__string = null): AttributesResource = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, AttributeType = AttributeType)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[AttributesResource]
  }
}

