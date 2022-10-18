package typings.antvScale

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsInternMapMod {
  
  @JSImport("@antv/scale/lib/utils/internMap", "InternMap")
  @js.native
  open class InternMap[K, V] protected ()
    extends StObject
       with Map[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
        ] {
    def this(entries: Any) = this()
    
    /* private */ var initKey: Any = js.native
    
    /* private */ var map: Any = js.native
  }
}
