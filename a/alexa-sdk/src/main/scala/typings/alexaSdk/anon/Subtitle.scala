package typings.alexaSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subtitle extends js.Object {
  var subtitle: String
  var title: String
}

object Subtitle {
  @scala.inline
  def apply(subtitle: String, title: String): Subtitle = {
    val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtitle]
  }
}

