package typings
package atAngularRouterLib.srcUrlUnderscoreTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/url_tree", "UrlTree")
@js.native
class UrlTree () extends js.Object {
  /** The fragment of the URL */
  var fragment: java.lang.String | scala.Null = js.native
  val queryParamMap: atAngularRouterLib.srcSharedMod.ParamMap = js.native
  /** The query params of the URL */
  var queryParams: atAngularRouterLib.srcSharedMod.Params = js.native
  /** The root segment group of the URL tree */
  var root: UrlSegmentGroup = js.native
}

