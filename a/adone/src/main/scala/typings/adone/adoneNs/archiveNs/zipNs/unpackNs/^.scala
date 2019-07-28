package typings.adone.adoneNs.archiveNs.zipNs.unpackNs

import typings.adone.Anon_DecodeStrings
import typings.adone.adoneNs.archiveNs.zipNs.unpackNs.INs.BufferOptions
import typings.adone.adoneNs.archiveNs.zipNs.unpackNs.INs.FdOptions
import typings.adone.adoneNs.archiveNs.zipNs.unpackNs.INs.PathOptions
import typings.adone.adoneNs.archiveNs.zipNs.unpackNs.INs.RandomAccessReaderOptions
import typings.adone.adoneNs.archiveNs.zipNs.unpackNs.INs.ZipFile
import typings.adone.adoneNs.fsNs.AbstractRandomAccessReader
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.archive.zip.unpack")
@js.native
object ^ extends js.Object {
  /**
    * Creates a zipfile unpacker for the given buffer
    */
  def fromBuffer(buffer: Buffer): ZipFile[String] = js.native
  /**
    * Creates a zipfile unpacker for the given buffer
    */
  def fromBuffer(buffer: Buffer, options: (BufferOptions with Anon_DecodeStrings) | BufferOptions): ZipFile[Buffer] = js.native
  /**
    * Creates a zipfile unpacker for the given fd
    */
  def fromFd(fd: Double): ZipFile[String] = js.native
  /**
    * Creates a zipfile unpacker for the given fd
    */
  def fromFd(fd: Double, options: (FdOptions with Anon_DecodeStrings) | FdOptions): ZipFile[Buffer] = js.native
  /**
    * Creates a zipfile unpacker for the given random access reader.
    * This method of reading a zip file allows clients to implement their own back-end file system
    *
    * @param totalSize Indicates the total file size of the zip file
    */
  def fromRandomAccessReader(reader: AbstractRandomAccessReader, totalSize: Double): ZipFile[String] = js.native
  /**
    * Creates a zipfile unpacker for the given random access reader.
    * This method of reading a zip file allows clients to implement their own back-end file system
    *
    * @param totalSize Indicates the total file size of the zip file
    */
  def fromRandomAccessReader(
    reader: AbstractRandomAccessReader,
    totalSize: Double,
    options: (RandomAccessReaderOptions with Anon_DecodeStrings) | RandomAccessReaderOptions
  ): ZipFile[Buffer] = js.native
  /**
    * Opens a file and creates a zipfile unpacker
    */
  def open(path: String): ZipFile[String] = js.native
  /**
    * Opens a file and creates a zipfile unpacker
    */
  def open(path: String, options: (PathOptions with Anon_DecodeStrings) | PathOptions): ZipFile[Buffer] = js.native
  /**
    * Returns null or a String error message depending on the validity of fileName
    */
  def validateFileName(filename: String): String | Null = js.native
}

