package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * The classification within a configuration.
    */
  var Classification: js.UndefOr[String] = js.undefined
  /**
    * A list of additional configurations to apply within a configuration object.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  /**
    * A set of properties specified within a configuration classification.
    */
  var Properties: js.UndefOr[StringMap] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    Classification: String = null,
    Configurations: ConfigurationList = null,
    Properties: StringMap = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (Classification != null) __obj.updateDynamic("Classification")(Classification)
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (Properties != null) __obj.updateDynamic("Properties")(Properties)
    __obj.asInstanceOf[Configuration]
  }
}

