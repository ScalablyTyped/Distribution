package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "BoundViewFactory")
@js.native
class BoundViewFactory protected () extends js.Object {
  /**
      * Creates an instance of BoundViewFactory.
      * @param parentContainer The parent DI container.
      * @param viewFactory The internal unbound factory.
      * @param partReplacements Part replacement overrides for the internal factory.
      */
  def this(parentContainer: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container, viewFactory: ViewFactory) = this()
  /**
      * Creates an instance of BoundViewFactory.
      * @param parentContainer The parent DI container.
      * @param viewFactory The internal unbound factory.
      * @param partReplacements Part replacement overrides for the internal factory.
      */
  def this(parentContainer: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container, viewFactory: ViewFactory, partReplacements: js.Object) = this()
  /**
      * Indicates whether this factory is currently using caching.
      */
  var isCaching: js.Any = js.native
  /**
      * Creates a view or returns one from the internal cache, if available.
      * @return The created view.
      */
  def create(): View = js.native
  /**
      * Gets a cached view if available...
      * @return A cached view or null if one isn't available.
      */
  def getCachedView(): View = js.native
  /**
      * Returns a view to the cache.
      * @param view The view to return to the cache if space is available.
      */
  def returnViewToCache(view: View): scala.Unit = js.native
  /**
      * Sets the cache size for this factory.
      * @param size The number of views to cache or "*" to cache all.
      * @param doNotOverrideIfAlreadySet Indicates that setting the cache should not override the setting if previously set.
      */
  def setCacheSize(size: java.lang.String, doNotOverrideIfAlreadySet: scala.Boolean): scala.Unit = js.native
  /**
      * Sets the cache size for this factory.
      * @param size The number of views to cache or "*" to cache all.
      * @param doNotOverrideIfAlreadySet Indicates that setting the cache should not override the setting if previously set.
      */
  def setCacheSize(size: scala.Double, doNotOverrideIfAlreadySet: scala.Boolean): scala.Unit = js.native
}

