package typings.archiver.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("archiver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(format: Format): Archiver = js.native
  def apply(format: Format, options: ArchiverOptions): Archiver = js.native
  def create(format: String): Archiver = js.native
  def create(format: String, options: ArchiverOptions): Archiver = js.native
  def registerFormat(format: String, module: js.Function): Unit = js.native
}

