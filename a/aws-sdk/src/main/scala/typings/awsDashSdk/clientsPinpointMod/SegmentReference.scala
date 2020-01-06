package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentReference extends js.Object {
  /**
    * The unique identifier for the segment.
    */
  var Id: __string = js.native
  /**
    * The version number of the segment.
    */
  var Version: js.UndefOr[__integer] = js.native
}

object SegmentReference {
  @scala.inline
  def apply(Id: __string, Version: Int | Double = null): SegmentReference = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentReference]
  }
}

