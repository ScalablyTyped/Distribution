package typings
package adoneLib.adoneNs.archiveNs.tarNs

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
  def packStream(cwd: java.lang.String): adoneLib.adoneNs.archiveNs.tarNs.RawPackStream = js.native
  def packStream(cwd: java.lang.String, options: adoneLib.adoneNs.archiveNs.tarNs.INs.PackOptions): adoneLib.adoneNs.archiveNs.tarNs.RawPackStream = js.native
  /**
    * Creates an unpack stream to the given direcotry
    *
    * @param cwd direcotry to unpack to
    */
  def unpackStream(cwd: java.lang.String): adoneLib.adoneNs.archiveNs.tarNs.RawUnpackStream = js.native
  def unpackStream(cwd: java.lang.String, options: adoneLib.adoneNs.archiveNs.tarNs.INs.UnpackOptions): adoneLib.adoneNs.archiveNs.tarNs.RawUnpackStream = js.native
}

