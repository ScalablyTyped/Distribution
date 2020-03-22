package typings.asar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asar", "statFile")
@js.native
object statFile extends js.Object {
  def apply(archive: String, filename: String): Metadata = js.native
  def apply(archive: String, filename: String, followLinks: Boolean): Metadata = js.native
}

