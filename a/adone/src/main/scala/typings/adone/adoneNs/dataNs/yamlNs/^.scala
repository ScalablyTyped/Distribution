package typings.adone.adoneNs.dataNs.yamlNs

import typings.adone.adoneNs.dataNs.yamlNs.dumperNs.INs.Options
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.yaml")
@js.native
object ^ extends js.Object {
  /**
    * Same as safeDump() but without limits (uses DEFAULT_FULL by default)
    */
  val dump: js.Function2[/* input */ js.Any, /* options */ js.UndefOr[Options], String] = js.native
  /**
    * The same as safeLoad() but uses DEFAULT_FULL_SCHEMA by default - adds some JavaScript-specific types: !!js/function, !!js/regexp and !!js/undefined.
    * For untrusted sources, you must additionally validate object structure to avoid injections
    */
  val load: js.Function2[
    /* input */ String | Buffer, 
    /* options */ js.UndefOr[typings.adone.adoneNs.dataNs.yamlNs.loaderNs.INs.Options], 
    js.Any
  ] = js.native
  /**
    * Serializes object as a YAML document.
    * Uses DEFAULT_SAFE, so it will throw an exception if you try to dump regexps or functions
    */
  val safeDump: js.Function2[/* input */ js.Any, /* options */ js.UndefOr[Options], String] = js.native
  /**
    * Parses string as single YAML document. Returns a JavaScript object or throws YAMLException on error.
    * By default, does not support regexps, functions and undefined.
    * This method is safe for untrusted data
    */
  val safeLoad: js.Function2[
    /* input */ String | Buffer, 
    /* options */ js.UndefOr[typings.adone.adoneNs.dataNs.yamlNs.loaderNs.INs.Options], 
    js.Any
  ] = js.native
  /**
    * Decodes the given string/buffer using DEFAULT_SAFE scheme by default
    */
  def decode(buf: String): js.Any = js.native
  def decode(buf: String, options: typings.adone.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  def decode(buf: Buffer): js.Any = js.native
  def decode(buf: Buffer, options: typings.adone.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  /**
    * Encodes the given object using DEFAULT_SAFE scheme by default
    */
  def encode(obj: js.Any): Buffer = js.native
  def encode(obj: js.Any, options: Options): Buffer = js.native
}

