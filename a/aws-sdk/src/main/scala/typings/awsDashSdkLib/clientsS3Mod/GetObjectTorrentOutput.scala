package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectTorrentOutput extends js.Object {
  /**
    * 
    */
  var Body: js.UndefOr[Body] = js.undefined
  var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
}

object GetObjectTorrentOutput {
  @scala.inline
  def apply(Body: Body = null, RequestCharged: RequestCharged = null): GetObjectTorrentOutput = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTorrentOutput]
  }
}

