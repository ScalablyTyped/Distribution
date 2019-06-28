package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentReference extends js.Object {
  /**
    * The unique identifier for the segment.
    */
  var Id: __string
  /**
    * The version number of the segment.
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object SegmentReference {
  @scala.inline
  def apply(Id: __string, Version: js.UndefOr[__integer] = js.undefined): SegmentReference = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[SegmentReference]
  }
}

