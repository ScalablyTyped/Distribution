package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BufferOptions extends js.Object {
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def `__promisify__`(prefix: java.lang.String): js.Promise[java.lang.String] = js.native
  def `__promisify__`(prefix: java.lang.String, options: java.lang.String): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def `__promisify__`(prefix: java.lang.String, options: nodeLib.Anon_BufferEncoding): js.Promise[nodeLib.Buffer] = js.native
  def `__promisify__`(prefix: java.lang.String, options: nodeLib.Anon_EncodingBufferEncoding): js.Promise[java.lang.String] = js.native
  def `__promisify__`(prefix: java.lang.String, options: nodeLib.Anon_EncodingNull): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  def `__promisify__`(prefix: java.lang.String, options: nodeLib.BufferEncoding): js.Promise[java.lang.String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(prefix: java.lang.String, options: adoneLib.adoneLibStrings.buffer): js.Promise[nodeLib.Buffer] = js.native
}

