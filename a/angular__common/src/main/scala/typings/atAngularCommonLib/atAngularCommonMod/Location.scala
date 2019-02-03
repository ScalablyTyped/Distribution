package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "Location")
@js.native
class Location protected ()
  extends atAngularCommonLib.publicUnderscoreApiMod.Location {
  def this(platformStrategy: atAngularCommonLib.srcLocationLocationUnderscoreStrategyMod.LocationStrategy) = this()
}

/* static members */
@JSImport("@angular/common", "Location")
@js.native
object Location extends js.Object {
  /**
    * Given 2 parts of a url, join them with a slash if needed.
    */
  def joinWithSlash(start: java.lang.String, end: java.lang.String): java.lang.String = js.native
  /**
    * Given a string of url parameters, prepend with '?' if needed, otherwise return parameters as
    * is.
    */
  def normalizeQueryParams(params: java.lang.String): java.lang.String = js.native
  /**
    * If url has a trailing slash, remove it, otherwise return url as is. This
    * method looks for the first occurrence of either #, ?, or the end of the
    * line as `/` characters after any of these should not be replaced.
    */
  def stripTrailingSlash(url: java.lang.String): java.lang.String = js.native
}

