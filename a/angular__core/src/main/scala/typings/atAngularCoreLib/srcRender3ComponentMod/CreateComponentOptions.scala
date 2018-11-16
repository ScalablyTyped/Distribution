package typings
package atAngularCoreLib.srcRender3ComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateComponentOptions extends js.Object {
  /**
       * Host element on which the component will be bootstrapped. If not specified,
       * the component definition's `tag` is used to query the existing DOM for the
       * element to bootstrap.
       */
  var host: js.UndefOr[atAngularCoreLib.srcRender3InterfacesRendererMod.RElement | java.lang.String] = js.undefined
  /**
       * List of features to be applied to the created component. Features are simply
       * functions that decorate a component with a certain behavior.
       *
       * Typically, the features in this list are features that cannot be added to the
       * other features list in the component definition because they rely on other factors.
       *
       * Example: `RootLifecycleHooks` is a function that adds lifecycle hook capabilities
       * to root components in a tree-shakable way. It cannot be added to the component
       * features list because there's no way of knowing when the component will be used as
       * a root component.
       */
  var hostFeatures: js.UndefOr[js.Array[HostFeature]] = js.undefined
  /** Module injector for the component. If unspecified, the injector will be NULL_INJECTOR. */
  var injector: js.UndefOr[atAngularCoreLib.srcDiInjectorMod.Injector] = js.undefined
  /** A custom animation player handler */
  var playerHandler: js.UndefOr[atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerHandler] = js.undefined
  /** Which renderer factory to use. */
  var rendererFactory: js.UndefOr[atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3] = js.undefined
  /** A custom sanitizer instance */
  var sanitizer: js.UndefOr[atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer] = js.undefined
  /**
       * A function which is used to schedule change detection work in the future.
       *
       * When marking components as dirty, it is necessary to schedule the work of
       * change detection in the future. This is done to coalesce multiple
       * {@link markDirty} calls into a single changed detection processing.
       *
       * The default value of the scheduler is the `requestAnimationFrame` function.
       *
       * It is also useful to override this function for testing purposes.
       */
  var scheduler: js.UndefOr[js.Function1[/* work */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
}

