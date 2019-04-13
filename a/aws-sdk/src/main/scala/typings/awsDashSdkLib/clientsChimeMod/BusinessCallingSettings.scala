package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessCallingSettings extends js.Object {
  /**
    * The Amazon S3 bucket designated for call detail record storage.
    */
  var CdrBucket: js.UndefOr[String] = js.undefined
}

object BusinessCallingSettings {
  @scala.inline
  def apply(CdrBucket: String = null): BusinessCallingSettings = {
    val __obj = js.Dynamic.literal()
    if (CdrBucket != null) __obj.updateDynamic("CdrBucket")(CdrBucket)
    __obj.asInstanceOf[BusinessCallingSettings]
  }
}

