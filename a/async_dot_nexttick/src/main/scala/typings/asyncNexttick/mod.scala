package typings.asyncNexttick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async.nexttick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def nextTick(callback: js.Function0[Unit], args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
