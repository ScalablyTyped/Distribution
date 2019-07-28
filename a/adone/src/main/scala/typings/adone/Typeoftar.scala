package typings.adone

import org.scalablytyped.runtime.Instantiable0
import typings.adone.adoneNs.archiveNs.tarNs.INs.PackOptions
import typings.adone.adoneNs.archiveNs.tarNs.INs.UnpackOptions
import typings.adone.adoneNs.archiveNs.tarNs.RawPackStream
import typings.adone.adoneNs.archiveNs.tarNs.RawUnpackStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftar extends js.Object {
  val INs: js.Any = js.native
  /**
    * Represents a raw tar unpack stream
    */
  var RawPackStream: Instantiable0[typings.adone.adoneNs.archiveNs.tarNs.RawPackStream] = js.native
  /**
    * Represents a raw writable unpack stream
    */
  var RawUnpackStream: Instantiable0[typings.adone.adoneNs.archiveNs.tarNs.RawUnpackStream] = js.native
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

