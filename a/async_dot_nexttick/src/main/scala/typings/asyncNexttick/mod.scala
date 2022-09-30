package typings.asyncNexttick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async.nexttick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nextTick(callback: js.Function0[Unit], args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(scala.List(callback.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
}
