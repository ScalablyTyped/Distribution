package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devWarningMod {
  
  @JSImport("antd/lib/_util/devWarning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(valid: Boolean, component: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(valid.asInstanceOf[js.Any], component.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
}
