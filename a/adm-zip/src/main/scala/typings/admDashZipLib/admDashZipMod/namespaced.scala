package typings
package admDashZipLib.admDashZipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adm-zip", JSImport.Namespace)
@js.native
/**
  * Create a new, empty archive.
  */
class namespaced () extends AdmZip {
  /**
    * Read an existing archive.
    */
  def this(fileName: java.lang.String) = this()
  def this(rawData: nodeLib.Buffer) = this()
}

