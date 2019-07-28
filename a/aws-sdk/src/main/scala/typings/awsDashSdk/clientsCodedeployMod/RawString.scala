package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawString extends js.Object {
  /**
    * The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function to update and optional Lambda functions that validate deployment lifecycle events.
    */
  var content: js.UndefOr[RawStringContent] = js.undefined
  /**
    * The SHA256 hash value of the revision content.
    */
  var sha256: js.UndefOr[RawStringSha256] = js.undefined
}

object RawString {
  @scala.inline
  def apply(content: RawStringContent = null, sha256: RawStringSha256 = null): RawString = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256)
    __obj.asInstanceOf[RawString]
  }
}

