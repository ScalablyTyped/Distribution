package typings.adone

import typings.adone.adoneStrings.buffer
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmkdtemp extends js.Object {
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: String): js.Promise[String] = js.native
  def __promisify__(prefix: String, options: String): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: String, options: typings.node.Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def __promisify__(prefix: String, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
  def __promisify__(prefix: String, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
  def __promisify__(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(prefix: String, options: buffer): js.Promise[Buffer] = js.native
}

