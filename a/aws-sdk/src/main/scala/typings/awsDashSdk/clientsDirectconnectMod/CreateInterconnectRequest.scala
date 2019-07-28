package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInterconnectRequest extends js.Object {
  /**
    * The port bandwidth, in Gbps. The possible values are 1 and 10.
    */
  var bandwidth: Bandwidth
  /**
    * The name of the interconnect.
    */
  var interconnectName: InterconnectName
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.undefined
  /**
    * The location of the interconnect.
    */
  var location: LocationCode
  /**
    * The tags to assign to the interconnect,
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateInterconnectRequest {
  @scala.inline
  def apply(
    bandwidth: Bandwidth,
    interconnectName: InterconnectName,
    location: LocationCode,
    lagId: LagId = null,
    tags: TagList = null
  ): CreateInterconnectRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth, interconnectName = interconnectName, location = location)
    if (lagId != null) __obj.updateDynamic("lagId")(lagId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateInterconnectRequest]
  }
}

