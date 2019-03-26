package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BufferFd extends js.Object {
  val INs: js.Any = js.native
  /**
    * Creates a zipfile unpacker for the given buffer
    */
  def fromBuffer(buffer: nodeLib.Buffer): adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.ZipFile[java.lang.String] = js.native
  /**
    * Creates a zipfile unpacker for the given buffer
    */
  def fromBuffer(
    buffer: nodeLib.Buffer,
    options: (adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.BufferOptions with Anon_DecodeStrings) | adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.BufferOptions
  ): adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.ZipFile[nodeLib.Buffer] = js.native
  /**
    * Creates a zipfile unpacker for the given fd
    */
  def fromFd(fd: scala.Double): adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.ZipFile[java.lang.String] = js.native
  /**
    * Creates a zipfile unpacker for the given fd
    */
  def fromFd(
    fd: scala.Double,
    options: (adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.FdOptions with Anon_DecodeStrings) | adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.FdOptions
  ): adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.ZipFile[nodeLib.Buffer] = js.native
  /**
    * Creates a zipfile unpacker for the given random access reader.
    * This method of reading a zip file allows clients to implement their own back-end file system
    *
    * @param totalSize Indicates the total file size of the zip file
    */
  def fromRandomAccessReader(reader: adoneLib.adoneNs.fsNs.AbstractRandomAccessReader, totalSize: scala.Double): adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.ZipFile[java.lang.String] = js.native
  /**
    * Creates a zipfile unpacker for the given random access reader.
    * This method of reading a zip file allows clients to implement their own back-end file system
    *
    * @param totalSize Indicates the total file size of the zip file
    */
  def fromRandomAccessReader(
    reader: adoneLib.adoneNs.fsNs.AbstractRandomAccessReader,
    totalSize: scala.Double,
    options: (adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.RandomAccessReaderOptions with Anon_DecodeStrings) | adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.RandomAccessReaderOptions
  ): adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.ZipFile[nodeLib.Buffer] = js.native
  /**
    * Opens a file and creates a zipfile unpacker
    */
  def open(path: java.lang.String): adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.ZipFile[java.lang.String] = js.native
  /**
    * Opens a file and creates a zipfile unpacker
    */
  def open(
    path: java.lang.String,
    options: (adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.PathOptions with Anon_DecodeStrings) | adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.PathOptions
  ): adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs.ZipFile[nodeLib.Buffer] = js.native
  /**
    * Returns null or a String error message depending on the validity of fileName
    */
  def validateFileName(filename: java.lang.String): java.lang.String | scala.Null = js.native
}

