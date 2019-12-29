package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDeeplinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepLinkOptions extends js.Object {
  /**
    * Android app package name to which to link.
    * @public
    */
  @JSName("package")
  var _package: String
  /**
    * The name of the link destination.
    * @public
    */
  var destination: String
  /**
    * The reason to transfer the user. This may be appended to a Google-specified prompt.
    * @public
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * URL of Android deep link.
    * @public
    */
  var url: String
}

object DeepLinkOptions {
  @scala.inline
  def apply(_package: String, destination: String, url: String, reason: String = null): DeepLinkOptions = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepLinkOptions]
  }
}

