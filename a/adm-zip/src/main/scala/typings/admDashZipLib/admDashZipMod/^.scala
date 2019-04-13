package typings
package admDashZipLib.admDashZipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adm-zip", JSImport.Namespace)
@js.native
/**
  * @param fileNameOrRawData If provided, reads an existing archive. Otherwise creates a new, empty archive.
  */
class ^ () extends AdmZip {
  def this(fileNameOrRawData: java.lang.String) = this()
  def this(fileNameOrRawData: nodeLib.Buffer) = this()
}

