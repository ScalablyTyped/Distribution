package typings.alexaSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubtitle extends js.Object {
  var subtitle: String
  var title: String
}

object AnonSubtitle {
  @scala.inline
  def apply(subtitle: String, title: String): AnonSubtitle = {
    val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSubtitle]
  }
}

