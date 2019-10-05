package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectBadge extends js.Object {
  /**
    * Set this to true to generate a publicly accessible URL for your project's build badge.
    */
  var badgeEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The publicly-accessible URL through which you can access the build badge for your project.  The publicly accessible URL through which you can access the build badge for your project. 
    */
  var badgeRequestUrl: js.UndefOr[String] = js.undefined
}

object ProjectBadge {
  @scala.inline
  def apply(badgeEnabled: js.UndefOr[scala.Boolean] = js.undefined, badgeRequestUrl: String = null): ProjectBadge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(badgeEnabled)) __obj.updateDynamic("badgeEnabled")(badgeEnabled)
    if (badgeRequestUrl != null) __obj.updateDynamic("badgeRequestUrl")(badgeRequestUrl)
    __obj.asInstanceOf[ProjectBadge]
  }
}

