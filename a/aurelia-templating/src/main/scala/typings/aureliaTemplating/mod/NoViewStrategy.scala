package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "NoViewStrategy")
@js.native
/**
	* Creates an instance of NoViewStrategy.
	* @param dependencies A list of view resource dependencies of this view.
	* @param dependencyBaseUrl The base url for the view dependencies.
	*/
open class NoViewStrategy () extends StObject {
  def this(dependencies: js.Array[String | js.Function | ViewStrategyDependencyConfig]) = this()
  def this(
    dependencies: js.Array[String | js.Function | ViewStrategyDependencyConfig],
    dependencyBaseUrl: String
  ) = this()
  def this(dependencies: Unit, dependencyBaseUrl: String) = this()
  
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
  
  var moduleId: Any = js.native
}
