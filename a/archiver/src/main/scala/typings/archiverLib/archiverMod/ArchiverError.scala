package typings
package archiverLib.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("archiver", "ArchiverError")
@js.native
class ArchiverError protected ()
  extends stdLib.Error {
  def this(code: java.lang.String, data: js.Any) = this()
  var code: java.lang.String = js.native
         // Since archiver format support is modular, we cannot enumerate all possible error codes, as the modules can throw arbitrary ones.
  var data: js.Any = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var path: js.UndefOr[js.Any] = js.native
}

