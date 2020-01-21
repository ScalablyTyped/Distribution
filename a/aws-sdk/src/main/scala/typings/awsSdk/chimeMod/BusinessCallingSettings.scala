package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessCallingSettings extends js.Object {
  /**
    * The Amazon S3 bucket designated for call detail record storage.
    */
  var CdrBucket: js.UndefOr[String] = js.native
}

object BusinessCallingSettings {
  @scala.inline
  def apply(CdrBucket: String = null): BusinessCallingSettings = {
    val __obj = js.Dynamic.literal()
    if (CdrBucket != null) __obj.updateDynamic("CdrBucket")(CdrBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessCallingSettings]
  }
}

