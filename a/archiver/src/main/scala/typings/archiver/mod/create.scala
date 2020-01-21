package typings.archiver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("archiver", "create")
@js.native
object create extends js.Object {
  def apply(format: String): Archiver = js.native
  def apply(format: String, options: ArchiverOptions): Archiver = js.native
}

