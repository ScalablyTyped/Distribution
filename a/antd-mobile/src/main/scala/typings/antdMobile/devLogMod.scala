package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLogMod {
  
  @JSImport("antd-mobile/es/utils/dev-log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def devError(component: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("devError")(component.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def devWarning(component: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("devWarning")(component.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
