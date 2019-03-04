package typings
package appDashBuilderDashLibLib.outCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRepositoryInfo extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var project: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var user: java.lang.String
}

object SourceRepositoryInfo {
  @scala.inline
  def apply(
    project: java.lang.String,
    user: java.lang.String,
    domain: java.lang.String = null,
    `type`: java.lang.String = null
  ): SourceRepositoryInfo = {
    val __obj = js.Dynamic.literal(project = project, user = user)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SourceRepositoryInfo]
  }
}

