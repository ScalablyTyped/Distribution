package typings
package atAngularRouterLib.srcDirectivesRouterUnderscoreLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/directives/router_link", "RouterLink")
@js.native
class RouterLink protected () extends js.Object {
  def this(router: atAngularRouterLib.srcRouterMod.Router, route: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRoute, tabIndex: java.lang.String, renderer: atAngularCoreLib.atAngularCoreMod.Renderer2, el: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  var commands: js.Any = js.native
  var fragment: java.lang.String = js.native
  var preserve: js.Any = js.native
  var preserveFragment: scala.Boolean = js.native
  /**
    * @deprecated 4.0.0 use `queryParamsHandling` instead.
    */
  var preserveQueryParams: scala.Boolean = js.native
  var queryParams: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var queryParamsHandling: atAngularRouterLib.srcConfigMod.QueryParamsHandling = js.native
  var replaceUrl: scala.Boolean = js.native
  var route: js.Any = js.native
  var router: js.Any = js.native
  var routerLink: js.Array[_] | java.lang.String = js.native
  var skipLocationChange: scala.Boolean = js.native
  var state: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val urlTree: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
  def onClick(): scala.Boolean = js.native
}

