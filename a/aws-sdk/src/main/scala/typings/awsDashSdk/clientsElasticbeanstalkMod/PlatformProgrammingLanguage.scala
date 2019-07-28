package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformProgrammingLanguage extends js.Object {
  /**
    * The name of the programming language.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The version of the programming language.
    */
  var Version: js.UndefOr[String] = js.undefined
}

object PlatformProgrammingLanguage {
  @scala.inline
  def apply(Name: String = null, Version: String = null): PlatformProgrammingLanguage = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[PlatformProgrammingLanguage]
  }
}

