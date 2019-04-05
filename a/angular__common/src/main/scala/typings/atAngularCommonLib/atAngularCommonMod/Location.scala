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
    * Given 2 parts of a URL, join them with a slash if needed.
    *
    * @param start  URL string
    * @param end    URL string
    *
    *
    * @returns Given URL strings joined with a slash, if needed.
    */
  def joinWithSlash(start: java.lang.String, end: java.lang.String): java.lang.String = js.native
  /**
    * Given a string of url parameters, prepend with `?` if needed, otherwise return the
    * parameters as is.
    *
    *  @param  params String of URL parameters
    *
    *  @returns URL parameters prepended with `?` or the parameters as is.
    */
  def normalizeQueryParams(params: java.lang.String): java.lang.String = js.native
  /**
    * If URL has a trailing slash, remove it, otherwise return the URL as is. The
    * method looks for the first occurrence of either `#`, `?`, or the end of the
    * line as `/` characters and removes the trailing slash if one exists.
    *
    * @param url URL string
    *
    * @returns Returns a URL string after removing the trailing slash if one exists, otherwise
    * returns the string as is.
    */
  def stripTrailingSlash(url: java.lang.String): java.lang.String = js.native
}

