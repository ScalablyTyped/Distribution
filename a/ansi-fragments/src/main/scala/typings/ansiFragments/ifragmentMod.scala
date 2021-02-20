package typings.ansiFragments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifragmentMod {
  
  @js.native
  trait IFragment extends StObject {
    
    def build(): String = js.native
  }
  object IFragment {
    
    @scala.inline
    def apply(build: () => String): IFragment = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
      __obj.asInstanceOf[IFragment]
    }
    
    @scala.inline
    implicit class IFragmentMutableBuilder[Self <: IFragment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: () => String): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    }
  }
}
