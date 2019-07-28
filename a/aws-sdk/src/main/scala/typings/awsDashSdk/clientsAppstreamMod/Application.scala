package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  /**
    * The application name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * If there is a problem, the application can be disabled after image creation.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The URL for the application icon. This URL might be time-limited.
    */
  var IconURL: js.UndefOr[String] = js.undefined
  /**
    * The arguments that are passed to the application at launch.
    */
  var LaunchParameters: js.UndefOr[String] = js.undefined
  /**
    * The path to the application executable in the instance.
    */
  var LaunchPath: js.UndefOr[String] = js.undefined
  /**
    * Additional attributes that describe the application.
    */
  var Metadata: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Metadata] = js.undefined
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object Application {
  @scala.inline
  def apply(
    DisplayName: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    IconURL: String = null,
    LaunchParameters: String = null,
    LaunchPath: String = null,
    Metadata: Metadata = null,
    Name: String = null
  ): Application = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (IconURL != null) __obj.updateDynamic("IconURL")(IconURL)
    if (LaunchParameters != null) __obj.updateDynamic("LaunchParameters")(LaunchParameters)
    if (LaunchPath != null) __obj.updateDynamic("LaunchPath")(LaunchPath)
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Application]
  }
}

