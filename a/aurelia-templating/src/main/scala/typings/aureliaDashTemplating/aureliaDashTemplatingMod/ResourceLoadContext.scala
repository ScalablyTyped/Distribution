package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ResourceLoadContext")
@js.native
/**
  * Creates an instance of ResourceLoadContext.
  */
class ResourceLoadContext () extends js.Object {
  var dependencies: js.Object = js.native
  /**
    * Tracks a dependency that is being loaded.
    * @param url The url of the dependency.
    */
  def addDependency(url: String): Unit = js.native
  /**
    * Checks if the current context includes a load of the specified url.
    * @return True if the url is being loaded in the context; false otherwise.
    */
  def hasDependency(url: String): Boolean = js.native
}

