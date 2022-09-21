package typings.ansiRegex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ansi-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.RegExp]
  inline def default(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  trait Options extends StObject {
    
    /**
    	Match only the first ANSI escape.
    	@default false
    	*/
    val onlyFirst: Boolean
  }
  object Options {
    
    inline def apply(onlyFirst: Boolean): Options = {
      val __obj = js.Dynamic.literal(onlyFirst = onlyFirst.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnlyFirst(value: Boolean): Self = StObject.set(x, "onlyFirst", value.asInstanceOf[js.Any])
    }
  }
}
