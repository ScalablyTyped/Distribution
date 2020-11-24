package typings.aureliaPal.mod

import org.scalablytyped.runtime.Instantiable0
import typings.aureliaPal.anon.Instantiable
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Platform extends js.Object {
  
  /**
    * Reference to the Loader Class (set after the loader has been first imported)
    */
  var Loader: js.Any = js.native
  
  /**
    * The runtime's XMLHttpRequest API.
    */
  var XMLHttpRequest: Instantiable with Instantiable0[typings.std.global.XMLHttpRequest] = js.native
  
  /**
    * Add a global event listener.
    * @param eventName A string representing the event type to listen for.
    * @param callback The function that receives a notification when an event of the specified type occurs.
    * @param capture If true, useCapture indicates that the user wishes to initiate capture.
    */
  def addEventListener(eventName: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(eventName: String, callback: EventListenerOrEventListenerObject, capture: Boolean): Unit = js.native
  
  /**
    * Iterate all modules loaded by the script loader.
    * @param callback A callback that will receive each module id along with the module object. Return true to end enumeration.
    */
  def eachModule(callback: js.Function2[/* key */ String, /* value */ js.Object, Boolean]): Unit = js.native
  
  /**
    * The runtime environment's global.
    */
  var global: js.Any = js.native
  
  /**
    * The runtime's history API.
    */
  var history: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.history */ js.Any = js.native
  
  /**
    * The runtime's location API.
    */
  var location: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.location */ js.Any = js.native
  
  /**
    * Resolves a module name to a path resolvable by the loader. By default returns the first parameter.
    * It is recommended to use this for all dynamic imports as it enables static analysis
    * and optionally allows adding custom metadata used by the build step.
    *
    * References to this method should always literally call `PLATFORM.moduleName(...)`.
    * This enables the build step to statically optimize the code by replacing the reference with a string.
    *
    * @param moduleName Absolute or relative path to the module.
    * @param options Optional options used during the static analysis that inform how to process the module.
    */
  def moduleName(moduleName: String): String = js.native
  def moduleName(moduleName: String, chunk: String): String = js.native
  def moduleName(moduleName: String, options: ModuleNameOptions): String = js.native
  
  /**
    * A function wich does nothing.
    */
  var noop: js.Function = js.native
  
  /**
    * The runtime's performance API
    */
  var performance: Performance = js.native
  
  /**
    * Remove a global event listener.
    * @param eventName A string representing the event type to listen for.
    * @param callback The function to remove from the event.
    * @param capture Specifies whether the listener to be removed was registered as a capturing listener or not.
    */
  def removeEventListener(eventName: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(eventName: String, callback: EventListenerOrEventListenerObject, capture: Boolean): Unit = js.native
  
  /**
    * Registers a function to call when the system is ready to update (repaint) the display.
    * @param callback The function to call.
    * @return A long integer value, the request id, that uniquely identifies the entry in the callback list.
    */
  def requestAnimationFrame(callback: js.Function1[/* animationFrameStart */ Double, Unit]): Double = js.native
}
