package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentOptions extends js.Object {
  /**
    * The segment. Usually the integration name.
    */
  val segment: String
  /**
    * The version. Usually the integration version.
    */
  val version: js.UndefOr[String] = js.undefined
}

object UserAgentOptions {
  @scala.inline
  def apply(segment: String, version: String = null): UserAgentOptions = {
    val __obj = js.Dynamic.literal(segment = segment.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentOptions]
  }
}

