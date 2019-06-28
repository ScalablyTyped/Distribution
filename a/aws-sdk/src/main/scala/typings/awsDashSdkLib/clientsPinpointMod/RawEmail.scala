package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawEmail extends js.Object {
  /**
    * The email message, represented as a raw MIME message. The entire message must be base64 encoded.
    */
  var Data: js.UndefOr[__blob] = js.undefined
}

object RawEmail {
  @scala.inline
  def apply(Data: __blob = null): RawEmail = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawEmail]
  }
}

