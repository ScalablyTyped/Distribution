package typings
package activeDashWinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BundleId extends js.Object {
  var bundleId: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var processId: scala.Double
}

object Anon_BundleId {
  @scala.inline
  def apply(
    name: java.lang.String,
    processId: scala.Double,
    bundleId: scala.Int | scala.Double = null,
    path: java.lang.String = null
  ): Anon_BundleId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("processId")(processId)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_BundleId]
  }
}

