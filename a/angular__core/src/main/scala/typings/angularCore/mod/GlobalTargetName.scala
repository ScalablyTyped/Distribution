package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The goal here is to make sure that the browser DOM API is the Renderer.
  * We do this by defining a subset of DOM API to be the renderer and then
  * use that at runtime for rendering.
  *
  * At runtime we can then use the DOM api directly, in server or web-worker
  * it will be easy to implement such API.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreStrings.document
  - typings.angularCore.angularCoreStrings.window
  - typings.angularCore.angularCoreStrings.body
*/
trait GlobalTargetName extends StObject
object GlobalTargetName {
  
  inline def body: typings.angularCore.angularCoreStrings.body = "body".asInstanceOf[typings.angularCore.angularCoreStrings.body]
  
  inline def document: typings.angularCore.angularCoreStrings.document = "document".asInstanceOf[typings.angularCore.angularCoreStrings.document]
  
  inline def window: typings.angularCore.angularCoreStrings.window = "window".asInstanceOf[typings.angularCore.angularCoreStrings.window]
}
