package typings.amazonConnectStreams.connect

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRegistry extends StObject {
  
  /** Saves app data to memory. */
  def register(appName: String, config: AppRegistryOptions, containerDOM: HTMLElement): Unit
  
  /** Initializes the app by calling the init method defined in the creator. */
  def start(appName: String, creator: AppCreator): Unit
  
  /** Destoys the app by calling the destroy method defined in the creator. */
  def stop(): Unit
}
object AppRegistry {
  
  inline def apply(
    register: (String, AppRegistryOptions, HTMLElement) => Unit,
    start: (String, AppCreator) => Unit,
    stop: () => Unit
  ): AppRegistry = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction3(register), start = js.Any.fromFunction2(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[AppRegistry]
  }
  
  extension [Self <: AppRegistry](x: Self) {
    
    inline def setRegister(value: (String, AppRegistryOptions, HTMLElement) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction3(value))
    
    inline def setStart(value: (String, AppCreator) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
