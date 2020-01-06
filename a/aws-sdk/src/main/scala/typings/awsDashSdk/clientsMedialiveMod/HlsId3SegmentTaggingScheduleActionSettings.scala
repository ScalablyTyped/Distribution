package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsId3SegmentTaggingScheduleActionSettings extends js.Object {
  /**
    * ID3 tag to insert into each segment. Supports special keyword identifiers to substitute in segment-related values.\nSupported keyword identifiers: https://docs.aws.amazon.com/medialive/latest/ug/variable-data-identifiers.html
    */
  var Tag: __string = js.native
}

object HlsId3SegmentTaggingScheduleActionSettings {
  @scala.inline
  def apply(Tag: __string): HlsId3SegmentTaggingScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HlsId3SegmentTaggingScheduleActionSettings]
  }
}

