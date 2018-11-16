package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "InlineViewStrategy")
@js.native
class InlineViewStrategy protected () extends js.Object {
  /**
      * Creates an instance of InlineViewStrategy.
      * @param markup The markup for the view. Be sure to include the wrapping template tag.
      * @param dependencies A list of view resource dependencies of this view.
      * @param dependencyBaseUrl The base url for the view dependencies.
      */
  def this(markup: java.lang.String) = this()
  /**
      * Creates an instance of InlineViewStrategy.
      * @param markup The markup for the view. Be sure to include the wrapping template tag.
      * @param dependencies A list of view resource dependencies of this view.
      * @param dependencyBaseUrl The base url for the view dependencies.
      */
  def this(markup: java.lang.String, dependencies: js.Array[java.lang.String | js.Function | js.Object]) = this()
  /**
      * Creates an instance of InlineViewStrategy.
      * @param markup The markup for the view. Be sure to include the wrapping template tag.
      * @param dependencies A list of view resource dependencies of this view.
      * @param dependencyBaseUrl The base url for the view dependencies.
      */
  def this(markup: java.lang.String, dependencies: js.Array[java.lang.String | js.Function | js.Object], dependencyBaseUrl: java.lang.String) = this()
  /**
      * Loads a view factory.
      * @param viewEngine The view engine to use during the load process.
      * @param compileInstruction Additional instructions to use during compilation of the view.
      * @param loadContext The loading context used for loading all resources and dependencies.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the view factory that is produced by this strategy.
      */
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction): stdLib.Promise[ViewFactory] = js.native
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
  ): stdLib.Promise[ViewFactory] = js.native
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
  ): stdLib.Promise[ViewFactory] = js.native
}

