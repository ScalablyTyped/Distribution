package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeThingResponse extends js.Object {
  /**
    * The thing attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * The name of the billing group the thing belongs to.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  /**
    * The default client ID.
    */
  var defaultClientId: js.UndefOr[ClientId] = js.undefined
  /**
    * The ARN of the thing to describe.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  /**
    * The ID of the thing to describe.
    */
  var thingId: js.UndefOr[ThingId] = js.undefined
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  /**
    * The current version of the thing record in the registry.  To avoid unintentional changes to the information in the registry, you can pass the version information in the expectedVersion parameter of the UpdateThing and DeleteThing calls. 
    */
  var version: js.UndefOr[Version] = js.undefined
}

object DescribeThingResponse {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    billingGroupName: BillingGroupName = null,
    defaultClientId: ClientId = null,
    thingArn: ThingArn = null,
    thingId: ThingId = null,
    thingName: ThingName = null,
    thingTypeName: ThingTypeName = null,
    version: Int | Double = null
  ): DescribeThingResponse = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName)
    if (defaultClientId != null) __obj.updateDynamic("defaultClientId")(defaultClientId)
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn)
    if (thingId != null) __obj.updateDynamic("thingId")(thingId)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingResponse]
  }
}

