package typings.angularDashOdataDashResources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Method {
  @scala.inline
  def apply(method: String = null, url: String = null): Anon_Method = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Method]
  }
}

