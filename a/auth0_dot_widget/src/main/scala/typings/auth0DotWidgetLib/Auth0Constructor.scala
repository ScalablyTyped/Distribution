package typings
package auth0DotWidgetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait Auth0Constructor extends js.Object {
  var assetsUrl: js.UndefOr[java.lang.String] = js.undefined
  var cdn: js.UndefOr[java.lang.String] = js.undefined
  var dict: js.UndefOr[js.Any] = js.undefined
}

object Auth0Constructor {
  @scala.inline
  def apply(assetsUrl: java.lang.String = null, cdn: java.lang.String = null, dict: js.Any = null): Auth0Constructor = {
    val __obj = js.Dynamic.literal()
    if (assetsUrl != null) __obj.updateDynamic("assetsUrl")(assetsUrl)
    if (cdn != null) __obj.updateDynamic("cdn")(cdn)
    if (dict != null) __obj.updateDynamic("dict")(dict)
    __obj.asInstanceOf[Auth0Constructor]
  }
}

