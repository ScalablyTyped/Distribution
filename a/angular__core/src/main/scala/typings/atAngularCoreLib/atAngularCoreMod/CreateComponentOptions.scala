package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that control how the component should be bootstrapped. */
trait CreateComponentOptions extends js.Object {
  /**
    * Host element on which the component will be bootstrapped. If not specified,
    * the component definition's `tag` is used to query the existing DOM for the
    * element to bootstrap.
    */
  var host: js.UndefOr[RElement | java.lang.String] = js.undefined
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
  var injector: js.UndefOr[Injector] = js.undefined
  /** A custom animation player handler */
  var playerHandler: js.UndefOr[ɵPlayerHandler] = js.undefined
  /** Which renderer factory to use. */
  var rendererFactory: js.UndefOr[RendererFactory3] = js.undefined
  /** A custom sanitizer instance */
  var sanitizer: js.UndefOr[Sanitizer] = js.undefined
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

object CreateComponentOptions {
  @scala.inline
  def apply(
    host: RElement | java.lang.String = null,
    hostFeatures: js.Array[HostFeature] = null,
    injector: Injector = null,
    playerHandler: ɵPlayerHandler = null,
    rendererFactory: RendererFactory3 = null,
    sanitizer: Sanitizer = null,
    scheduler: /* work */ js.Function0[scala.Unit] => scala.Unit = null
  ): CreateComponentOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostFeatures != null) __obj.updateDynamic("hostFeatures")(hostFeatures)
    if (injector != null) __obj.updateDynamic("injector")(injector)
    if (playerHandler != null) __obj.updateDynamic("playerHandler")(playerHandler)
    if (rendererFactory != null) __obj.updateDynamic("rendererFactory")(rendererFactory)
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(sanitizer)
    if (scheduler != null) __obj.updateDynamic("scheduler")(js.Any.fromFunction1(scheduler))
    __obj.asInstanceOf[CreateComponentOptions]
  }
}

