package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ViewFactory")
@js.native
class ViewFactory protected () extends js.Object {
  /**
      * Creates an instance of ViewFactory.
      * @param template The document fragment that serves as a template for the view to be created.
      * @param instructions The instructions to be applied ot the template during the creation of a view.
      * @param resources The resources used to compile this factory.
      */
  def this(template: stdLib.DocumentFragment, instructions: js.Object, resources: ViewResources) = this()
  /**
      * Indicates whether this factory is currently using caching.
      */
  var isCaching: js.Any = js.native
  /**
      * Creates a view or returns one from the internal cache, if available.
      * @param container The container to create the view from.
      * @param createInstruction The instruction used to customize view creation.
      * @param element The custom element that hosts the view.
      * @return The created view.
      */
  def create(container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container): View = js.native
  /**
      * Creates a view or returns one from the internal cache, if available.
      * @param container The container to create the view from.
      * @param createInstruction The instruction used to customize view creation.
      * @param element The custom element that hosts the view.
      * @return The created view.
      */
  def create(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    createInstruction: ViewCreateInstruction
  ): View = js.native
  /**
      * Creates a view or returns one from the internal cache, if available.
      * @param container The container to create the view from.
      * @param createInstruction The instruction used to customize view creation.
      * @param element The custom element that hosts the view.
      * @return The created view.
      */
  def create(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    createInstruction: ViewCreateInstruction,
    element: stdLib.Element
  ): View = js.native
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

