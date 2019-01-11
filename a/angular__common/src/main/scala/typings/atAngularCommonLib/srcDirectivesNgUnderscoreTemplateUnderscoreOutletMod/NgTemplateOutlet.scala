package typings
package atAngularCommonLib.srcDirectivesNgUnderscoreTemplateUnderscoreOutletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/directives/ng_template_outlet", "NgTemplateOutlet")
@js.native
class NgTemplateOutlet protected ()
  extends atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnChanges {
  def this(_viewContainerRef: atAngularCoreLib.atAngularCoreMod.ViewContainerRef) = this()
  var _hasContextShapeChanged: js.Any = js.native
  /**
    * We need to re-create existing embedded view if:
    * - templateRef has changed
    * - context has changes
    *
    * We mark context object as changed when the corresponding object
    * shape changes (new properties are added or existing properties are removed).
    * In other words we consider context with the same properties as "the same" even
    * if object reference changes (see https://github.com/angular/angular/issues/13407).
    */
  var _shouldRecreateView: js.Any = js.native
  var _updateExistingContext: js.Any = js.native
  var _viewContainerRef: js.Any = js.native
  var _viewRef: js.Any = js.native
  var ngTemplateOutlet: atAngularCoreLib.atAngularCoreMod.TemplateRef[_] = js.native
  var ngTemplateOutletContext: js.Object = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.SimpleChanges): scala.Unit = js.native
}

