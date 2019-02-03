package typings
package atAngularHttpLib.srcHeadersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/headers", "Headers")
@js.native
class Headers () extends js.Object {
  def this(headers: Headers) = this()
  def this(headers: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  var mayBeSetNormalizedName: js.Any = js.native
  /**
    * Appends a header to existing list of header values for a given header name.
    */
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Deletes all header values for the given name.
    */
  def delete(name: java.lang.String): scala.Unit = js.native
  /**
    * This method is not implemented.
    */
  def entries(): scala.Unit = js.native
  def forEach(
    fn: js.Function3[
      /* values */ js.Array[java.lang.String], 
      /* name */ js.UndefOr[java.lang.String], 
      /* headers */ stdLib.Map[java.lang.String, js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns first header that matches given name.
    */
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Returns list of header values for a given name.
    */
  def getAll(name: java.lang.String): js.Array[java.lang.String] | scala.Null = js.native
  /**
    * Checks for existence of header by given name.
    */
  def has(name: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the names of the headers
    */
  def keys(): js.Array[java.lang.String] = js.native
  /**
    * Sets or overrides header value for given name.
    */
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Returns string of all headers.
    */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Returns values of all headers.
    */
  def values(): js.Array[js.Array[java.lang.String]] = js.native
}

/* static members */
@JSImport("@angular/http/src/headers", "Headers")
@js.native
object Headers extends js.Object {
  /**
    * Returns a new Headers instance from the given DOMString of Response Headers
    */
  def fromResponseHeaderString(headersString: java.lang.String): atAngularHttpLib.srcHeadersMod.Headers = js.native
}

