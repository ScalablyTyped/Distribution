package typings.adone

import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofreadFile extends js.Object {
  def __promisify__(path: Double): js.Promise[Buffer] = js.native
  def __promisify__(path: Double, options: String): js.Promise[String] = js.native
  def __promisify__(path: Double, options: typings.node.Anon_EncodingFlag): js.Promise[Buffer] = js.native
  def __promisify__(path: Double, options: Anon_EncodingFlagNull): js.Promise[String | Buffer] = js.native
  def __promisify__(path: Double, options: Anon_EncodingFlagString): js.Promise[String] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def __promisify__(path: PathLike): js.Promise[Buffer] = js.native
  def __promisify__(path: PathLike, options: String): js.Promise[String] = js.native
  def __promisify__(path: PathLike, options: typings.node.Anon_EncodingFlag): js.Promise[Buffer] = js.native
  def __promisify__(path: PathLike, options: Anon_EncodingFlagNull): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def __promisify__(path: PathLike, options: Anon_EncodingFlagString): js.Promise[String] = js.native
}

