package typings.admZip.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var attr: Double = js.native
  
  /**
    * Entry comment.
    */
  var comment: String = js.native
  
  /**
    * Represents the full name and path of the file
    */
  var entryName: String = js.native
  
  /**
    * Extra data associated with this entry.
    */
  var extra: Buffer = js.native
  
  /**
    * Retrieve the compressed data for this entry. Note that this may trigger
    * compression if any properties were modified.
    */
  def getCompressedData(): Buffer = js.native
  
  /**
    * Asynchronously retrieve the compressed data for this entry. Note that
    * this may trigger compression if any properties were modified.
    */
  def getCompressedDataAsync(callback: js.Function1[/* data */ Buffer, Unit]): Unit = js.native
  
  /**
    * Get the decompressed data associated with this entry.
    */
  def getData(): Buffer = js.native
  
  /**
    * Asynchronously get the decompressed data associated with this entry.
    */
  def getDataAsync(callback: js.Function1[/* data */ Buffer, Unit]): Unit = js.native
  
  /**
    * Get the header associated with this ZipEntry.
    */
  var header: Buffer = js.native
  
  /**
    * Read-Only property that indicates the type of the entry.
    */
  val isDirectory: Boolean = js.native
  
  val name: String = js.native
  
  /**
    * Returns the CEN Entry Header to be written to the output zip file, plus
    * the extra data and the entry comment.
    */
  def packHeader(): Buffer = js.native
  
  val rawEntryName: Buffer = js.native
  
  /**
    * Set the (uncompressed) data to be associated with this entry.
    */
  def setData(value: String): Unit = js.native
  def setData(value: Buffer): Unit = js.native
}
