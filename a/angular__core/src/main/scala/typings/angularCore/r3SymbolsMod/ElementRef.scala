package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A wrapper around a native element inside of a View.
  *
  * An `ElementRef` is backed by a render-specific element. In the browser, this is usually a DOM
  * element.
  *
  * @security Permitting direct access to the DOM can make your application more vulnerable to
  * XSS attacks. Carefully review any use of `ElementRef` in your code. For more detail, see the
  * [Security Guide](http://g.co/ng/security).
  *
  * @publicApi
  */
@js.native
trait ElementRef[T] extends js.Object {
  
  /**
    * The underlying native element or `null` if direct access to native elements is not supported
    * (e.g. when the application runs in a web worker).
    *
    * <div class="callout is-critical">
    *   <header>Use with caution</header>
    *   <p>
    *    Use this API as the last resort when direct access to DOM is needed. Use templating and
    *    data-binding provided by Angular instead. Alternatively you can take a look at {@link
    * Renderer2}
    *    which provides API that can safely be used even when direct access to native elements is not
    *    supported.
    *   </p>
    *   <p>
    *    Relying on direct DOM access creates tight coupling between your application and rendering
    *    layers which will make it impossible to separate the two and deploy your application into a
    *    web worker.
    *   </p>
    * </div>
    *
    */
  var nativeElement: T = js.native
}
object ElementRef {
  
  @scala.inline
  def apply[T](nativeElement: T): ElementRef[T] = {
    val __obj = js.Dynamic.literal(nativeElement = nativeElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementRef[T]]
  }
  
  @scala.inline
  implicit class ElementRefOps[Self <: ElementRef[_], T] (val x: Self with ElementRef[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNativeElement(value: T): Self = this.set("nativeElement", value.asInstanceOf[js.Any])
  }
}
