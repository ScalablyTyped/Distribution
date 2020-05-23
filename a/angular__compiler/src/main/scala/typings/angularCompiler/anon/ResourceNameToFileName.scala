package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceNameToFileName extends js.Object {
  def resourceNameToFileName(resourceName: String, containingFileName: String): String | Null
}

object ResourceNameToFileName {
  @scala.inline
  def apply(resourceNameToFileName: (String, String) => String | Null): ResourceNameToFileName = {
    val __obj = js.Dynamic.literal(resourceNameToFileName = js.Any.fromFunction2(resourceNameToFileName))
    __obj.asInstanceOf[ResourceNameToFileName]
  }
}

