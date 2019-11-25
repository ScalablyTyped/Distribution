package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2NewSurfaceValueSpec extends js.Object {
  /**
    * The list of capabilities required from the surface. Eg,
    * [\"actions.capability.SCREEN_OUTPUT\"]
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Context describing the content the user will receive on the new surface.
    * Eg, \"[Sure, I know of 10 that are really popular. The highest-rated one is
    * at Mount Marcy.] Is it okay if I send that to your phone?\"
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * Title of the notification which prompts the user to continue on the new
    * surface.
    */
  var notificationTitle: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2NewSurfaceValueSpec {
  @scala.inline
  def apply(capabilities: js.Array[String] = null, context: String = null, notificationTitle: String = null): GoogleActionsV2NewSurfaceValueSpec = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (notificationTitle != null) __obj.updateDynamic("notificationTitle")(notificationTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2NewSurfaceValueSpec]
  }
}

