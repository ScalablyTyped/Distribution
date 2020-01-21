package typings.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRepositoryInfo extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var project: String
  var `type`: js.UndefOr[String] = js.undefined
  var user: String
}

object SourceRepositoryInfo {
  @scala.inline
  def apply(project: String, user: String, domain: String = null, `type`: String = null): SourceRepositoryInfo = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRepositoryInfo]
  }
}

