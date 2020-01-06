package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformApplication extends js.Object {
  /**
    * Attributes for platform application object.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
  /**
    * PlatformApplicationArn for platform application object.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.native
}

object PlatformApplication {
  @scala.inline
  def apply(Attributes: MapStringToString = null, PlatformApplicationArn: String = null): PlatformApplication = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (PlatformApplicationArn != null) __obj.updateDynamic("PlatformApplicationArn")(PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformApplication]
  }
}

