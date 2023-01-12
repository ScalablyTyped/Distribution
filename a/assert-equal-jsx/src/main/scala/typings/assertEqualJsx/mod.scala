package typings.assertEqualJsx

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(actual: Element, expected: Element): Unit = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(actual: Element, expected: Element, opts: AsssertOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("assert-equal-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AsssertOptions extends StObject {
    
    var sanitize: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  }
  object AsssertOptions {
    
    inline def apply(): AsssertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsssertOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsssertOptions] (val x: Self) extends AnyVal {
      
      inline def setSanitize(value: /* str */ String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
    }
  }
}
