package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ConventionalViewStrategy")
@js.native
class ConventionalViewStrategy protected () extends js.Object {
  /**
      * Creates an instance of ConventionalViewStrategy.
      * @param viewLocator The view locator service for conventionally locating the view.
      * @param origin The origin of the view model to conventionally load the view for.
      */
  def this(viewLocator: ViewLocator, origin: aureliaDashMetadataLib.aureliaDashMetadataMod.Origin) = this()
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

