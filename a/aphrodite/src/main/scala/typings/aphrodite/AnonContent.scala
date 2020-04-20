package typings.aphrodite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: String
  var renderedClassNames: js.Array[String]
}

object AnonContent {
  @scala.inline
  def apply(content: String, renderedClassNames: js.Array[String]): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], renderedClassNames = renderedClassNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

