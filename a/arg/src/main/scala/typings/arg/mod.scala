package typings.arg

import org.scalablytyped.runtime.StringDictionary
import typings.arg.anon.FlagSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: Spec */](spec: T): Result[T] = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[Result[T]]
  @scala.inline
  def apply[T /* <: Spec */](spec: T, options: Options): Result[T] = (^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[T]]
  
  @JSImport("arg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("arg", "COUNT")
  @js.native
  val COUNT: Handler[Double] & FlagSymbol = js.native
  
  @scala.inline
  def flag[T](fn: T): T & FlagSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("flag")(fn.asInstanceOf[js.Any]).asInstanceOf[T & FlagSymbol]
  
  type Handler[T] = js.Function3[/* value */ String, /* name */ String, /* previousValue */ js.UndefOr[T], T]
  
  trait Options extends StObject {
    
    var argv: js.UndefOr[js.Array[String]] = js.undefined
    
    var permissive: js.UndefOr[Boolean] = js.undefined
    
    var stopAtPositional: js.UndefOr[Boolean] = js.undefined
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
