package typings.archiver.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("archiver", "ArchiverError")
@js.native
class ArchiverError protected () extends Error {
  def this(code: String, data: js.Any) = this()
  
  var code: String = js.native
  
   // Since archiver format support is modular, we cannot enumerate all possible error codes, as the modules can throw arbitrary ones.
  var data: js.Any = js.native
  
  var path: js.UndefOr[js.Any] = js.native
}
