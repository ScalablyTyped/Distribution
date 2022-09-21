package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "InlineViewStrategy")
@js.native
open class InlineViewStrategy protected () extends StObject {
  /**
  	* Creates an instance of InlineViewStrategy.
  	* @param markup The markup for the view. Be sure to include the wrapping template tag.
  	* @param dependencies A list of view resource dependencies of this view.
  	* @param dependencyBaseUrl The base url for the view dependencies.
  	*/
  def this(markup: String) = this()
  def this(markup: String, dependencies: js.Array[String | js.Function | ViewStrategyDependencyConfig]) = this()
  def this(
    markup: String,
    dependencies: js.Array[String | js.Function | ViewStrategyDependencyConfig],
    dependencyBaseUrl: String
  ) = this()
  def this(markup: String, dependencies: Unit, dependencyBaseUrl: String) = this()
  
  var dependencies: js.Array[String | ViewStrategyDependencyConfig | js.Function] = js.native
  
  var dependencyBaseUrl: String = js.native
  
  var entry: Any = js.native
  
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
  
  var markup: String = js.native
  
  var moduleId: Any = js.native
}
