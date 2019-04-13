package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsResponse extends js.Object {
  /**
    * A list of Channel records.
    */
  var Channels: js.UndefOr[__listOfChannel] = js.undefined
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListChannelsResponse {
  @scala.inline
  def apply(Channels: __listOfChannel = null, NextToken: __string = null): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListChannelsResponse]
  }
}

