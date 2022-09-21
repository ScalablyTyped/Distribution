package typings.arrayIterate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-iterate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayIterate[Value, ThisArg](values: js.Array[Value], callbackFn: CallbackFn[Value, ThisArg]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIterate")(values.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayIterate[Value, ThisArg](values: js.Array[Value], callbackFn: CallbackFn[Value, ThisArg], thisArg: ThisArg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIterate")(values.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CallbackFn[Value, ThisArg] = js.ThisFunction3[
    /* this */ ThisArg, 
    /* value */ Value, 
    /* index */ Double, 
    /* array */ js.Array[Value], 
    Double | Unit
  ]
}
