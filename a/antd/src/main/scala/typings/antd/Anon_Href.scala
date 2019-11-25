package typings.antd

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: String
  var title: ReactNode
}

object Anon_Href {
  @scala.inline
  def apply(href: String, title: ReactNode = null): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Href]
  }
}

