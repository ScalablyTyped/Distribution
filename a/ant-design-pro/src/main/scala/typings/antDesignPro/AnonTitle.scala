package typings.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var title: String | Double
}

object AnonTitle {
  @scala.inline
  def apply(title: String | Double, href: String = null): AnonTitle = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

