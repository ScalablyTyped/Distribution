package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingsRequest extends js.Object {
  /**
    * The attribute name used to search for things.
    */
  var attributeName: js.UndefOr[AttributeName] = js.undefined
  /**
    * The attribute value used to search for things.
    */
  var attributeValue: js.UndefOr[AttributeValue] = js.undefined
  /**
    * The maximum number of results to return in this operation.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The name of the thing type used to search for things.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}

object ListThingsRequest {
  @scala.inline
  def apply(
    attributeName: AttributeName = null,
    attributeValue: AttributeValue = null,
    maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
    nextToken: NextToken = null,
    thingTypeName: ThingTypeName = null
  ): ListThingsRequest = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName)
    if (attributeValue != null) __obj.updateDynamic("attributeValue")(attributeValue)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    __obj.asInstanceOf[ListThingsRequest]
  }
}

