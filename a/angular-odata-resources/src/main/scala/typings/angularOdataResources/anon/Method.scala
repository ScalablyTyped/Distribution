package typings.angularOdataResources.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Method {
  @scala.inline
  def apply(method: String = null, url: String = null): Method = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
}

