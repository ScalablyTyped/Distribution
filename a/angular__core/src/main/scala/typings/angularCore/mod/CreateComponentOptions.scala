package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options that control how the component should be bootstrapped. */
@js.native
trait CreateComponentOptions extends js.Object {
  
  /**
    * Host element on which the component will be bootstrapped. If not specified,
    * the component definition's `tag` is used to query the existing DOM for the
    * element to bootstrap.
    */
  var host: js.UndefOr[RElement | String] = js.native
  
  /**
    * List of features to be applied to the created component. Features are simply
    * functions that decorate a component with a certain behavior.
    *
    * Typically, the features in this list are features that cannot be added to the
    * other features list in the component definition because they rely on other factors.
    *
    * Example: `LifecycleHooksFeature` is a function that adds lifecycle hook capabilities
    * to root components in a tree-shakable way. It cannot be added to the component
    * features list because there's no way of knowing when the component will be used as
    * a root component.
    */
  var hostFeatures: js.UndefOr[js.Array[HostFeature]] = js.native
  
  /** Module injector for the component. If unspecified, the injector will be NULL_INJECTOR. */
  var injector: js.UndefOr[Injector] = js.native
  
  /** A custom animation player handler */
  var playerHandler: js.UndefOr[ɵPlayerHandler] = js.native
  
  /** Which renderer factory to use. */
  var rendererFactory: js.UndefOr[RendererFactory3] = js.native
  
  /** A custom sanitizer instance */
  var sanitizer: js.UndefOr[Sanitizer] = js.native
  
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
  var scheduler: js.UndefOr[js.Function1[/* work */ js.Function0[Unit], Unit]] = js.native
}
object CreateComponentOptions {
  
  @scala.inline
  def apply(): CreateComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComponentOptions]
  }
  
  @scala.inline
  implicit class CreateComponentOptionsOps[Self <: CreateComponentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHost(value: RElement | String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostFeaturesVarargs(value: HostFeature*): Self = this.set("hostFeatures", js.Array(value :_*))
    
    @scala.inline
    def setHostFeatures(value: js.Array[HostFeature]): Self = this.set("hostFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostFeatures: Self = this.set("hostFeatures", js.undefined)
    
    @scala.inline
    def setInjector(value: Injector): Self = this.set("injector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjector: Self = this.set("injector", js.undefined)
    
    @scala.inline
    def setPlayerHandler(value: ɵPlayerHandler): Self = this.set("playerHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerHandler: Self = this.set("playerHandler", js.undefined)
    
    @scala.inline
    def setRendererFactory(value: RendererFactory3): Self = this.set("rendererFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendererFactory: Self = this.set("rendererFactory", js.undefined)
    
    @scala.inline
    def setSanitizer(value: Sanitizer): Self = this.set("sanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSanitizer: Self = this.set("sanitizer", js.undefined)
    
    @scala.inline
    def setScheduler(value: /* work */ js.Function0[Unit] => Unit): Self = this.set("scheduler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScheduler: Self = this.set("scheduler", js.undefined)
  }
}
