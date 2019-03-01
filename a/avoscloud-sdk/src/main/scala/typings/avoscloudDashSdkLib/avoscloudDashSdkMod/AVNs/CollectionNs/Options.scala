package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var comparator: js.UndefOr[java.lang.String] = js.undefined
  var model: js.UndefOr[avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object] = js.undefined
  var query: js.UndefOr[avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Query] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    comparator: java.lang.String = null,
    model: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object = null,
    query: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Query = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator)
    if (model != null) __obj.updateDynamic("model")(model)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Options]
  }
}

