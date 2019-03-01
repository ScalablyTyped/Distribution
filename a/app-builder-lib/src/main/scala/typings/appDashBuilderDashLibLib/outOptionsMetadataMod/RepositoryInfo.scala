package typings
package appDashBuilderDashLibLib.outOptionsMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryInfo extends js.Object {
  val url: java.lang.String
}

object RepositoryInfo {
  @scala.inline
  def apply(url: java.lang.String): RepositoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RepositoryInfo]
  }
}

