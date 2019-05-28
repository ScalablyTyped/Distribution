package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftar extends js.Object {
  val INs: js.Any = js.native
  /**
    * Represents a raw tar unpack stream
    */
  var RawPackStream: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.archiveNs.tarNs.RawPackStream] = js.native
  /**
    * Represents a raw writable unpack stream
    */
  var RawUnpackStream: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.archiveNs.tarNs.RawUnpackStream] = js.native
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

