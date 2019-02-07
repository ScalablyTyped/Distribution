package typings
package admDashZipLib.admDashZipMod.AdmZipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `IZipEntry` is more than a structure representing the entry inside the
  * zip file. Beside the normal attributes and headers a entry can have, the
  * class contains a reference to the part of the file where the compressed
  * data resides and decompresses it when requested. It also compresses the
  * data and creates the headers required to write in the zip file.
  */
// disable warning about the I-prefix in interface name to prevent breaking stuff for users without a major bump
// tslint:disable-next-line:interface-name
@js.native
trait IZipEntry extends js.Object {
  var attr: scala.Double = js.native
  /**
    * Entry comment.
    */
  var comment: java.lang.String = js.native
  /**
    * Represents the full name and path of the file
    */
  var entryName: java.lang.String = js.native
  /**
    * Extra data associated with this entry.
    */
  var extra: nodeLib.Buffer = js.native
  /**
    * Get the header associated with this ZipEntry.
    */
  var header: nodeLib.Buffer = js.native
  /**
    * Read-Only property that indicates the type of the entry.
    */
  val isDirectory: scala.Boolean = js.native
  val name: java.lang.String = js.native
  val rawEntryName: nodeLib.Buffer = js.native
  /**
    * Retrieve the compressed data for this entry. Note that this may trigger
    * compression if any properties were modified.
    */
  def getCompressedData(): nodeLib.Buffer = js.native
  /**
    * Asynchronously retrieve the compressed data for this entry. Note that
    * this may trigger compression if any properties were modified.
    */
  def getCompressedDataAsync(callback: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  /**
    * Get the decompressed data associated with this entry.
    */
  def getData(): nodeLib.Buffer = js.native
  /**
    * Asynchronously get the decompressed data associated with this entry.
    */
  def getDataAsync(callback: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  /**
    * Returns the CEN Entry Header to be written to the output zip file, plus
    * the extra data and the entry comment.
    */
  def packHeader(): nodeLib.Buffer = js.native
  /**
    * Set the (uncompressed) data to be associated with this entry.
    */
  def setData(value: java.lang.String): scala.Unit = js.native
  def setData(value: nodeLib.Buffer): scala.Unit = js.native
}

