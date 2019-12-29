package typings.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HrefTitle extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var title: String | Double
}

object Anon_HrefTitle {
  @scala.inline
  def apply(title: String | Double, href: String = null): Anon_HrefTitle = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HrefTitle]
  }
}

