package typings.antvGLite

import org.scalablytyped.runtime.Instantiable1
import typings.antvGLite.distDisplayObjectsMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomCustomElementRegistryMod {
  
  @JSImport("@antv/g-lite/dist/dom/CustomElementRegistry", "CustomElementRegistry")
  @js.native
  open class CustomElementRegistry () extends StObject {
    
    def define[T /* <: DisplayObject[Any, Any] */](name: String, constructor: Instantiable1[/* args (repeated) */ Any, T]): Unit = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/get
      */
    def get[T /* <: DisplayObject[Any, Any] */](name: String): Instantiable1[/* args (repeated) */ Any, T] = js.native
    
    /* private */ var registry: Any = js.native
  }
}
