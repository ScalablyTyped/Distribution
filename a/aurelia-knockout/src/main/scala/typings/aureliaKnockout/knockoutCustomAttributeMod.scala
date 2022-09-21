package typings.aureliaKnockout

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object knockoutCustomAttributeMod {
  
  @JSImport("aurelia-knockout/dist/commonjs/knockout-custom-attribute", "KnockoutCustomAttribute")
  @js.native
  open class KnockoutCustomAttribute protected () extends StObject {
    def this(element: Element) = this()
    
    /** internal: do not use */
    def bind(executionContext: Any): Unit = js.native
    
    var element: Element = js.native
    
    /** internal: do not use */
    def unbind(): Unit = js.native
  }
  /* static members */
  object KnockoutCustomAttribute {
    
    @JSImport("aurelia-knockout/dist/commonjs/knockout-custom-attribute", "KnockoutCustomAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  }
}
