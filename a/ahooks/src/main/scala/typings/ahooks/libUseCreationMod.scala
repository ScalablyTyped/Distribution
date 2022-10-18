package typings.ahooks

import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseCreationMod {
  
  @JSImport("ahooks/lib/useCreation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
}
