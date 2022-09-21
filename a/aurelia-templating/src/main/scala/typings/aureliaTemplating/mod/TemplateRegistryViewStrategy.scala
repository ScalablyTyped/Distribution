package typings.aureliaTemplating.mod

import typings.aureliaLoader.mod.TemplateRegistryEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "TemplateRegistryViewStrategy")
@js.native
open class TemplateRegistryViewStrategy protected () extends StObject {
  /**
  	* Creates an instance of TemplateRegistryViewStrategy.
  	* @param moduleId The associated moduleId of the view to be loaded.
  	* @param entry The template registry entry used in loading the view factory.
  	*/
  def this(moduleId: String, entry: TemplateRegistryEntry) = this()
  
  var entry: TemplateRegistryEntry = js.native
  
  /**
  	* Loads a view factory.
  	* @param viewEngine The view engine to use during the load process.
  	* @param compileInstruction Additional instructions to use during compilation of the view.
  	* @param loadContext The loading context used for loading all resources and dependencies.
  	* @param target A class from which to extract metadata of additional resources to load.
  	* @return A promise for the view factory that is produced by this strategy.
  	*/
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction): js.Promise[ViewFactory] = js.native
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction, loadContext: Unit, target: Any): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: Any
  ): js.Promise[ViewFactory] = js.native
  
  var moduleId: String = js.native
}
