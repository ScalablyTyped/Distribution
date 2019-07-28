package typings.atAngularHttp.atAngularHttpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http", "Headers")
@js.native
class Headers ()
  extends typings.atAngularHttp.publicUnderscoreApiMod.Headers {
  def this(headers: StringDictionary[js.Any]) = this()
  def this(headers: typings.atAngularHttp.srcHeadersMod.Headers) = this()
}

/* static members */
@JSImport("@angular/http", "Headers")
@js.native
object Headers extends js.Object {
  /**
    * Returns a new Headers instance from the given DOMString of Response Headers
    */
  def fromResponseHeaderString(headersString: String): typings.atAngularHttp.srcHeadersMod.Headers = js.native
}

