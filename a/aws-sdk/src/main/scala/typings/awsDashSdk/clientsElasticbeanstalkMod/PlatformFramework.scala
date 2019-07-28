package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformFramework extends js.Object {
  /**
    * The name of the framework.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The version of the framework.
    */
  var Version: js.UndefOr[String] = js.undefined
}

object PlatformFramework {
  @scala.inline
  def apply(Name: String = null, Version: String = null): PlatformFramework = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[PlatformFramework]
  }
}

