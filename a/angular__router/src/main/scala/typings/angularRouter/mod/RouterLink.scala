package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterLink")
@js.native
class RouterLink protected () extends js.Object {
  def this(router: Router, route: ActivatedRoute, tabIndex: String, renderer: Renderer2, el: ElementRef[_]) = this()
  var commands: js.Any = js.native
  var fragment: String = js.native
  var preserve: js.Any = js.native
  var preserveFragment: Boolean = js.native
  var queryParams: StringDictionary[js.Any] = js.native
  var queryParamsHandling: QueryParamsHandling = js.native
  var replaceUrl: Boolean = js.native
  var route: js.Any = js.native
  var router: js.Any = js.native
  var skipLocationChange: Boolean = js.native
  var state: js.UndefOr[StringDictionary[js.Any]] = js.native
  def onClick(): Boolean = js.native
  /**
    * @deprecated 4.0.0 use `queryParamsHandling` instead.
    */
  def preserveQueryParams(value: Boolean): js.Any = js.native
  def routerLink(commands: String): js.Any = js.native
  def routerLink(commands: js.Array[_]): js.Any = js.native
  def urlTree: UrlTree = js.native
}

