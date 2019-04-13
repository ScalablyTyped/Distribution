package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentTier extends js.Object {
  /**
    * The name of this environment tier. Valid values:   For Web server tier – WebServer    For Worker tier – Worker   
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The type of this environment tier. Valid values:   For Web server tier – Standard    For Worker tier – SQS/HTTP   
    */
  var Type: js.UndefOr[String] = js.undefined
  /**
    * The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest compatible worker tier version.  This member is deprecated. Any specific version that you set may become out of date. We recommend leaving it unspecified. 
    */
  var Version: js.UndefOr[String] = js.undefined
}

object EnvironmentTier {
  @scala.inline
  def apply(Name: String = null, Type: String = null, Version: String = null): EnvironmentTier = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[EnvironmentTier]
  }
}

