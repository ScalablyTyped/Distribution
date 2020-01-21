package typings.aureliaKnockout

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout/dist/commonjs/knockout-custom-attribute", JSImport.Namespace)
@js.native
object knockoutCustomAttributeMod extends js.Object {
  @js.native
  class KnockoutCustomAttribute protected () extends js.Object {
    def this(element: Element) = this()
    var element: Element = js.native
    /** internal: do not use */
    def bind(executionContext: js.Any): Unit = js.native
    /** internal: do not use */
    def unbind(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object KnockoutCustomAttribute extends js.Object {
    def register(): Unit = js.native
  }
  
}

