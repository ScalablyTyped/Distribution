package typings.aureliaTemplating.mod

import typings.std.HTMLTemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "StaticViewStrategy")
@js.native
open class StaticViewStrategy protected () extends StObject {
  def this(config: String) = this()
  def this(config: IStaticViewConfig) = this()
  def this(config: HTMLTemplateElement) = this()
  
  var factory: ViewFactory = js.native
  
  var factoryIsReady: Boolean = js.native
  
  /**
  	* Loads a view factory.
  	* @param viewEngine The view engine to use during the load process.
  	* @param compileInstruction Additional instructions to use during compilation of the view.
  	* @param loadContext The loading context used for loading all resources and dependencies.
  	* @param target A class from which to extract metadata of additional resources to load.
  	* @return A promise for the view factory that is produced by this strategy.
  	*/
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: Any
  ): js.Promise[ViewFactory] = js.native
  
  var moduleId: String = js.native
  
  var onReady: Any = js.native
}
