package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAuth extends js.Object {
  /**
    * The resource value that applies to the specified authorization type.
    */
  var resource: js.UndefOr[String] = js.undefined
  /**
    *   This data type is deprecated and is no longer accurate or used.   The authorization type to use. The only valid value is OAUTH, which represents the OAuth authorization type.
    */
  var `type`: SourceAuthType
}

object SourceAuth {
  @scala.inline
  def apply(`type`: SourceAuthType, resource: String = null): SourceAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[SourceAuth]
  }
}

