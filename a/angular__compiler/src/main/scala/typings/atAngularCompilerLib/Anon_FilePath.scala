package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilePath extends js.Object {
  var filePath: java.lang.String
  var fn: js.Any
  var name: java.lang.String
}

object Anon_FilePath {
  @scala.inline
  def apply(filePath: java.lang.String, fn: js.Any, name: java.lang.String): Anon_FilePath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("fn")(fn)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_FilePath]
  }
}

