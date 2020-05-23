package typings.aphrodite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: String
  var renderedClassNames: js.Array[String]
}

object Content {
  @scala.inline
  def apply(content: String, renderedClassNames: js.Array[String]): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], renderedClassNames = renderedClassNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

