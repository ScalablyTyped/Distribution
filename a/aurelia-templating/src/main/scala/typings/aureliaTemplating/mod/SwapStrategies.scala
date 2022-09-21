package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwapStrategies {
  
  @JSImport("aurelia-templating", "SwapStrategies")
  @js.native
  val ^ : js.Any = js.native
  
  inline def after(viewSlot: ViewSlot, previous: View_, callback: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(viewSlot.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def before(viewSlot: ViewSlot, previous: View_, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(viewSlot.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def `with`(viewSlot: ViewSlot, previous: View_, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("with")(viewSlot.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
}
