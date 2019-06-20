package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Summary extends js.Object {
  /**
    * The timestamp that shows when this summary was generated in this Region. 
    */
  var LastUpdated: js.UndefOr[LastUpdated] = js.undefined
  /**
    * The count of noncompliant resources.
    */
  var NonCompliantResources: js.UndefOr[NonCompliantResources] = js.undefined
  /**
    * The AWS Region that the summary applies to.
    */
  var Region: js.UndefOr[Region] = js.undefined
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[AmazonResourceType] = js.undefined
  /**
    * The account identifier or the root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations ListRoots API.
    */
  var TargetId: js.UndefOr[TargetId] = js.undefined
}

object Summary {
  @scala.inline
  def apply(
    LastUpdated: LastUpdated = null,
    NonCompliantResources: js.UndefOr[NonCompliantResources] = js.undefined,
    Region: Region = null,
    ResourceType: AmazonResourceType = null,
    TargetId: TargetId = null
  ): Summary = {
    val __obj = js.Dynamic.literal()
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (!js.isUndefined(NonCompliantResources)) __obj.updateDynamic("NonCompliantResources")(NonCompliantResources)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId)
    __obj.asInstanceOf[Summary]
  }
}

