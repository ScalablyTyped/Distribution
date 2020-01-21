package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainingFileName extends js.Object {
  def resourceNameToFileName(resourceName: String, containingFileName: String): String | Null
}

object AnonContainingFileName {
  @scala.inline
  def apply(resourceNameToFileName: (String, String) => String | Null): AnonContainingFileName = {
    val __obj = js.Dynamic.literal(resourceNameToFileName = js.Any.fromFunction2(resourceNameToFileName))
  
    __obj.asInstanceOf[AnonContainingFileName]
  }
}

