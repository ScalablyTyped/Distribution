package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options that control how the component should be bootstrapped. */
@js.native
trait CreateComponentOptions extends StObject {
  
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
  implicit class CreateComponentOptionsMutableBuilder[Self <: CreateComponentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: RElement | String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostFeatures(value: js.Array[HostFeature]): Self = StObject.set(x, "hostFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostFeaturesUndefined: Self = StObject.set(x, "hostFeatures", js.undefined)
    
    @scala.inline
    def setHostFeaturesVarargs(value: HostFeature*): Self = StObject.set(x, "hostFeatures", js.Array(value :_*))
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
    
    @scala.inline
    def setPlayerHandler(value: ɵPlayerHandler): Self = StObject.set(x, "playerHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerHandlerUndefined: Self = StObject.set(x, "playerHandler", js.undefined)
    
    @scala.inline
    def setRendererFactory(value: RendererFactory3): Self = StObject.set(x, "rendererFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererFactoryUndefined: Self = StObject.set(x, "rendererFactory", js.undefined)
    
    @scala.inline
    def setSanitizer(value: Sanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
    
    @scala.inline
    def setScheduler(value: /* work */ js.Function0[Unit] => Unit): Self = StObject.set(x, "scheduler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
  }
}
