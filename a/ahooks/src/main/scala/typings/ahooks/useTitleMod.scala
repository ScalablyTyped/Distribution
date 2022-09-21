package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTitleMod {
  
  @JSImport("ahooks/lib/useTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(title: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(title: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var restoreOnUnmount: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRestoreOnUnmount(value: Boolean): Self = StObject.set(x, "restoreOnUnmount", value.asInstanceOf[js.Any])
      
      inline def setRestoreOnUnmountUndefined: Self = StObject.set(x, "restoreOnUnmount", js.undefined)
    }
  }
}
