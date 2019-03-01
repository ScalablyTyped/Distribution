package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionInfo extends js.Object {
  var language: java.lang.String
  var language_version: java.lang.String
  var os: java.lang.String
  var os_version: java.lang.String
  var version: java.lang.String
}

object VersionInfo {
  @scala.inline
  def apply(
    language: java.lang.String,
    language_version: java.lang.String,
    os: java.lang.String,
    os_version: java.lang.String,
    version: java.lang.String
  ): VersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("language_version")(language_version)
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("os_version")(os_version)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[VersionInfo]
  }
}

