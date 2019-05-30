package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterLinkWithHref")
@js.native
class RouterLinkWithHref protected ()
  extends atAngularCoreLib.atAngularCoreMod.OnChanges
     with atAngularCoreLib.atAngularCoreMod.OnDestroy {
  def this(router: Router, route: ActivatedRoute, locationStrategy: atAngularCommonLib.atAngularCommonMod.LocationStrategy) = this()
  var commands: js.Any = js.native
  var fragment: java.lang.String = js.native
  var href: java.lang.String = js.native
  var locationStrategy: js.Any = js.native
  var preserve: js.Any = js.native
  var preserveFragment: scala.Boolean = js.native
  var preserveQueryParams: scala.Boolean = js.native
  var queryParams: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var queryParamsHandling: QueryParamsHandling = js.native
  var replaceUrl: scala.Boolean = js.native
  var route: js.Any = js.native
  var router: js.Any = js.native
  var routerLink: js.Array[_] | java.lang.String = js.native
  var skipLocationChange: scala.Boolean = js.native
  var state: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  var subscription: js.Any = js.native
  var target: java.lang.String = js.native
  var updateTargetUrlAndHref: js.Any = js.native
  val urlTree: UrlTree = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.atAngularCoreMod.SimpleChanges): scala.Unit = js.native
  def ngOnChanges(changes: js.Object): js.Any = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
  def onClick(button: scala.Double, ctrlKey: scala.Boolean, metaKey: scala.Boolean, shiftKey: scala.Boolean): scala.Boolean = js.native
}

