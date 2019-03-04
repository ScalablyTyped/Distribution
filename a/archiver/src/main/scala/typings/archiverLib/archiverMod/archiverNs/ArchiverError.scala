package typings
package archiverLib.archiverMod.archiverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiverError
  extends nodeLib.Error {
  var code: java.lang.String
         // Since archiver format support is modular, we cannot enumerate all possible error codes, as the modules can throw arbitrary ones.
  var data: js.Any
}

object ArchiverError {
  @scala.inline
  def apply(code: java.lang.String, data: js.Any, stack: java.lang.String = null): ArchiverError = {
    val __obj = js.Dynamic.literal(code = code, data = data)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ArchiverError]
  }
}

