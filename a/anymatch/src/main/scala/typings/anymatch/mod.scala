package typings.anymatch

import typings.anymatch.anymatchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anymatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(matchers: AnymatchMatcher): AnymatchTester = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(matchers.asInstanceOf[js.Any]).asInstanceOf[AnymatchTester]
  inline def default(matchers: AnymatchMatcher, testString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(matchers.asInstanceOf[js.Any], testString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(matchers: AnymatchMatcher, testString: String, returnIndex: PicomatchOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(matchers.asInstanceOf[js.Any], testString.asInstanceOf[js.Any], returnIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(matchers: AnymatchMatcher, testString: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(matchers.asInstanceOf[js.Any], testString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(matchers: AnymatchMatcher, testString: js.Array[Any], returnIndex: PicomatchOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(matchers.asInstanceOf[js.Any], testString.asInstanceOf[js.Any], returnIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def default_true(matchers: AnymatchMatcher, testString: String, returnIndex: `true`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(matchers.asInstanceOf[js.Any], testString.asInstanceOf[js.Any], returnIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default_true(matchers: AnymatchMatcher, testString: js.Array[Any], returnIndex: `true`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(matchers.asInstanceOf[js.Any], testString.asInstanceOf[js.Any], returnIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type AnymatchFn = js.Function1[/* testString */ String, Boolean]
  
  type AnymatchMatcher = AnymatchPattern | js.Array[AnymatchPattern]
  
  type AnymatchPattern = String | js.RegExp | AnymatchFn
  
  @js.native
  trait AnymatchTester extends StObject {
    
    def apply(testString: String): Boolean = js.native
    def apply(testString: String, returnIndex: `true`): Double = js.native
    def apply(testString: js.Array[Any]): Boolean = js.native
    def apply(testString: js.Array[Any], returnIndex: `true`): Double = js.native
  }
  
  trait PicomatchOptions extends StObject {
    
    var dot: Boolean
  }
  object PicomatchOptions {
    
    inline def apply(dot: Boolean): PicomatchOptions = {
      val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any])
      __obj.asInstanceOf[PicomatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PicomatchOptions] (val x: Self) extends AnyVal {
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
    }
  }
}
