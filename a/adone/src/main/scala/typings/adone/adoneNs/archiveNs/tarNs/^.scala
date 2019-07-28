package typings.adone.adoneNs.archiveNs.tarNs

import typings.adone.adoneNs.archiveNs.tarNs.INs.PackOptions
import typings.adone.adoneNs.archiveNs.tarNs.INs.UnpackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.archive.tar")
@js.native
object ^ extends js.Object {
  /**
    * Creates a pack stream for the files from the given directory
    *
    * @param cwd directory to pack
    */
  def packStream(cwd: String): RawPackStream = js.native
  def packStream(cwd: String, options: PackOptions): RawPackStream = js.native
  /**
    * Creates an unpack stream to the given direcotry
    *
    * @param cwd direcotry to unpack to
    */
  def unpackStream(cwd: String): RawUnpackStream = js.native
  def unpackStream(cwd: String, options: UnpackOptions): RawUnpackStream = js.native
}

