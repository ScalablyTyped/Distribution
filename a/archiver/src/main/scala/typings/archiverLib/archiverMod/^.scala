package typings
package archiverLib.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("archiver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(format: Format): Archiver = js.native
  def apply(format: Format, options: ArchiverOptions): Archiver = js.native
  def create(format: java.lang.String): Archiver = js.native
  def create(format: java.lang.String, options: ArchiverOptions): Archiver = js.native
  def registerFormat(format: java.lang.String, module: js.Function): scala.Unit = js.native
}

