package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanRange extends js.Object {
  /**
    * Specifies the end of the byte range. This parameter is optional. Valid values: non-negative integers. The default value is one less than the size of the object being queried. If only the End parameter is supplied, it is interpreted to mean scan the last N bytes of the file. For example, &lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt; means scan the last 50 bytes.
    */
  var End: js.UndefOr[typings.awsDashSdk.clientsS3Mod.End] = js.native
  /**
    * Specifies the start of the byte range. This parameter is optional. Valid values: non-negative integers. The default value is 0. If only start is supplied, it means scan from that point to the end of the file.For example; &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt; means scan from byte 50 until the end of the file.
    */
  var Start: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Start] = js.native
}

object ScanRange {
  @scala.inline
  def apply(End: Int | Double = null, Start: Int | Double = null): ScanRange = {
    val __obj = js.Dynamic.literal()
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanRange]
  }
}

