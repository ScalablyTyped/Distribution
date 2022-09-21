package typings.arrayIterate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("array-iterate/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayIterate(
    values: js.Array[Any],
    callbackFn: js.ThisFunction3[
      /* this */ Any, 
      /* value */ Any, 
      /* index */ Double, 
      /* array */ js.Array[Any], 
      Double | Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIterate")(values.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayIterate(
    values: js.Array[Any],
    callbackFn: js.ThisFunction3[
      /* this */ Any, 
      /* value */ Any, 
      /* index */ Double, 
      /* array */ js.Array[Any], 
      Double | Unit
    ],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIterate")(values.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
