package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentTier extends js.Object {
  /**
    * The name of this environment tier. Valid values:   For Web server tier – WebServer    For Worker tier – Worker   
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The type of this environment tier. Valid values:   For Web server tier – Standard    For Worker tier – SQS/HTTP   
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest compatible worker tier version.  This member is deprecated. Any specific version that you set may become out of date. We recommend leaving it unspecified. 
    */
  var Version: js.UndefOr[String] = js.native
}

object EnvironmentTier {
  @scala.inline
  def apply(Name: String = null, Type: String = null, Version: String = null): EnvironmentTier = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTier]
  }
}

