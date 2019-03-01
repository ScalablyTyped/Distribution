package typings
package aphroditeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: java.lang.String
  var renderedClassNames: js.Array[java.lang.String]
}

object Anon_Content {
  @scala.inline
  def apply(content: java.lang.String, renderedClassNames: js.Array[java.lang.String]): Anon_Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("renderedClassNames")(renderedClassNames)
    __obj.asInstanceOf[Anon_Content]
  }
}

