package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctor extends js.Object {
  var ctor: js.Any
  var filePath: java.lang.String
  var name: java.lang.String
}

object Anon_Ctor {
  @scala.inline
  def apply(ctor: js.Any, filePath: java.lang.String, name: java.lang.String): Anon_Ctor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctor")(ctor)
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Ctor]
  }
}

