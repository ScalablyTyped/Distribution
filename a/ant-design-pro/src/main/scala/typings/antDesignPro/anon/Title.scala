package typings.antDesignPro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var title: String | Double
}

object Title {
  @scala.inline
  def apply(title: String | Double, href: String = null): Title = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

