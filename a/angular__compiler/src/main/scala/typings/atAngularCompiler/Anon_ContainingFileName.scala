package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainingFileName extends js.Object {
  def resourceNameToFileName(resourceName: String, containingFileName: String): String | Null
}

object Anon_ContainingFileName {
  @scala.inline
  def apply(resourceNameToFileName: (String, String) => String | Null): Anon_ContainingFileName = {
    val __obj = js.Dynamic.literal(resourceNameToFileName = js.Any.fromFunction2(resourceNameToFileName))
  
    __obj.asInstanceOf[Anon_ContainingFileName]
  }
}

