package typings.angularCommon.httpHttpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpHeaders")
@js.native
/**  Constructs a new HTTP header object with the given values.*/
class HttpHeaders () extends js.Object {
  def this(headers: String) = this()
  def this(headers: StringDictionary[String | js.Array[String]]) = this()
  var applyUpdate: js.Any = js.native
  @JSName("clone")
  var clone_FHttpHeaders: js.Any = js.native
  var copyFrom: js.Any = js.native
  /**
    * Internal map of lowercase header names to values.
    */
  var headers: js.Any = js.native
  var init: js.Any = js.native
  /**
    * Complete the lazy initialization of this object (needed before reading).
    */
  var lazyInit: js.Any = js.native
  /**
    * Queued updates to be materialized the next initialization.
    */
  var lazyUpdate: js.Any = js.native
  var maybeSetNormalizedName: js.Any = js.native
  /**
    * Internal map of lowercased header names to the normalized
    * form of the name (the form seen first).
    */
  var normalizedNames: js.Any = js.native
  /**
    * Appends a new value to the existing set of values for a header
    * and returns them in a clone of the original instance.
    *
    * @param name The header name for which to append the values.
    * @param value The value to append.
    *
    * @returns A clone of the HTTP headers object with the value appended to the given header.
    */
  def append(name: String, value: String): HttpHeaders = js.native
  def append(name: String, value: js.Array[String]): HttpHeaders = js.native
  /**
    * Deletes values for a given header in a clone of the original instance.
    *
    * @param name The header name.
    * @param value The value or values to delete for the given header.
    *
    * @returns A clone of the HTTP headers object with the given value deleted.
    */
  def delete(name: String): HttpHeaders = js.native
  def delete(name: String, value: String): HttpHeaders = js.native
  def delete(name: String, value: js.Array[String]): HttpHeaders = js.native
  /**
    * Retrieves the first value of a given header.
    *
    * @param name The header name.
    *
    * @returns The value string if the header exists, null otherwise
    */
  def get(name: String): String | Null = js.native
  /**
    * Retrieves a list of values for a given header.
    *
    * @param name The header name from which to retrieve values.
    *
    * @returns A string of values if the header exists, null otherwise.
    */
  def getAll(name: String): js.Array[String] | Null = js.native
  /**
    * Checks for existence of a given header.
    *
    * @param name The header name to check for existence.
    *
    * @returns True if the header exists, false otherwise.
    */
  def has(name: String): Boolean = js.native
  /**
    * Retrieves the names of the headers.
    *
    * @returns A list of header names.
    */
  def keys(): js.Array[String] = js.native
  /**
    * Sets or modifies a value for a given header in a clone of the original instance.
    * If the header already exists, its value is replaced with the given value
    * in the returned object.
    *
    * @param name The header name.
    * @param value The value or values to set or overide for the given header.
    *
    * @returns A clone of the HTTP headers object with the newly set header value.
    */
  def set(name: String, value: String): HttpHeaders = js.native
  def set(name: String, value: js.Array[String]): HttpHeaders = js.native
}

