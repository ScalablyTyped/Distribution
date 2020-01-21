package typings.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHrefTitle extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var title: String | Double
}

object AnonHrefTitle {
  @scala.inline
  def apply(title: String | Double, href: String = null): AnonHrefTitle = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHrefTitle]
  }
}

