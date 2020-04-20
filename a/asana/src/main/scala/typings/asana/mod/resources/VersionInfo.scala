package typings.asana.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionInfo extends js.Object {
  var language: String
  var language_version: String
  var os: String
  var os_version: String
  var version: String
}

object VersionInfo {
  @scala.inline
  def apply(language: String, language_version: String, os: String, os_version: String, version: String): VersionInfo = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], language_version = language_version.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], os_version = os_version.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionInfo]
  }
}

