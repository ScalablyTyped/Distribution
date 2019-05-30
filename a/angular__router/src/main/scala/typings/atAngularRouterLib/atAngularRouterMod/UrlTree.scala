package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "UrlTree")
@js.native
class UrlTree () extends js.Object {
  /** The fragment of the URL */
  var fragment: java.lang.String | scala.Null = js.native
  val queryParamMap: ParamMap = js.native
  /** The query params of the URL */
  var queryParams: Params = js.native
  /** The root segment group of the URL tree */
  var root: UrlSegmentGroup = js.native
}

