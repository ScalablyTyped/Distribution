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

