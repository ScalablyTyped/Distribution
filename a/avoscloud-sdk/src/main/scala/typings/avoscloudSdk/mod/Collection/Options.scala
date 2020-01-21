package typings.avoscloudSdk.mod.Collection

import typings.avoscloudSdk.mod.Object
import typings.avoscloudSdk.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var comparator: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[Object] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

object Options {
  @scala.inline
  def apply(comparator: String = null, model: Object = null, query: Query = null): Options = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

