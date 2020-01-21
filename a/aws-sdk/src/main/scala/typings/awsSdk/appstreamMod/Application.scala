package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  /**
    * The application name to display.
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * If there is a problem, the application can be disabled after image creation.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The URL for the application icon. This URL might be time-limited.
    */
  var IconURL: js.UndefOr[String] = js.native
  /**
    * The arguments that are passed to the application at launch.
    */
  var LaunchParameters: js.UndefOr[String] = js.native
  /**
    * The path to the application executable in the instance.
    */
  var LaunchPath: js.UndefOr[String] = js.native
  /**
    * Additional attributes that describe the application.
    */
  var Metadata: js.UndefOr[typings.awsSdk.appstreamMod.Metadata] = js.native
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[String] = js.native
}

object Application {
  @scala.inline
  def apply(
    DisplayName: String = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    IconURL: String = null,
    LaunchParameters: String = null,
    LaunchPath: String = null,
    Metadata: Metadata = null,
    Name: String = null
  ): Application = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (IconURL != null) __obj.updateDynamic("IconURL")(IconURL.asInstanceOf[js.Any])
    if (LaunchParameters != null) __obj.updateDynamic("LaunchParameters")(LaunchParameters.asInstanceOf[js.Any])
    if (LaunchPath != null) __obj.updateDynamic("LaunchPath")(LaunchPath.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

