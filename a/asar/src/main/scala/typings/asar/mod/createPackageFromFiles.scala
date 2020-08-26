package typings.asar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asar", "createPackageFromFiles")
@js.native
object createPackageFromFiles extends js.Object {
  def apply(src: String, dest: String, filenames: js.Array[String]): js.Promise[Unit] = js.native
  def apply(
    src: String,
    dest: String,
    filenames: js.Array[String],
    metadata: js.UndefOr[scala.Nothing],
    options: CreateOptions
  ): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, filenames: js.Array[String], metadata: InputMetadata): js.Promise[Unit] = js.native
  def apply(
    src: String,
    dest: String,
    filenames: js.Array[String],
    metadata: InputMetadata,
    options: CreateOptions
  ): js.Promise[Unit] = js.native
}

