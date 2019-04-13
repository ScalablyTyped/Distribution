package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformApplication extends js.Object {
  /**
    * Attributes for platform application object.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.undefined
  /**
    * PlatformApplicationArn for platform application object.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.undefined
}

object PlatformApplication {
  @scala.inline
  def apply(Attributes: MapStringToString = null, PlatformApplicationArn: String = null): PlatformApplication = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (PlatformApplicationArn != null) __obj.updateDynamic("PlatformApplicationArn")(PlatformApplicationArn)
    __obj.asInstanceOf[PlatformApplication]
  }
}

