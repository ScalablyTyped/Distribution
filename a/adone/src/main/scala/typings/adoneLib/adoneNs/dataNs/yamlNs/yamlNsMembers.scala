package typings
package adoneLib.adoneNs.dataNs.yamlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.yaml")
@js.native
object yamlNsMembers extends js.Object {
  /**
               * Same as safeDump() but without limits (uses DEFAULT_FULL by default)
               */
  val dump: js.Function2[
    /* input */ js.Any, 
    /* options */ js.UndefOr[adoneLib.adoneNs.dataNs.yamlNs.dumperNs.INs.Options], 
    java.lang.String
  ] = js.native
  /**
               * The same as safeLoad() but uses DEFAULT_FULL_SCHEMA by default - adds some JavaScript-specific types: !!js/function, !!js/regexp and !!js/undefined.
               * For untrusted sources, you must additionally validate object structure to avoid injections
               */
  val load: js.Function2[
    /* input */ java.lang.String | nodeLib.Buffer, 
    /* options */ js.UndefOr[adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options], 
    js.Any
  ] = js.native
  /**
               * Same as safeLoadAll() but uses DEFAULT_FULL by default
               */
  val loadAll: js.Function3[
    /* input */ java.lang.String | nodeLib.Buffer, 
    /* iterator */ js.UndefOr[scala.Nothing], 
    /* options */ js.UndefOr[adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options], 
    js.Array[js.Any]
  ] = js.native
  /**
               * Serializes object as a YAML document.
               * Uses DEFAULT_SAFE, so it will throw an exception if you try to dump regexps or functions
               */
  val safeDump: js.Function2[
    /* input */ js.Any, 
    /* options */ js.UndefOr[adoneLib.adoneNs.dataNs.yamlNs.dumperNs.INs.Options], 
    java.lang.String
  ] = js.native
  /**
               * Parses string as single YAML document. Returns a JavaScript object or throws YAMLException on error.
               * By default, does not support regexps, functions and undefined.
               * This method is safe for untrusted data
               */
  val safeLoad: js.Function2[
    /* input */ java.lang.String | nodeLib.Buffer, 
    /* options */ js.UndefOr[adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options], 
    js.Any
  ] = js.native
  /**
               * Same as safeLoad(), but understands multi-document sources.
               * Applies iterator to each document if specified, or returns array of documents
               */
  val safeLoadAll: js.Function3[
    /* input */ java.lang.String | nodeLib.Buffer, 
    /* iterator */ js.UndefOr[scala.Nothing], 
    /* options */ js.UndefOr[adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options], 
    js.Array[js.Any]
  ] = js.native
  /**
               * Decodes the given string/buffer using DEFAULT_SAFE scheme by default
               */
  def decode(buf: java.lang.String): js.Any = js.native
  /**
               * Decodes the given string/buffer using DEFAULT_SAFE scheme by default
               */
  def decode(buf: java.lang.String, options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  /**
               * Decodes the given string/buffer using DEFAULT_SAFE scheme by default
               */
  def decode(buf: nodeLib.Buffer): js.Any = js.native
  /**
               * Decodes the given string/buffer using DEFAULT_SAFE scheme by default
               */
  def decode(buf: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  /**
               * Encodes the given object using DEFAULT_SAFE scheme by default
               */
  def encode(obj: js.Any): nodeLib.Buffer = js.native
  /**
               * Encodes the given object using DEFAULT_SAFE scheme by default
               */
  def encode(obj: js.Any, options: adoneLib.adoneNs.dataNs.yamlNs.dumperNs.INs.Options): nodeLib.Buffer = js.native
}

