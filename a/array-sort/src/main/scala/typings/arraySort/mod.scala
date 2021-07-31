package typings.arraySort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def default[T](arr: js.Array[T], props: Unit, options: Options): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def default[T](arr: js.Array[T], props: ComparisonArgs[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def default[T](arr: js.Array[T], props: ComparisonArgs[T], options: Options): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  type ComparisonArg[T] = String | Comparator[T]
  
  type ComparisonArgs[T] = ComparisonArg[T] | js.Array[ComparisonArg[T]]
  
  trait Options extends StObject {
    
    val reverse: Boolean
  }
  object Options {
    
    @scala.inline
    def apply(reverse: Boolean): Options = {
      val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    }
  }
}
