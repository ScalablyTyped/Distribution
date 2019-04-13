package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentReference extends js.Object {
  /**
    * A unique identifier for the segment.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * If specified contains a specific version of the segment included.
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object SegmentReference {
  @scala.inline
  def apply(Id: __string = null, Version: js.UndefOr[__integer] = js.undefined): SegmentReference = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[SegmentReference]
  }
}

