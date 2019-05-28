package typings
package adoneLib.adoneNs.archiveNs.zipNs.packNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.archive.zip.pack.ZipFile")
@js.native
class ZipFile () extends js.Object {
  /**
    * A readable stream that will produce the contents of the zip file
    */
  var outputStream: nodeLib.streamMod.Readable = js.native
  /**
    * Adds a file to the zip file whose content is buffer
    *
    * @param buffer the file's contents, must be at most 0x3fffffff bytes long
    * @param metadataPath path to the file inside the archive
    */
  def addBuffer(buffer: nodeLib.Buffer, metadataPath: java.lang.String): this.type = js.native
  def addBuffer(buffer: nodeLib.Buffer, metadataPath: java.lang.String, options: adoneLib.Anon_Compress): this.type = js.native
  /**
    * Adds an entry to the zip file that indicates a directory should be created,
    * even if no other items in the zip file are contained in the directory
    */
  def addEmptyDirectory(metadataPath: java.lang.String): this.type = js.native
  def addEmptyDirectory(metadataPath: java.lang.String, options: adoneLib.Anon_Mode): this.type = js.native
  /**
    * Adds a file from the file system at realPath into the zipfile as metadataPath
    *
    * @param path path to the file
    * @param metadataPath path to the file inside the archive
    */
  def addFile(path: java.lang.String, metadataPath: java.lang.String): this.type = js.native
  def addFile(path: java.lang.String, metadataPath: java.lang.String, options: adoneLib.Anon_Compress): this.type = js.native
  /**
    * Adds a file to the zip file whose content is read from readStream
    *
    * @param stream a readable stream for the file
    * @param metadataPath path to the file inside the archive
    */
  def addReadStream(stream: nodeLib.streamMod.Readable, metadataPath: java.lang.String): this.type = js.native
  def addReadStream(
    stream: nodeLib.streamMod.Readable,
    metadataPath: java.lang.String,
    options: adoneLib.Anon_CompressForceZip64Format
  ): this.type = js.native
  /**
    * Indicates that no more files will be added via addFile(), addReadStream(), or addBuffer().
    * Some time after calling this function, outputStream will be ended.
    *
    * @returns the final guessed size of the file, can be -1 if it is hard to guess before processing. This will happend
    *      only if compression is enabled, or a stream with no size hint given
    */
  def end(): js.Promise[scala.Double] = js.native
  def end(options: adoneLib.Anon_ForceZip64Format): js.Promise[scala.Double] = js.native
}

