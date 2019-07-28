package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  /**
    * This option is for advanced users only. This is meta information about third-party applications that third-party vendors use for testing purposes.
    */
  var AdditionalInfo: js.UndefOr[StringMap] = js.undefined
  /**
    * Arguments for Amazon EMR to pass to the application.
    */
  var Args: js.UndefOr[StringList] = js.undefined
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The version of the application.
    */
  var Version: js.UndefOr[String] = js.undefined
}

object Application {
  @scala.inline
  def apply(
    AdditionalInfo: StringMap = null,
    Args: StringList = null,
    Name: String = null,
    Version: String = null
  ): Application = {
    val __obj = js.Dynamic.literal()
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo)
    if (Args != null) __obj.updateDynamic("Args")(Args)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[Application]
  }
}

