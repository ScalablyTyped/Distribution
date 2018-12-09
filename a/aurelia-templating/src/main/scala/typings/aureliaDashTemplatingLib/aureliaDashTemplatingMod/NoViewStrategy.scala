package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "NoViewStrategy")
@js.native
class NoViewStrategy () extends js.Object {
  /**
      * Creates an instance of NoViewStrategy.
      * @param dependencies A list of view resource dependencies of this view.
      * @param dependencyBaseUrl The base url for the view dependencies.
      */
  def this(dependencies: js.Array[java.lang.String | js.Function | js.Object]) = this()
  /**
      * Creates an instance of NoViewStrategy.
      * @param dependencies A list of view resource dependencies of this view.
      * @param dependencyBaseUrl The base url for the view dependencies.
      */
  def this(dependencies: js.Array[java.lang.String | js.Function | js.Object], dependencyBaseUrl: java.lang.String) = this()
  /**
      * Loads a view factory.
      * @param viewEngine The view engine to use during the load process.
      * @param compileInstruction Additional instructions to use during compilation of the view.
      * @param loadContext The loading context used for loading all resources and dependencies.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the view factory that is produced by this strategy.
      */
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction): js.Promise[ViewFactory] = js.native
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
    loadContext: ResourceLoadContext
  ): js.Promise[ViewFactory] = js.native
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
    target: js.Any
  ): js.Promise[ViewFactory] = js.native
}

