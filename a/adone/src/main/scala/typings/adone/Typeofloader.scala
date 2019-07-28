package typings.adone

import typings.adone.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofloader extends js.Object {
  val INs: js.Any = js.native
  /**
    * The same as safeLoad() but uses DEFAULT_FULL_SCHEMA by default - adds some JavaScript-specific types: !!js/function, !!js/regexp and !!js/undefined.
    * For untrusted sources, you must additionally validate object structure to avoid injections
    */
  def load(input: String): js.Any = js.native
  def load(input: String, options: Options): js.Any = js.native
  def load(input: Buffer): js.Any = js.native
  def load(input: Buffer, options: Options): js.Any = js.native
  def loadAll(input: String): js.Array[_] = js.native
  def loadAll(input: String, iterator: js.UndefOr[scala.Nothing], options: Options): js.Array[_] = js.native
  /**
    * Same as safeLoadAll() but uses DEFAULT_FULL by default
    */
  def loadAll(input: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = js.native
  def loadAll(input: String, iterator: js.Function1[/* doc */ js.Any, Unit], options: Options): Unit = js.native
  def loadAll(input: Buffer): js.Array[_] = js.native
  def loadAll(input: Buffer, iterator: js.UndefOr[scala.Nothing], options: Options): js.Array[_] = js.native
  def loadAll(input: Buffer, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = js.native
  def loadAll(input: Buffer, iterator: js.Function1[/* doc */ js.Any, Unit], options: Options): Unit = js.native
  /**
    * Same as safeLoad(), but understands multi-document sources.
    * Applies iterator to each document if specified, or returns array of documents
    */
  def safeLoad(input: String): js.Any = js.native
  def safeLoad(input: String, options: Options): js.Any = js.native
  def safeLoad(input: Buffer): js.Any = js.native
  def safeLoad(input: Buffer, options: Options): js.Any = js.native
  def safeLoadAll(input: String): js.Array[_] = js.native
  def safeLoadAll(input: String, iterator: js.UndefOr[scala.Nothing], options: Options): js.Array[_] = js.native
  /**
    * Parses string as single YAML document. Returns a JavaScript object or throws YAMLException on error.
    * By default, does not support regexps, functions and undefined.
    * This method is safe for untrusted data
    */
  def safeLoadAll(input: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = js.native
  def safeLoadAll(input: String, iterator: js.Function1[/* doc */ js.Any, Unit], options: Options): Unit = js.native
  def safeLoadAll(input: Buffer): js.Array[_] = js.native
  def safeLoadAll(input: Buffer, iterator: js.UndefOr[scala.Nothing], options: Options): js.Array[_] = js.native
  def safeLoadAll(input: Buffer, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = js.native
  def safeLoadAll(input: Buffer, iterator: js.Function1[/* doc */ js.Any, Unit], options: Options): Unit = js.native
}

