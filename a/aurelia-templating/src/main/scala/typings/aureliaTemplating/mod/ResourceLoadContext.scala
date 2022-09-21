package typings.aureliaTemplating.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ResourceLoadContext")
@js.native
/**
	* Creates an instance of ResourceLoadContext.
	*/
open class ResourceLoadContext () extends StObject {
  
  /**
  	* Tracks a dependency that is being loaded.
  	* @param url The url of the dependency.
  	*/
  def addDependency(url: String): Unit = js.native
  
  var dependencies: Record[String, Boolean] = js.native
  
  /**
  	* Checks if the current context includes a load of the specified url.
  	* @return True if the url is being loaded in the context; false otherwise.
  	*/
  def hasDependency(url: String): Boolean = js.native
}
