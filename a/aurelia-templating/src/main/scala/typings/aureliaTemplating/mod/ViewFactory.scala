package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import typings.std.DocumentFragment
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ViewFactory")
@js.native
class ViewFactory protected () extends js.Object {
  /**
    * Creates an instance of ViewFactory.
    * @param template The document fragment that serves as a template for the view to be created.
    * @param instructions The instructions to be applied ot the template during the creation of a view.
    * @param resources The resources used to compile this factory.
    */
  def this(template: DocumentFragment, instructions: js.Object, resources: ViewResources_) = this()
  
  /**
    * Creates a view or returns one from the internal cache, if available.
    * @param container The container to create the view from.
    * @param createInstruction The instruction used to customize view creation.
    * @param element The custom element that hosts the view.
    * @return The created view.
    */
  def create(container: Container): View_ = js.native
  def create(container: Container, createInstruction: js.UndefOr[scala.Nothing], element: Element): View_ = js.native
  def create(container: Container, createInstruction: ViewCreateInstruction): View_ = js.native
  def create(container: Container, createInstruction: ViewCreateInstruction, element: Element): View_ = js.native
  
  /**
    * Gets a cached view if available...
    * @return A cached view or null if one isn't available.
    */
  def getCachedView(): View_ = js.native
  
  /**
    * Indicates whether this factory is currently using caching.
    */
  var isCaching: js.Any = js.native
  
  /**
    * Returns a view to the cache.
    * @param view The view to return to the cache if space is available.
    */
  def returnViewToCache(view: View_): Unit = js.native
  
  def setCacheSize(size: String, doNotOverrideIfAlreadySet: Boolean): Unit = js.native
  /**
    * Sets the cache size for this factory.
    * @param size The number of views to cache or "*" to cache all.
    * @param doNotOverrideIfAlreadySet Indicates that setting the cache should not override the setting if previously set.
    */
  def setCacheSize(size: Double, doNotOverrideIfAlreadySet: Boolean): Unit = js.native
}
