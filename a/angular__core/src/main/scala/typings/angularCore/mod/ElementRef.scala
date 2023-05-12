package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ElementRef")
@js.native
open class ElementRef[T] protected () extends StObject {
  def this(nativeElement: T) = this()
  
  /**
    * <div class="callout is-critical">
    *   <header>Use with caution</header>
    *   <p>
    *    Use this API as the last resort when direct access to DOM is needed. Use templating and
    *    data-binding provided by Angular instead. Alternatively you can take a look at {@link
    * Renderer2} which provides an API that can be safely used.
    *   </p>
    * </div>
    */
  var nativeElement: T = js.native
}
