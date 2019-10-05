package typings.asana.asanaMod.resources

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
    val __obj = js.Dynamic.literal(language = language, language_version = language_version, os = os, os_version = os_version, version = version)
  
    __obj.asInstanceOf[VersionInfo]
  }
}

