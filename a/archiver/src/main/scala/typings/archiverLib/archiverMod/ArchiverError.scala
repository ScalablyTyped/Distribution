package typings
package archiverLib.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("archiver", "ArchiverError")
@js.native
class ArchiverError protected ()
  extends archiverLib.archiverMod.archiverNs.ArchiverError {
  def this(code: java.lang.String, data: js.Any) = this()
  /* CompleteClass */
  override var code: java.lang.String = js.native
         // Since archiver format support is modular, we cannot enumerate all possible error codes, as the modules can throw arbitrary ones.
  /* CompleteClass */
  override var data: js.Any = js.native
}

