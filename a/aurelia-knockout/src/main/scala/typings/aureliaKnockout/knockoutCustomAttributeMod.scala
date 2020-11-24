package typings.aureliaKnockout

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-knockout/dist/commonjs/knockout-custom-attribute", JSImport.Namespace)
@js.native
object knockoutCustomAttributeMod extends js.Object {
  
  @js.native
  class KnockoutCustomAttribute protected () extends js.Object {
    def this(element: Element) = this()
    
    /** internal: do not use */
    def bind(executionContext: js.Any): Unit = js.native
    
    var element: Element = js.native
    
    /** internal: do not use */
    def unbind(): Unit = js.native
  }
  /* static members */
  @js.native
  object KnockoutCustomAttribute extends js.Object {
    
    def register(): Unit = js.native
  }
}
