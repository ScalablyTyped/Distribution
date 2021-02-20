package typings.arg

import org.scalablytyped.runtime.StringDictionary
import typings.arg.anon.FlagSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("arg", JSImport.Namespace)
  @js.native
  def apply[T /* <: Spec */](spec: T): Result[T] = js.native
  @JSImport("arg", JSImport.Namespace)
  @js.native
  def apply[T /* <: Spec */](spec: T, options: Options): Result[T] = js.native
  
  @JSImport("arg", "COUNT")
  @js.native
  val COUNT: Handler[Double] with FlagSymbol = js.native
  
  @JSImport("arg", "flag")
  @js.native
  def flag[T](fn: T): T with FlagSymbol = js.native
  
  type Handler[T] = js.Function3[/* value */ String, /* name */ String, /* previousValue */ js.UndefOr[T], T]
  
  @js.native
  trait Options extends StObject {
    
    var argv: js.UndefOr[js.Array[String]] = js.native
    
    var permissive: js.UndefOr[Boolean] = js.native
    
    var stopAtPositional: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      @scala.inline
      def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setPermissive(value: Boolean): Self = StObject.set(x, "permissive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissiveUndefined: Self = StObject.set(x, "permissive", js.undefined)
      
      @scala.inline
      def setStopAtPositional(value: Boolean): Self = StObject.set(x, "stopAtPositional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopAtPositionalUndefined: Self = StObject.set(x, "stopAtPositional", js.undefined)
    }
  }
  
  @js.native
  trait Result[T /* <: Spec */] extends StObject {
    
    @JSName("_")
    var _underscore: js.Array[String] = js.native
  }
  
  type Spec = StringDictionary[String | Handler[js.Any] | js.Array[Handler[js.Any]]]
}
