package typings
package adoneLib.adoneNs.dataNs.yamlNs.loaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.yaml.loader")
@js.native
object loaderNsMembers extends js.Object {
  /**
                   * The same as safeLoad() but uses DEFAULT_FULL_SCHEMA by default - adds some JavaScript-specific types: !!js/function, !!js/regexp and !!js/undefined.
                   * For untrusted sources, you must additionally validate object structure to avoid injections
                   */
  def load(input: java.lang.String): js.Any = js.native
  /**
                   * The same as safeLoad() but uses DEFAULT_FULL_SCHEMA by default - adds some JavaScript-specific types: !!js/function, !!js/regexp and !!js/undefined.
                   * For untrusted sources, you must additionally validate object structure to avoid injections
                   */
  def load(input: java.lang.String, options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  /**
                   * The same as safeLoad() but uses DEFAULT_FULL_SCHEMA by default - adds some JavaScript-specific types: !!js/function, !!js/regexp and !!js/undefined.
                   * For untrusted sources, you must additionally validate object structure to avoid injections
                   */
  def load(input: nodeLib.Buffer): js.Any = js.native
  /**
                   * The same as safeLoad() but uses DEFAULT_FULL_SCHEMA by default - adds some JavaScript-specific types: !!js/function, !!js/regexp and !!js/undefined.
                   * For untrusted sources, you must additionally validate object structure to avoid injections
                   */
  def load(input: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  def loadAll(input: java.lang.String): js.Array[_] = js.native
  /**
                   * Same as safeLoadAll() but uses DEFAULT_FULL by default
                   */
  def loadAll(input: java.lang.String, iterator: js.Function1[/* doc */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
                   * Same as safeLoadAll() but uses DEFAULT_FULL by default
                   */
  def loadAll(
    input: java.lang.String,
    iterator: js.Function1[/* doc */ js.Any, scala.Unit],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): scala.Unit = js.native
  def loadAll(
    input: java.lang.String,
    iterator: js.UndefOr[scala.Nothing],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): js.Array[_] = js.native
  def loadAll(input: nodeLib.Buffer): js.Array[_] = js.native
  /**
                   * Same as safeLoadAll() but uses DEFAULT_FULL by default
                   */
  def loadAll(input: nodeLib.Buffer, iterator: js.Function1[/* doc */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
                   * Same as safeLoadAll() but uses DEFAULT_FULL by default
                   */
  def loadAll(
    input: nodeLib.Buffer,
    iterator: js.Function1[/* doc */ js.Any, scala.Unit],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): scala.Unit = js.native
  def loadAll(
    input: nodeLib.Buffer,
    iterator: js.UndefOr[scala.Nothing],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): js.Array[_] = js.native
  /**
                   * Same as safeLoad(), but understands multi-document sources.
                   * Applies iterator to each document if specified, or returns array of documents
                   */
  def safeLoad(input: java.lang.String): js.Any = js.native
  /**
                   * Same as safeLoad(), but understands multi-document sources.
                   * Applies iterator to each document if specified, or returns array of documents
                   */
  def safeLoad(input: java.lang.String, options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  /**
                   * Same as safeLoad(), but understands multi-document sources.
                   * Applies iterator to each document if specified, or returns array of documents
                   */
  def safeLoad(input: nodeLib.Buffer): js.Any = js.native
  /**
                   * Same as safeLoad(), but understands multi-document sources.
                   * Applies iterator to each document if specified, or returns array of documents
                   */
  def safeLoad(input: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  def safeLoadAll(input: java.lang.String): js.Array[_] = js.native
  /**
                   * Parses string as single YAML document. Returns a JavaScript object or throws YAMLException on error.
                   * By default, does not support regexps, functions and undefined.
                   * This method is safe for untrusted data
                   */
  def safeLoadAll(input: java.lang.String, iterator: js.Function1[/* doc */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
                   * Parses string as single YAML document. Returns a JavaScript object or throws YAMLException on error.
                   * By default, does not support regexps, functions and undefined.
                   * This method is safe for untrusted data
                   */
  def safeLoadAll(
    input: java.lang.String,
    iterator: js.Function1[/* doc */ js.Any, scala.Unit],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): scala.Unit = js.native
  def safeLoadAll(
    input: java.lang.String,
    iterator: js.UndefOr[scala.Nothing],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): js.Array[_] = js.native
  def safeLoadAll(input: nodeLib.Buffer): js.Array[_] = js.native
  /**
                   * Parses string as single YAML document. Returns a JavaScript object or throws YAMLException on error.
                   * By default, does not support regexps, functions and undefined.
                   * This method is safe for untrusted data
                   */
  def safeLoadAll(input: nodeLib.Buffer, iterator: js.Function1[/* doc */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
                   * Parses string as single YAML document. Returns a JavaScript object or throws YAMLException on error.
                   * By default, does not support regexps, functions and undefined.
                   * This method is safe for untrusted data
                   */
  def safeLoadAll(
    input: nodeLib.Buffer,
    iterator: js.Function1[/* doc */ js.Any, scala.Unit],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): scala.Unit = js.native
  def safeLoadAll(
    input: nodeLib.Buffer,
    iterator: js.UndefOr[scala.Nothing],
    options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
  ): js.Array[_] = js.native
}

