package typings
package archiverLib.archiverMod.archiverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiverError
  extends stdLib.Error {
  var code: java.lang.String
         // Since archiver format support is modular, we cannot enumerate all possible error codes, as the modules can throw arbitrary ones.
  var data: js.Any
}

object ArchiverError {
  @scala.inline
  def apply(
    code: java.lang.String,
    data: js.Any,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): ArchiverError = {
    val __obj = js.Dynamic.literal(code = code, data = data, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ArchiverError]
  }
}

