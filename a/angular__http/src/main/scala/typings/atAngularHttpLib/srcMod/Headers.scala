package typings
package atAngularHttpLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src", "Headers")
@js.native
class Headers ()
  extends atAngularHttpLib.srcHeadersMod.Headers {
  def this(headers: atAngularHttpLib.srcHeadersMod.Headers) = this()
  def this(headers: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
}

@JSImport("@angular/http/src", "Headers")
@js.native
object Headers extends js.Object {
  /**
    * Returns a new Headers instance from the given DOMString of Response Headers
    */
  def fromResponseHeaderString(headersString: java.lang.String): atAngularHttpLib.srcHeadersMod.Headers = js.native
}

