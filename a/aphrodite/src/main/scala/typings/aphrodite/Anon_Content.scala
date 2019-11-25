package typings.aphrodite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: String
  var renderedClassNames: js.Array[String]
}

object Anon_Content {
  @scala.inline
  def apply(content: String, renderedClassNames: js.Array[String]): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], renderedClassNames = renderedClassNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Content]
  }
}

