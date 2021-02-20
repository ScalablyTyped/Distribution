package typings.arraySort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-sort", JSImport.Default)
  @js.native
  def default[T](arr: js.Array[T]): js.Array[T] = js.native
  @JSImport("array-sort", JSImport.Default)
  @js.native
  def default[T](arr: js.Array[T], props: js.UndefOr[ComparisonArgs[T]], options: Options): js.Array[T] = js.native
  @JSImport("array-sort", JSImport.Default)
  @js.native
  def default[T](arr: js.Array[T], props: ComparisonArgs[T]): js.Array[T] = js.native
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  type ComparisonArg[T] = String | Comparator[T]
  
  type ComparisonArgs[T] = ComparisonArg[T] | js.Array[ComparisonArg[T]]
  
  @js.native
  trait Options extends StObject {
    
    val reverse: Boolean = js.native
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
