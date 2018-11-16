package typings
package atAngularRouterLib.srcDirectivesRouterUnderscoreLinkUnderscoreActiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/directives/router_link_active", "RouterLinkActive")
@js.native
class RouterLinkActive protected ()
  extends atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnChanges
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnDestroy
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.AfterContentInit {
  def this(router: atAngularRouterLib.srcRouterMod.Router, element: atAngularCoreLib.coreMod.ElementRef[_], renderer: atAngularCoreLib.coreMod.Renderer2, cdr: atAngularCoreLib.coreMod.ChangeDetectorRef) = this()
  var cdr: js.Any = js.native
  var classes: js.Any = js.native
  var element: js.Any = js.native
  var hasActiveLinks: js.Any = js.native
  val isActive: scala.Boolean = js.native
  var isLinkActive: js.Any = js.native
  var links: atAngularCoreLib.coreMod.QueryList[atAngularRouterLib.srcDirectivesRouterUnderscoreLinkMod.RouterLink] = js.native
  var linksWithHrefs: atAngularCoreLib.coreMod.QueryList[atAngularRouterLib.srcDirectivesRouterUnderscoreLinkMod.RouterLinkWithHref] = js.native
  var renderer: js.Any = js.native
  var router: js.Any = js.native
  var routerLinkActive: js.Array[java.lang.String] | java.lang.String = js.native
  var routerLinkActiveOptions: atAngularRouterLib.Anon_Exact = js.native
  var subscription: js.Any = js.native
  var update: js.Any = js.native
  /**
       * A callback method that is invoked immediately after
       * Angular has completed initialization of all of the directive's
       * content.
       * It is invoked only once when the directive is instantiated.
       */
  /* CompleteClass */
  override def ngAfterContentInit(): scala.Unit = js.native
  /**
       * A callback method that is invoked immediately after the
       * default change detector has checked data-bound properties
       * if at least one has changed, and before the view and content
       * children are checked.
       * @param changes The changed properties.
       */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.SimpleChanges): scala.Unit = js.native
  /**
       * A callback method that performs custom clean-up, invoked immediately
       * after a directive, pipe, or service instance is destroyed.
       */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
}

