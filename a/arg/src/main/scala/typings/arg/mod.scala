package typings.arg

import org.scalablytyped.runtime.StringDictionary
import typings.arg.anon.FlagSymbol
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: Spec */](spec: T): Result[T] = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[Result[T]]
  inline def apply[T /* <: Spec */](spec: T, options: Options): Result[T] = (^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[T]]
  
  @JSImport("arg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("arg", "ArgError")
  @js.native
  open class ArgError protected ()
    extends StObject
       with Error {
    def this(message: String, code: String) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("arg", "COUNT")
  @js.native
  val COUNT: Handler[Double] & FlagSymbol = js.native
  
  inline def flag[T](fn: T): T & FlagSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("flag")(fn.asInstanceOf[js.Any]).asInstanceOf[T & FlagSymbol]
  
  @JSImport("arg", "flagSymbol")
  @js.native
  val flagSymbol: js.Symbol = js.native
  
  type Handler[T] = js.Function3[/* value */ String, /* name */ String, /* previousValue */ js.UndefOr[T], T]
  
  trait Options extends StObject {
    
    var argv: js.UndefOr[js.Array[String]] = js.undefined
    
    var permissive: js.UndefOr[Boolean] = js.undefined
    
    var stopAtPositional: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setPermissive(value: Boolean): Self = StObject.set(x, "permissive", value.asInstanceOf[js.Any])
      
      inline def setPermissiveUndefined: Self = StObject.set(x, "permissive", js.undefined)
      
      inline def setStopAtPositional(value: Boolean): Self = StObject.set(x, "stopAtPositional", value.asInstanceOf[js.Any])
      
      inline def setStopAtPositionalUndefined: Self = StObject.set(x, "stopAtPositional", js.undefined)
    }
  }
  
  @js.native
  trait Result[T /* <: Spec */] extends StObject {
    
    @JSName("_")
    var _underscore: js.Array[String] = js.native
  }
  
  type Spec = StringDictionary[String | Handler[Any] | js.Array[Handler[Any]]]
}
