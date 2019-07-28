package typings.admDashZip.admDashZipMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adm-zip", JSImport.Namespace)
@js.native
/**
  * @param fileNameOrRawData If provided, reads an existing archive. Otherwise creates a new, empty archive.
  */
class ^ () extends AdmZip {
  def this(fileNameOrRawData: String) = this()
  def this(fileNameOrRawData: Buffer) = this()
}

