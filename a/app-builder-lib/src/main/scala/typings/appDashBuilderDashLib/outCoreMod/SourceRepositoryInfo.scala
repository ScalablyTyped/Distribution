package typings.appDashBuilderDashLib.outCoreMod

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
    val __obj = js.Dynamic.literal(project = project, user = user)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SourceRepositoryInfo]
  }
}

